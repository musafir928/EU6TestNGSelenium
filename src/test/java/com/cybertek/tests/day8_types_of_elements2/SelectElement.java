package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectElement {
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
    public void test1 () {
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropDownElement = driver.findElement(By.id("state"));

        Select stateDropDown = new Select(dropDownElement);

        List<WebElement> options = stateDropDown.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        
    }

    @Test
    public void test2 () {
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropDownElement = driver.findElement(By.id("state"));

        Select stateDropDown = new Select(dropDownElement);

        String expected = "Select a State";

        String actual = stateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected, "verify first selected option");
    }

    @Test
    public void test3 () {
        //select
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropDownElement = driver.findElement(By.id("state"));

        Select stateDropDown = new Select(dropDownElement);

        // select by text
        stateDropDown.selectByVisibleText("Virginia");
        String expected = "Virginia";

        // select by text
        stateDropDown.selectByIndex(51);
        expected = "wyoming";

        // select by value

        String actual = stateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected, "verify first selected option");
    }
}
