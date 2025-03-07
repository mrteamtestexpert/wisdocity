package Wisdocity.SeleniumFramework.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import AbstractComponents.AbstractComponent;

public class Learners extends AbstractComponent {
	WebDriver driver;
	public Learners(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//PageFactory
	@FindBy(xpath="//span[text()='Reena Gupta']")
	WebElement AvtReena;
	@FindBy(xpath="//input[@type='text']")
	WebElement ChatTxt;
	@FindBy(xpath="//p[contains(@class,'text')]")
	List<WebElement> Replys;
	
	

	public WebElement SpeakToAvatar() {
		
		AvtReena.click();
		ChatTxt.sendKeys("Hello, I am swathy");
		ChatTxt.sendKeys(Keys.ENTER);
		
		WebElement ans = Replys.stream().filter(Rep->
		Rep.findElement(By.xpath("//div/p[contains(@class,'text')]")).getText().contains("Swathy?")).findFirst().orElse(null);
		return ans;
		
	}
	
	
	@FindBy(xpath ="//a[text()='Profile']")
	WebElement Profile;
	@FindBy(xpath ="//*[@id=\"root\"]/div[1]/div[2]/main/div/div/form/div[2]/div/div/div[2]/div/select")
	WebElement State;
	
	
	public void setState() {
		
		Profile.click();
		Select dropdownState = new Select(State);
		dropdownState.selectByVisibleText("Ohio");
	}
	
	
	
	
}
