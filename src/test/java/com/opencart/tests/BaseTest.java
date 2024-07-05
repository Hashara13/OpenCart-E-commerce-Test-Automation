package com.opencart.tests;

import com.opencart.pages.Homepage;
import com.opencart.pages.LoginPage;
import com.opencart.utils.WebDriverManager;

import Driver.LoadDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {
    static WebDriver driver;
    static Homepage home;
    static LoginPage login;
    
   

    @BeforeClass
    public void setUp() {
        driver=LoadDriver.LoadBrowser("firefox", "https://www.opencart.com/index.php?route=cms/demo");
        driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 home = new Homepage(driver);
		 login = new LoginPage(driver);
    }
    
    

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    @Test(priority = 1)
    public void runLoginTest() {
    	home.navigatLogin();
    	login.inputUserName("hashaara");
    	login.inputPassword(null);
    	login.pressLogin();
    	
    	String title=driver.getTitle();
    	if(title.equals("My Account")) {
    		System.out.println("Successfull");
    	}
    	else {
    		System.out.println("Not Successfull");
    	}
    }
}
