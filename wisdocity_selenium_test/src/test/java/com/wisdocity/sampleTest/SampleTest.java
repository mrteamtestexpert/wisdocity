package com.wisdocity.sampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	WebDriver driver = new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {

		/*
		 * driver.get("https://test.wisdocity.ai/");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.findElement(By.linkText("Log In")).click();
		 * 
		 * Thread.sleep(1000);
		 */
		
		WebDriver driver = new ChromeDriver();

		SampleTest loginapplication = new SampleTest();
		loginapplication.LoginApplication("pallavi.hk284@gmail.com", "Apple4@me");

	}

	/**
	 * Function to open Website
	 * 
	 * @throws InterruptedException
	 */
	public void openApplication() throws InterruptedException {

		driver.get("https://test.wisdocity.ai/");

		driver.manage().window().maximize();

		Thread.sleep(1000);

	}

	/**
	 * Login Functionality
	 */
	public void LoginApplication(String userName, String Password) throws InterruptedException {

		SampleTest openApplication = new SampleTest();
		openApplication.openApplication();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(1000);
		WebElement userId = driver.findElement(By.xpath("//input[@placeholder='example@email.com']"));
		userId.sendKeys(userName);
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='********']"));
		password.sendKeys(Password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	/**
	 * Chat Functionality
	 * 
	 */

	// a[@class='bg-purple-700 text-white group flex flex-wrap gap-x-2 rounded-md
	// p-2 text-sm leading-6 fw-sb']
}
