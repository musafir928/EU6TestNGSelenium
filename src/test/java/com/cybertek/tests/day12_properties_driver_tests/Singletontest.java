package com.cybertek.tests.day12_properties_driver_tests;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Singletontest {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = Driver.get();
        driver.get(ConfigurationReader.get("url"));
        Thread.sleep(3000);
    }
}
