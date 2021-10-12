package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frame {

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
    public void test1 () {
        driver.get("http://practice.cybertekschool.com/iframe");

        driver.switchTo().frame("mce_0_ifr");

        //clear before send keys
        driver.findElement(By.cssSelector("#tinymce")).clear();

        driver.findElement(By.cssSelector("#tinymce")).sendKeys("adil ablimit");



        // switching between iframes
        // 1. switchTo().defaultContent();
        // 2. switchTo().frame(index); begin from first child frame
        // 3. switchTo().parentFrame()
        // 4. using findElement method then pass it switchTo().frame(webElement)

    }


}
