package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.*;
import org.openqa.selenium.WebDriver;

public class MainApp {

    static WebDriver driver;

    public static void main(String[] args) {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        InventoryPage inventoryPage = new InventoryPage();
        inventoryPage.inventory();

        CartPage cartPage = new CartPage();
        cartPage.Cart();

        CheckOutPage checkOutPage = new CheckOutPage();
        checkOutPage.CheckOut();

        CheckOutStepTwoPage checkOutStepTwoPage = new CheckOutStepTwoPage();
        checkOutStepTwoPage.setFinish();

        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();

    }
}