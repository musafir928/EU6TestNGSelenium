package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        Thread.sleep(3000);

        driver.navigate().to("http://facebook.com");

        driver.navigate().back();

        driver.navigate().forward();
        driver.navigate().refresh();

        driver.close();
    }
}
