package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisabledElements {
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


        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenRadioButton = driver.findElement(By.cssSelector("#green"));

        Assert.assertFalse(greenRadioButton.isEnabled());

        Thread.sleep(3000);
    }

    @Test
    public void test2() {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement dynamicInput = driver.findElement(By.cssSelector("input[style='width: 30%']"));

        Assert.assertFalse(dynamicInput.isEnabled());
    }

}
