package com.wisdocity.selenium.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wisdocity.selenium.core.WisdocityUtils;

public class MainMethod extends WisdocityUtils {

	public MainMethod(WebDriver driver) {
		super(driver);

	}

	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {

		WisdocityUtils utils = new WisdocityUtils(driver);
		utils.OpenBrowser(testInstance);
		MainMethod login = new MainMethod(driver);
		login.login();

	}

	public void login() {
		try {
			// For clicking the login button

			WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Log In']"));
			Thread.sleep(8000);
			loginBtn.click();

			// Find tAD342Che username and password fields (replace with actual IDs or
			// XPaths)
			WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='example@email.com']"));
			WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='********']"));

			// Enter credentials (replace with your credentials)

			usernameField.sendKeys("meenakshiaravind0719@gmail.com");
			passwordField.sendKeys("Meenakshi07");

			// Clicking the login button after giving the credentials
			WebElement submitField = driver.findElement(By.xpath("//button[@type='submit']"));
			submitField.click();
			
			synchronized(driver) {
			    driver.wait(7000);}
			
			WebElement Profilename = driver.findElement(By.xpath("//span[@class='ml-4 text-sm font-semibold leading-6 text-gray-900']"));
		     Profilename.click();
		     WebElement SwitchToLearner = driver.findElement(By.xpath("//span[contains(text(),'Switch to Learner')]"));
				SwitchToLearner.click();

		} catch (Exception e) {
			e.printStackTrace(); // Handle any exceptions
		}
	}

}
