package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrl {

   /* when we get the test case, first:
      1. read and try to understand and do static testing(documentation testing)
         eg: is that specific enough: which browser chrome or firefox etc.
      2. Manually execute the test case:
         - functionality should not broken
         - it should be automatable with the tool which use for automation(Selenium, Cypress etc.)
         - should pass the manual test
    */

    public static void main(String[] args) {
        final String URL = "http://practice.cybertekschool.com/forgot_password";
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get(URL);

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        boolean testResult = URL.equals(driver.getCurrentUrl());

        driver.quit();

        System.out.println(testResult);
    }
}
