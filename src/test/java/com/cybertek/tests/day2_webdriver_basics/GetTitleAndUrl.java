package com.cybertek.tests.day2_webdriver_basics;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
    public static void main(String[] args) {
        // todo: navigate to http://practice.cybertekschool.com

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        String currentUrl = driver.getCurrentUrl();
        String  currentTitle = driver.getTitle();
        String pageSource = driver.getPageSource();

        System.out.println("currentTitle = " + currentTitle);
        System.out.println("currentUrl = " + currentUrl);
        System.out.println("pageSource = " + pageSource);

        driver.close();
    }

}
