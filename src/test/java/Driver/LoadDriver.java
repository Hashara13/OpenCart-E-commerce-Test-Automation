package Driver;

import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadDriver {
static WebDriver driver=null;

public static WebDriver LoadBrowser(String browerName) {
	if(browerName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","./webDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	if(browerName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","./webDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	return driver;
}
public static WebDriver LoadBrowser(String browerName,String URL) {
	if(browerName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","./webDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	if(browerName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","./webDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	return driver;
}
public static WebDriver getDriver(){
	return driver;
}
public static void main(String args[]){
	LoadBrowser("firefox");
}
}
