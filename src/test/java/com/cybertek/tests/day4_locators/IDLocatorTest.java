package com.cybertek.tests.day4_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        //note: we will refresh the page to see the id is dynamic or static,
        // if static we use it other than that use other locator

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // click don't click button
        WebElement disappearingButton  = driver.findElement(By.id("disappearing_button"));

        disappearingButton.click();
        Thread.sleep(3000);

        driver.quit();

        driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://google.com");

        driver.quit();


    }
}
