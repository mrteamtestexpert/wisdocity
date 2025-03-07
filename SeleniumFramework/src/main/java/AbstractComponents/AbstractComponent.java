package AbstractComponents;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;


 

public class AbstractComponent {

	
	  WebDriver driver;


	public AbstractComponent(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	// All reusable codes
	
	public void WaitforElementsToLoad() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	//@FindBy(xpath =)
	public void GotoLearners() {
		
	}
	
	public void GotoAdmin() {
		
	}


	public void GotoExperts() {
	
}


}
