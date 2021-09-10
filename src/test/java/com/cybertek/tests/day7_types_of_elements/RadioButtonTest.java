package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest {

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

        WebElement blueRadioButton = driver.findElement(By.cssSelector("#blue"));
        WebElement redRadioButton = driver.findElement(By.cssSelector("#red"));

        Assert.assertTrue(blueRadioButton.isSelected(), "blue must be selected by default");
        Assert.assertFalse(redRadioButton.isSelected(), "red must not be selected by default");

        Thread.sleep(3000);
    }

    @Test
    public void test2() throws InterruptedException {


        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.cssSelector("#blue"));
        WebElement redRadioButton = driver.findElement(By.cssSelector("#red"));
         redRadioButton.click();

        Assert.assertFalse(blueRadioButton.isSelected(), "blue must not be selected");
        Assert.assertTrue(redRadioButton.isSelected(), "red must be selected");

        Thread.sleep(3000);
    }
}
