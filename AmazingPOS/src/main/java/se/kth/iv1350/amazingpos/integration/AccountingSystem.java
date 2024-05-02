package se.kth.iv1350.amazingpos.integration;

import se.kth.iv1350.amazingpos.model.*;
import se.kth.iv1350.amazingpos.view.View;
import se.kth.iv1350.amazingpos.controller.Controller;
import se.kth.iv1350.amazingpos.integration.*;

/**
 * External accounting system handler, handles store balance.
 */
public class AccountingSystem {
    private int storeBalance;
    
    /**
     * Updates store balance with the satrting amount.
     */
    public AccountingSystem() {
        this.storeBalance = 100; //Starting value
    }
    
    /**
     * Updates the store balance with amount.
     * @param amount Money recived from the sale.
     */
    public void update(double amount) {
    	this.storeBalance += amount;
    }
    
    /**
     * Returns store balance.
     * @return returns store balance.
     */
    public int getStoreBalance() {
    	return this.storeBalance;
    }
}