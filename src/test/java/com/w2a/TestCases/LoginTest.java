package com.w2a.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
	}
	
	@Test
	public void doLogin() {
		driver.get("https://mypage.rediff.com/login/dologin");
		driver.findElement(By.id("txtlogin")).sendKeys("geetinder25@rediff.com");
		driver.findElement(By.id("pass_box")).sendKeys("Infosys01+");
		
		//driver.findElement(By.cssSelector("input[type='submit'][value='Login']")).click;
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
