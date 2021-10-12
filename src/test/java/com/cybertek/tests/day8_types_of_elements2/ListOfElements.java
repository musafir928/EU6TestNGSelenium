package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {

    WebDriver driver;
    @BeforeMethod
    public void setup () {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown () {
        driver.quit();
    }
    @Test
    public void test1 () throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        for (WebElement button : buttons) {
            Assert.assertTrue(button.isDisplayed());
        }


    }

    @Test
    public void test2() {
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
    }
}
