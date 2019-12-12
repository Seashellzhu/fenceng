package com.util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_util {
public static WebDriver driver;
public static String baseUrl;
@BeforeClass
public void setup(){
	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	baseUrl="http://localhost:8080/Banksys_ssh/";
	driver.get(baseUrl);
	
	//1575771479529
}
@AfterClass
public void teardowm() {
	driver.quit();
}
}
