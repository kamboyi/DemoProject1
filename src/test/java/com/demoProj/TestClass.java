package com.demoProj;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	
	
	public	static WebDriver driver;
	
	
	@BeforeMethod
	public void launchDriver() {
		
		System.setProperty("webdriver.chrome.driver", "resource/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
	}
	
	@Test
	public void test1() {
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println("Test 1 title is "+driver.getTitle());
		
	}
	@Test
	public void test2() {
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println("Test 2 title is "+driver.getTitle());
	}
	@Test
	public void test3() {
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println("Test 3 title is "+driver.getTitle());
		
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	

}
