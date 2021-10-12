package com.cybertek.tests.day13_pom;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestBase {
    @Test
    public void wrongPasswordTest () {
    LoginPage loginPage = new LoginPage();
    loginPage.login("user1", "somePassword");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/user/login");
    }
}
