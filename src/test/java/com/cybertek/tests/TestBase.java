package com.cybertek.tests;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setup () {
        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions = new Actions(driver);
        wait = new WebDriverWait(driver,10);
        driver.get(ConfigurationReader.get("url"));
    }

    @AfterMethod
    public void tearDown () throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }

//    @Test
//    public void loginTest () {
//        driver.get(ConfigurationReader.get("url"));
//        String username = ConfigurationReader.get("driver_username");
//        String password = ConfigurationReader.get("driver_password");
//
//        driver.findElement(By.id("prependedInput")).sendKeys(username+ Keys.TAB);
//        driver.findElement(By.id("prependedInput2")).sendKeys(password+ Keys.ENTER);
//        System.out.println("inheritance test");
//    }
}
