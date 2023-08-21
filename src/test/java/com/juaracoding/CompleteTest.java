package com.juaracoding;

import com.juaracoding.pages.CheckOutComplete;
import com.juaracoding.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompleteTest {

    CheckOutComplete checkOutComplete = new CheckOutComplete();

    @Test
    public void testLogin(){
        checkOutComplete.setHeader("Thank you for your order!");
            Assert.assertEquals(checkOutComplete.getHeader(), "Thank you for not order!");
    }

}