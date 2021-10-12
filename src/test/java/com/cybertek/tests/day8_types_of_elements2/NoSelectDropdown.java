package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {

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
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("dropdownMenuLink"));

        dropdownElement.click();

        List<WebElement> dropdownOptions = driver.findElements(By.className("dropdown-item"));

        for (WebElement option : dropdownOptions) {
            System.out.println(option.getText());
        }

        // click yahoo
        dropdownOptions.get(2).click();
        Thread.sleep(3000);
    }
    }
