package com.juaracoding.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements DriverStrategy{
    @Override
    public WebDriver setStrategy() {
//        String path = "C:\\My Tools\\chromedriver.exe";
//        System.setProperty("webDriver.chrome.driver", path);
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("useAutomationExtension", false);
//        options.addArguments("--no-sandbox");
//        return new ChromeDriver(options);
        String path = "C:\\My Tools\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
