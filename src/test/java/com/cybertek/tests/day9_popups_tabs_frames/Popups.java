package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Popups {


    WebDriver driver;
    @BeforeMethod
    public void setup () throws InterruptedException {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown () throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test2 () throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //click on "Click for js alert button"
        driver.findElement(By.xpath("//button[1]")).click();

        //since we cannot locate with findElement we use...
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

        // dismiss()
        //click on "Click for js alert button"
        driver.findElement(By.xpath("//button[3]")).click();

        //since we cannot locate with findElement we use...
         alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.sendKeys("Hello from Adil");
        alert.accept();
        Thread.sleep(3000);
    }

}
