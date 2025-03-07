package Wisdocity.SeleniumFramework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Wisdocity.SeleniumFramework.pageobjects.LandingPage;
import Wisdocity.SeleniumFramework.pageobjects.Learners;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		LandingPage landingPage = new LandingPage(driver);
		
		/**Login Functionality
		 * 
		  **/
		 
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	      //LandingPage landingPage = new LandingPage(driver);
		 
	    landingPage.Goto();
		landingPage.loginApplication("pallavi.hk284@gmail.com","Apple4@me" );
		driver.findElement(By.xpath("//a[@class='bg-purple-700 text-white group flex flex-wrap gap-x-2 rounded-md p-2 text-sm leading-6 fw-sb']")).click();
//		  driver.findElement(By.xpath("//a[text()='Log In']")).click();
//		  driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys(
//		  "pallavi.hk284@gmail.com");
//		  driver.findElement(By.xpath("//input[@autocomplete='current-password']")).
//		  sendKeys("Apple4@me");
//		  driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
		  
//		  landingPage.Goto();
//		  driver.findElement(By.xpath("//a[text()='Log In']")).click();
//		  driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys(
//		  "pallavi.hk284@gmail.com");
//		  driver.findElement(By.xpath("//input[@autocomplete='current-password']")).
//		  sendKeys("Apple4@me");
//		  driver.findElement(By.xpath("//button[@type='submit']")).click();
//		  driver.findElement(By.xpath("//a[@class='bg-purple-700 text-white group flex flex-wrap gap-x-2 rounded-md p-2 text-sm leading-6 fw-sb']")).click();
//		 
		
		/*LandingPage landingPage = new LandingPage(driver);//Login Page
		landingPage.Goto();
		landingPage.LaunchDropdown();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//landingPage.SocialMediaIconfn();
		landingPage.linkedInIcon();
		landingPage.facebookIcon();
		landingPage.instaIcon();
		landingPage.aboutUs();
		landingPage.News();
		landingPage.Investors();
		landingPage.pricing();
		landingPage.faq();
		landingPage.contactUs();*/
		
		//landingPage.Goto();
		
		////////Learners learners=landingPage.loginApplication("Shreejaya@gmail.com", "Abcd1234");
		
		//Learners learners=landingPage.loginApplication("swathyrajiv@gmail.com", "swathy123!@#");
		//Boolean match = landingPage.VerifyUserName();
		//Assert.assertTrue(match);
		
		//Learners learners = new Learners(driver);//Chat with avatar
//		learners.SpeakToAvatar();
//		learners.setState();
		//learners.
		/*
		 * //verifying logged in user name is shreejaya String
		 * Username=driver.findElement(By.xpath("//span[text()='shreejaya']")).getText()
		 * ; Assert.assertTrue(Username.equalsIgnoreCase("Shreejaya"));
		 * 
		 * 
		 * driver.findElement(By.xpath("//span[text()='Reena Gupta']")).click();
		 * driver.findElement(By.xpath("//input[@type='text']")).
		 * sendKeys("Hello, I am Shree");
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
		 * 
		 * 
		 * 
		 * //wait.until(ExpectedConditions.invisibilityOfElementLocated(driver.
		 * findelement()); // //Java Streams - with JRE 8.0 and above List<WebElement>
		 * Replys = driver.findElements(By.xpath("//p[contains(@class,'text')]"));
		 * WebElement ans = Replys.stream().filter(Rep->
		 * Rep.findElement(By.xpath("//div/p[contains(@class,'text')]")).getText().
		 * contains("Shree?")).findFirst().orElse(null); System.out.println(ans);
		 * 
		 * 
		 * //Navigate to profile page
		 * driver.findElement(By.xpath("//a[text()='Profile']")).click(); //chater 156
		 * Actions class auto suggest dropdown
		 * 
		 * 
		 * Actions a = new Actions(driver);
		 * a.sendKeys(driver.findElement(By.cssSelector("['Choose a city']")),"Austin").
		 * build().perform();
		 * 
		 * 
		 * 
		 * //Dropdown - state WebElement State = driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div[1]/div[2]/main/div/div/form/div[2]/div/div/div[2]/div/select"
		 * ));
		 * 
		 * Select dropdownState = new Select(State);
		 * 
		 * dropdownState.selectByVisibleText("Texas"); //driver.close();
		 */ }

}
