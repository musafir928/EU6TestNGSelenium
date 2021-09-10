package com.cybertek.tests.day4_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.*;

public class NameLocatorTest {
    public static void main(String[] args) throws InterruptedException {
        // disadvantage: not unique some time
        // advantage: almost not dynamic

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //make browser full screen
        driver.manage().window().maximize();

        sleep(3000);
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));

        sleep(3000);
        fullNameInput.sendKeys("Adil Ablimit");

        sleep(3000);

        driver.quit();

    }
}
