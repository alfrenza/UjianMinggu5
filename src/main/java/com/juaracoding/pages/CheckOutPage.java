package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    private WebDriver driver;

    public CheckOutPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator FindBy
    @FindBy(xpath =  "//*[@id=\"first-name\"]")
    WebElement firstName;

    @FindBy(xpath =  "//*[@id=\"last-name\"]")
    WebElement lastName;

    @FindBy(xpath =  "//*[@id=\"postal-code\"]")
    WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    WebElement btnContinue;

    //Costum method
    public void CheckOut(){
        firstName.sendKeys("Alfrenza");
        lastName.sendKeys("Burhanudin");
        zipCode.sendKeys("11650");
        btnContinue.click();
    }
}
