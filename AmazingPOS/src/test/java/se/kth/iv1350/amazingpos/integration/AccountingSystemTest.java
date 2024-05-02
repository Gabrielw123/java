package se.kth.iv1350.amazingpos.integration;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import se.kth.iv1350.amazingpos.controller.Controller;
import se.kth.iv1350.amazingpos.view.View;

public class AccountingSystemTest {
    private ByteArrayOutputStream outContent;
    private PrintStream originalSysOut;

    public AccountingSystemTest() {
    }
    
    
    @BeforeEach
    public void setUpStreams() {
        originalSysOut = System.out;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }
    @AfterEach
    public void cleanUpStreams() {
        outContent = null;
        System.setOut(originalSysOut);
    }
    
    
    
    /**
     * Test of saveSaleInformation method, of class AccountingSystem.
     */
    @Test
    public void testSaveSaleInformation() {
        
     
        String expResult = "(Accountingsystem updated)";
        String result = outContent.toString();
        assertTrue(result.contains(expResult));
    }
    
}