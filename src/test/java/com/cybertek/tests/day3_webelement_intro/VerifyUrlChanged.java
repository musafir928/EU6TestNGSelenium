package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlChanged {

    public static void main(String[] args) throws InterruptedException {
        final String BASE_URL = "http://practice.cybertekschool.com/forgot_password";
        final String EXPECTED_URL = "http://practice.cybertekschool.com/email_sent";

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get(BASE_URL);

        WebElement targetInput = driver.findElement(By.name("email"));

        targetInput.sendKeys("uganoghli@gmail.com");

        driver.findElement(By.id("form_submit")).click();

        Thread.sleep(3000);

        String actualUrl = driver.getCurrentUrl();

        boolean testResult = EXPECTED_URL.equals(actualUrl);

        driver.quit();

        System.out.println(testResult);

    }

}
