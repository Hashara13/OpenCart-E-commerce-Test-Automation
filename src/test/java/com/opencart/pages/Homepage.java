package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
WebDriver driver;


WebElement loginNavigator;
public Homepage(WebDriver driver) {
	this.driver=driver;
    this.loginNavigator = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/div/a[1]"));
}

public void navigatLogin() {
	loginNavigator.click();
}
}
