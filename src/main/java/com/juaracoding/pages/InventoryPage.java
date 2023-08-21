package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

    private WebDriver driver;

    public InventoryPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator FindBy
    @FindBy(xpath =  "//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
    WebElement FleeJacket;

    @FindBy(xpath =  "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
    WebElement BikeLight;

    @FindBy(xpath =  "//*[@id=\"shopping_cart_container\"]/a/span")
    WebElement AddToCart;

    //Costum method
    public void inventory(){
        FleeJacket.click();
        BikeLight.click();
        AddToCart.click();
    }

    private String banner;

    @FindBy(xpath =  "//*[@id=\"header_container\"]/div[1]/div[2]/div")
    WebElement banner2;

    public String getBanner(){
    return banner;
    }

    public void setBanner(String banner){
    this.banner = banner;
    }
}
