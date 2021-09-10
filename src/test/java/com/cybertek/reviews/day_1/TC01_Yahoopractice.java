package com.cybertek.reviews.day_1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class TC01_Yahoopractice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.yahoo.com");
        String expectedTitle = "Yahoo";
        System.out.println(driver.getTitle().trim().contains(expectedTitle));

        driver.quit();
    }
}
