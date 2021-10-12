package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ActionsTest {

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
        public void hoverTest() throws InterruptedException {
            driver.get("http://practice.cybertekschool.com/hovers");
            WebElement img1 = driver.findElement(By.tagName("img"));

            // Actions --> class that contains all user interactions
            //how to create actions object => by passing driver to constructor
            Actions actions = new Actions(driver);
            //perform() --> perform the action, complete the action
            // moveToElement moves mouse to the element
            actions.moveToElement(img1).perform();
            WebElement viewLink = driver.findElement(By.linkText("View profile"));
            Assert.assertTrue(viewLink.isDisplayed(), "link is not displayed");
        }


        @Test
        public void dragAndDrop () throws InterruptedException {
            driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
            Thread.sleep(3000);
            List<WebElement> acceptAndClose = driver.findElements(By.xpath("//*[.='Accept and Close']"));
            List<WebElement> acceptCookies = driver.findElements(By.xpath("//*[.='Accept Cookies']"));
            if(acceptAndClose.size()>0) {
                acceptAndClose.get(0).click();
            } else if (acceptCookies.size() > 0 ){
                acceptCookies.get(0).click();
            }

            Actions actions = new Actions(driver);
            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droptarget"));
            Thread.sleep(2000);
            actions.dragAndDrop(source, target).perform();
            Thread.sleep(10000);

        }@Test
        public void dragAndDropByChaining () throws InterruptedException {
            driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
            Thread.sleep(3000);
            List<WebElement> acceptAndClose = driver.findElements(By.xpath("//*[.='Accept and Close']"));
            List<WebElement> acceptCookies = driver.findElements(By.xpath("//*[.='Accept Cookies']"));
            if(acceptAndClose.size()>0) {
                acceptAndClose.get(0).click();
            } else if (acceptCookies.size() > 0 ){
                acceptCookies.get(0).click();
            }

            Actions actions = new Actions(driver);
            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droptarget"));
            Thread.sleep(2000);
            actions.moveToElement(source).perform();
            actions.clickAndHold().perform();
            actions.moveToElement(target).pause(2000).perform();
            actions.release().perform();
            Thread.sleep(4000);

            Thread.sleep(10000);

        }
}
