package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	private WebDriver driver;
	
	@FindBy(id="input-email")
	  private WebElement  usernameField;
	@FindBy(id="input-password")
	    private WebElement  passwordField;
	@FindBy(css="#content > div > div:nth-child(2) > div > form > input")
	    private WebElement  loginButton;
	
	    public LoginPage(WebDriver driver) {
	        this.driver=driver;
	    }

    public void inputUserName(String username) {
    	usernameField.sendKeys(username);
    }

    public void inputPassword(String password) {
    	usernameField.sendKeys(password);
    }
    public void pressLogin() {
    	loginButton.click();
    }

}
