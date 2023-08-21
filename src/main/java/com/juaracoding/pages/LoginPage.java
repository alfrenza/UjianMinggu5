package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator FindBy
    @FindBy(xpath =  "//*[@id=\"user-name\"]")
    WebElement username;

    @FindBy(xpath =  "//*[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath =  "//*[@id=\"login-button\"]")
    WebElement btnLogin;

    //Costum method
    public void login(){
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        btnLogin.click();
    }

}
