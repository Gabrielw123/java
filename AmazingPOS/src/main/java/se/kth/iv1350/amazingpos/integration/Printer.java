package se.kth.iv1350.amazingpos.integration;

import se.kth.iv1350.amazingpos.model.*;

/**
 * A printer. This class sends information to an external printer.
 */
public class Printer {
    
	public Printer() {
    }
    /**
     * Prints a recepit which in turns just prints a command.
     * @param receipt The recepit.
     */
    public void print(Receipt receipt) {
        System.out.println("Receipt printed");
    }
}