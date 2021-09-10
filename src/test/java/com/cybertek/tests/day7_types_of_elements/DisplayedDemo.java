package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisplayedDemo {

    WebDriver driver;

    @BeforeMethod
    public void before() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void after() {
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {


        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput = driver.findElement(By.cssSelector("#username"));

        // if an element is not displayed, it means ut's not intractable
        Assert.assertFalse(usernameInput.isDisplayed());

        driver.findElement(By.cssSelector("#start > button")).click();

        Thread.sleep(7000);

        Assert.assertTrue(usernameInput.isDisplayed());
        Thread.sleep(3000);

    }


}
