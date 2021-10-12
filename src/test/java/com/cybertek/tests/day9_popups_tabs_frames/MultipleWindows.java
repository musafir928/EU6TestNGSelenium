package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {
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
    public void test1 () throws InterruptedException {
        //switch to another window where we have just two windows

      driver.get("http://practice.cybertekschool.com/windows");

      //get title
        System.out.println("before clicking the 'new window' button, title: " + driver.getTitle());

        // open a new window by clicking 'new window' link
        driver.findElement(By.linkText("Click Here")).click();

        String currentWindowHandle = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            if(!handle.equals(currentWindowHandle)){
                driver.switchTo().window(handle);
            };
        }
        System.out.println("after clicking the 'new window' button, title: " + driver.getTitle());


    }

    @Test
    public void test2 () throws InterruptedException {
        //manage more than two windows

      driver.get("http://practice.cybertekschool.com/windows");

      //get title
        System.out.println("before clicking the 'new window' button, title: " + driver.getTitle());

        // open a new window by clicking 'new window' link
        driver.findElement(By.linkText("Click Here")).click();


        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            if("New Window".equals(driver.getTitle())){
                break;
            };
        }
        System.out.println("after clicking the 'new window' button, title: " + driver.getTitle());


    }
}
