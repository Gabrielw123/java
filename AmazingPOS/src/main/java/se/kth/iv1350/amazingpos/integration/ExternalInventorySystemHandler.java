package se.kth.iv1350.amazingpos.integration;

import se.kth.iv1350.amazingpos.model.*;
import java.util.*;

/**
 * External inventory system handler, handles the inventory database.
 */
public class ExternalInventorySystemHandler {
	private List<Item> storeItems = new ArrayList<>();
	private List<ItemDTO> itemDTOs = new ArrayList<>();
	
	public ExternalInventorySystemHandler() {
	}

	/**
	 * Adds items to the store inventory.
	 * (Description, price, VAT)
	 */
	public void addItem() {
		this.itemDTOs.add(new ItemDTO("Karrékotlett med Ben Skivad ca 1kg ICA", 87, 12)); 
		this.itemDTOs.add(new ItemDTO("Mozzarella 125g Galbani", 17, 2));
		this.itemDTOs.add(new ItemDTO("Korvbröd 10-p 270g Korvbrödsbagarn", 17, 2));
		this.itemDTOs.add(new ItemDTO("Apelsinjuice med fruktkött 900ml Innocent", 29, 4));

		this.storeItems.add(new Item(1, itemDTOs.get(0), 100));
		this.storeItems.add(new Item(2, itemDTOs.get(1), 100));
		this.storeItems.add(new Item(3, itemDTOs.get(2), 100));
		this.storeItems.add(new Item(4, itemDTOs.get(3), 100));
	}

	/**
	 * Searches for an item in the inventory system using an identifier.
	 * @param itemIdentifier the item's identifier.
	 * @return Returns item if found, otherwise returns null.
	 */
	public Item search(int itemIdentifier) {
		for (Item item : storeItems) {
			if (item.getItemIdentifier() == itemIdentifier) {
					return item;
			}
		}
		return null;
	}

	/**
	 * Updates the inventory based on the items sold in a sale.
	 * @param sale The sale containing the sale information.
	 */
	public void update(Sale sale) {
		List<Item> items = sale.getItems();
		List<Integer> itemsQuantity = sale.getCustomerItemsQuantity();

		for (Item item : items) {
			for (Item item2 : storeItems) {
				if (item == item2) {
					storeItems.get(storeItems.indexOf(item2)).updateQuantity(itemsQuantity.get(items.indexOf(item)));
				}
			}
		}
	}
	
	/**
	 * Returns the store items.
	 * @return storeItems, All if the items in the store.
	 */
	public List<Item> getItems(){
		return this.storeItems;
	}
}