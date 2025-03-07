package Wisdocity.SeleniumFramework.pageobjects;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponents.AbstractComponent;
import dev.failsafe.internal.util.Assert;
import Wisdocity.SeleniumFramework.pageobjects.Learners;


public class LandingPage extends AbstractComponent{
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//PageFactory
	@FindBy(xpath="//a[text()='Log In']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//input[@autocomplete='email']")
	WebElement userEmail;
	
	@FindBy(xpath="//input[@autocomplete='current-password']")
	WebElement passWord;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Submit;
	
	
	public Learners loginApplication(String email, String password) 
	{
		LoginBtn.click();
		userEmail.sendKeys(email);
		passWord.sendKeys(password);
		Submit.click();
		Learners learners = new Learners(driver);
		return learners;
	}
	
	public void Goto()
	{
		driver.get("https://test.wisdocity.ai/");
	}
	
	@FindBy(xpath ="//span[text()='swathyrajiv']")
	WebElement UserName;
	
	public Boolean VerifyUserName()
	{
		String UName =UserName.getText();
		Boolean match = UName.equalsIgnoreCase("swathyrajiv");
		return match;
		
	}
	
	@FindBy(xpath="//*[@id=\"headlessui-menu-button-:r1:\"]/img")
	WebElement Launch;
	public void LaunchDropdown() {
		Launch.click();
		//Check for expert, learnes
		
	}
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[2]/div/div/div[1]/div[1]/div/div/a[1]/img")
	WebElement linkedInIconFooter;
	public void linkedInIcon() {
		
		String mainWindowHandle = driver.getWindowHandle();
		linkedInIconFooter.click();
        // Click the social media icon to open the new page
        

        // Wait for the new window or tab to open
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Replace with a proper wait if necessary

        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();

        // Switch to the new window or tab
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Verify the URL of the new page
        String currentURL = driver.getCurrentUrl();
        if (currentURL.contains("linkedin.com")) {
            System.out.println("LinkedIn navigates to the correct page.");
        } else {
            System.out.println("LinkedIn icon does not navigate to the correct page.");
        }
		
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[2]/div/div/div[1]/div[1]/div/div/a[2]/img")
	WebElement facebookIconFooter;
	public void facebookIcon() {
		// TODO Auto-generated method stub
		
		String mainWindowHandle = driver.getWindowHandle();
		facebookIconFooter.click();
        // Click the social media icon to open the new page
        

        // Wait for the new window or tab to open
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Replace with a proper wait if necessary

        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();

        // Switch to the new window or tab
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Verify the URL of the new page
        String currentURL = driver.getCurrentUrl();
        if (currentURL.contains("facebook.com")) {
            System.out.println("facebook navigates to the correct page.");
        } else {
            System.out.println("facebook icon does not navigate to the correct page.");
        }
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[2]/div/div/div[1]/div[1]/div/div/a[3]/img")
	WebElement instaIconFooter;
	public void instaIcon() {
		// TODO Auto-generated method stub

		String mainWindowHandle = driver.getWindowHandle();
		instaIconFooter.click();
        // Click the social media icon to open the new page
        

        // Wait for the new window or tab to open
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Replace with a proper wait if necessary

        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();

        // Switch to the new window or tab
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Verify the URL of the new page
        String currentURL = driver.getCurrentUrl();
        if (currentURL.contains("instagram.com")) {
            System.out.println("instagram navigates to the correct page.");
        } else {
            System.out.println("instagram icon does not navigate to the correct page.");
        }
	}

	@FindBy(xpath="//*[@id=\"headlessui-menu-item-:r11:\"]")
	WebElement aboutusLink;
	public void aboutUs() {
		// TODO Auto-generated method stub
		aboutusLink.click();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.urlContains("about")); // Adjust the URL condition as needed

         // Verify the URL of the new page
         String expectedURL = "https://alpha.wisdocity.ai/aboutus";
         String currentURL = driver.getCurrentUrl();

         if (currentURL.equals(expectedURL)) {
             System.out.println("Navigation to the About page is correct.");
         } else {
             System.out.println("Navigation to the About page is incorrect.");
         }

         // Alternatively, verify specific content on the About page
         WebElement aboutPageHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
         String expectedHeading = "About Us"; // Adjust the expected heading as needed

         if (aboutPageHeading.getText().equals(expectedHeading)) {
             System.out.println("The About page content is correct.");
         } else {
             System.out.println("The About page content is incorrect.");
         }
		
	}

	public void News() {
		// TODO Auto-generated method stub
		
	}

	public void Investors() {
		// TODO Auto-generated method stub
		
	}

	public void pricing() {
		// TODO Auto-generated method stub
		
	}

	public void faq() {
		// TODO Auto-generated method stub
		
	}

	public void contactUs() {
		// TODO Auto-generated method stub
		
	}

//	public void SocialMediaIconfn() {
//		System.out.println("method in");
//		 List<WebElement> socialMediaIcons = driver.findElements(By.xpath("//div[@class='social-card']//a"));
//		 for (int i = 0; i < socialMediaIcons.size(); i++) {
//			 System.out.println("method in");
//	            // Print all elements of List
//	            System.out.println(socialMediaIcons.get(i));
//	        }
//         // Get the current window handle
//         String mainWindowHandle = driver.getWindowHandle();
//
//         // Iterate through each social media icon
//         for (WebElement icon : socialMediaIcons) {
//        	 System.out.println("loop entered");
//             // Get the href attribute of the icon to identify the social media platform
//             String href = icon.getAttribute("href");
//
//             // Click the social media icon to open the new page
//             
//             icon.click();
//             System.out.println("icon click");
//             // Wait for the new window or tab to open
//            // Replace with a proper wait if necessary
//
//             // Get all window handles
//             Set<String> allWindowHandles = driver.getWindowHandles();
//
//             // Switch to the new window or tab
//             for (String handle : allWindowHandles) {
//                 if (!handle.equals(mainWindowHandle)) {
//                	 System.out.println("loop entered2");
//                     driver.switchTo().window(handle);
//                     break;
//                 }
//             }
//
//             // Verify the URL of the new page
//             String currentURL = driver.getCurrentUrl();
//             if (currentURL.contains(href)) {
//                 System.out.println("Icon for " + href + " navigates to the correct page.");
//             } else {
//                 System.out.println("Icon for " + href + " does not navigate to the correct page.");
//             }
//
//         }
//	}
	
}