package com.wisdocity.selenium.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WisdocityUtils {

	public static final String testInstance = "https://test.wisdocity.ai";
	public static final String alphaInstance = "https://alpha.wisdocity.ai";
	public static final String betaInstance = "https://beta.wisdocity.ai";

	/**
	 * Create WebDriver Instance
	 */
	WebDriver driver;

	/**
	 * Declare Constructor
	 */
	public WisdocityUtils(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Launch Website
	 */
	public void OpenBrowser(String url) {
		
		driver.get(url);

	}

	/**
	 * Maximize window
	 */
	public void MaximiseWindow() {

		driver.manage().window().maximize();
	}

	/**
	 * close the browser
	 */
	public void CloseBrowser() {

		driver.close();
	}

	/**
	 * Quit the browser
	 */
	public void QuitBrowser() {

		driver.quit();
	}

	/**
	 * Wait for Element to be Visible
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public WebElement waitForElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * Wait for Element to be Clickable
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public WebElement waitForElementToBeClickable(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * Capture Screenshot 
	 * @param testName
	 * @return
	 */
	public String captureScreenshot(String testName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "/screenshots/" + testName + ".png";
		try {
			File target = new File(dest);
			org.apache.commons.io.FileUtils.copyFile(src, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dest;
	}

	/**
	 * Select Dropdown by Visible Text
	 * @param locator
	 * @param visibleText
	 */
	public void selectDropdownByVisibleText(By locator, String visibleText) {
		WebElement dropdown = driver.findElement(locator);
		Select select = new Select(dropdown);
		select.selectByVisibleText(visibleText);
	}

	/**
	 * Get All Links on a Page
	 * @return
	 */
	public List<WebElement> getAllLinks() {
		return driver.findElements(By.tagName("a"));
	}

	/**
	 * Switch to New Window
	 */
	public void switchToNewWindow() {
		String originalWindow = driver.getWindowHandle();
		for (String windowHandle : driver.getWindowHandles()) {
			if (!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
	}

	/**
	 * Accept Alert (OK Button)
	 */
	public void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			System.out.println("Alert accepted.");
		} catch (Exception e) {
			System.out.println("No alert present: " + e.getMessage());
		}
	}

	/**
	 * Dismiss Alert (Cancel Button)
	 */
	public void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			System.out.println("Alert dismissed.");
		} catch (Exception e) {
			System.out.println("No alert present: " + e.getMessage());
		}
	}

	/**
	 * Get Alert Text
	 * @return
	 */
	public String getAlertText() {
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert text: " + text);
			return text;
		} catch (Exception e) {
			System.out.println("No alert present: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Enter Text in Prompt Alert
	 * @param text
	 */
	public void enterTextInAlert(String text) {
		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);
			System.out.println("Entered text in alert: " + text);
		} catch (Exception e) {
			System.out.println("No alert present or unable to enter text: " + e.getMessage());
		}
	}

	/**
	 * Read Data from Properties File
	 * @param key
	 * @return
	 */
//    public String getProperty(String key) {
//        Properties prop = new Properties();
//        try (FileInputStream fis = new FileInputStream("config.properties")) {
//            prop.load(fis);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return prop.getProperty(key);
//    }

	/**
	 * ️Scroll to Element
	 * @param locator
	 */
//    public void scrollToElement(By locator) {
//        WebElement element = driver.findElement(locator);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//    }

	/**
	 * Highlight Element (For Debugging)
	 * 
	 * @param locator
	 */
//    public void highlightElement(By locator) {
//        WebElement element = driver.findElement(locator);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].style.border='3px solid red'", element);
//    }

	/**
	 * Select Dropdown by Visible Text
	 * @param locator
	 * @param visibleText
	 */
    public void selectDropdownByVisibleText1(By locator, String visibleText) {
        WebElement dropdown = driver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByVisibleText(visibleText);
    }

}
