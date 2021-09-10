package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    public static void main(String[] args) throws InterruptedException {
        final String EXPECTED_MESSAGE = "Your e-mail's been sent!";
        final String EXPECTED_EMAIL = "uganoghli@gmail.com";

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement targetInput = driver.findElement(By.name("email"));

        targetInput.sendKeys(EXPECTED_EMAIL);

        String inputValue = targetInput.getAttribute("value");

        if(EXPECTED_EMAIL.equals(inputValue)){
            System.out.println("input value verification pass!");
        }else{
            System.out.println("input value verification fail!");

        }

        driver.findElement(By.id("form_submit")).click();
        Thread.sleep(3000);

        String actualMessage = driver.findElement(By.name("confirmation_message")).getText();

        if(EXPECTED_MESSAGE.equals(actualMessage)){
            System.out.println("confirmation message verification pass!");
        }else{
            System.out.println("confirmation message verification fail!");

        }

        driver.quit();

    }
}
