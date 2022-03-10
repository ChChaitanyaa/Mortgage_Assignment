package com.MortgageAssignment.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/user/eclipse-workspace/chromedriver");
		
		WebDriver driver = new ChromeDriver();	
		
		// To launch the website in browser needs to use Get() method in selenium 
		
		driver.get("https://www.mortgageadvicebureau.com/contact-us");
		// to find the web elements in the web page needs to use FindElement() method
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("Chaitanya");
		
		driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("Chilukuri");
		
		driver.findElement(By.xpath("//*[@id='EmailAddress']")).sendKeys("Test@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='PhoneNumber']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id='BestTimeToCallYou']")).sendKeys("10AM");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		Select s = new Select (driver.findElement(By.id("ReasonForEnquiry")));
		s.selectByVisibleText("Home Mover");
		Thread.sleep(500);
		driver.findElement(By.id("OptInEmail")).click();
		
		
		
	}

}
