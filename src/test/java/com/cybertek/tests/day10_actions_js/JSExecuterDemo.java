package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSExecuterDemo {
    WebDriver driver;
    @BeforeMethod
    public void setup () throws InterruptedException {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown () throws InterruptedException {
        driver.quit();
    }

    @Test
    public void clickWithJS() {
        driver.get("http://practice.cybertekschool.com/");
        WebElement dropdownLink = driver.findElement(By.linkText("Dropdown"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeAsyncScript("arguments[0].click();", dropdownLink);
    }

    @Test
    public void typeWithJS() {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String text = "my text";
        jse.executeScript("arguments[0].setAttribute('value', '"+text+"');", inputBox);
    }

    @Test
    public void scrollWithJS() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down
        for(int i=0; i<10;i++){
            Thread.sleep(1000);
            jse.executeScript("window.scrollBy(0,250)");
        }
        //scroll up
        for(int i=0; i<10;i++){
            Thread.sleep(1000);
            jse.executeScript("window.scrollBy(0,-250)");
        }
    }

    @Test
    public void scrollWithJSUntillElement() throws InterruptedException {
        driver.get("http://amazon.com");
        WebElement eng = driver.findElement(By.id("icp-touch-link-language"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", eng);
        Thread.sleep(2000);
    }
}
