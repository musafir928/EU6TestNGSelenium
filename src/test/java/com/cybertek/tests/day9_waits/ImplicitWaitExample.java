package com.cybertek.tests.day9_waits;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {
    WebDriver driver;
    @BeforeMethod
    public void setup () throws InterruptedException {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown () throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }

    //implicit wait will solve the problem when we render a dynamic content on the html page
    // it means it won't solve element not interactive problem

    @Test
    public void test1 () {

        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

        System.out.println(driver.findElement(By.id("finish")).getText());


    }
}
