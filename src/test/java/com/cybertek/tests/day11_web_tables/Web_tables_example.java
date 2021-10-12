package com.cybertek.tests.day11_web_tables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Web_tables_example {
    final String url = "http://practice.cybertekschool.com/tables";
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("CHroME");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterMethod
    public void clean() {
        driver.quit();
    }

    @Test
    public void printTable() {
        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println("table.getText() = " + table.getText());
    }
}
