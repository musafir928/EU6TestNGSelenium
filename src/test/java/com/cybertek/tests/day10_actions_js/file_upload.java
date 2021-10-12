package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class file_upload {
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
    public void test () throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/upload");
        //locate choose file button
        WebElement chooseFile = driver.findElement(By.name("file"));
        // chooseFile.sendKeys("/Users/musafir/Desktop/file.txt");
        // but the path is static now, so we need to put our files under project structure
        // static part /src/test/resources/textfile.txt
        String staticPath = "/src/test/resources/textfile.txt";
         chooseFile.sendKeys(System.getProperty("user.dir") + staticPath);
        Thread.sleep(2000);
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(2000);

        //do some verification
    }

}
