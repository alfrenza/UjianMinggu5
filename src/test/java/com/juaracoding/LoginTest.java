package com.juaracoding;

import com.juaracoding.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    InventoryPage inventoryPage = new InventoryPage();

    @Test
    public void testLogin(){
        inventoryPage.setBanner("Swag Labs");
        Assert.assertEquals(inventoryPage.getBanner(), "Not Swag Labs");
    }

}
