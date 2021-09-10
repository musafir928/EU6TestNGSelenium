package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) {

        final String BASE_URL = "http://practice.cybertekschool.com";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(BASE_URL + "/open_new_tab");

        driver.close();

        driver.get("http://google.com");

        driver.close();

    }
}
