package com.cybertek.reviews.week3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice {

    // priority is based on alphabetic order
    WebDriver driver;

    @Test
    public void test1(){
        driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement successMessage = driver.findElement(By.cssSelector("div#txtAge"));

        Assert.assertFalse(successMessage.isDisplayed());

        driver.findElement(By.cssSelector("input#isAgeSelected")).click();
        Assert.assertTrue(successMessage.isDisplayed());

        driver.quit();

    }

}
