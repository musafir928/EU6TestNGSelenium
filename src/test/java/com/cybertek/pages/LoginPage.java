package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    public LoginPage (){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id="prependedInput")
    public WebElement usernameInput;
    @FindBy(id="prependedInput2")
    public WebElement passwordInput;
    @FindBy(id="_submit")
    public WebElement submitButton;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }
}
