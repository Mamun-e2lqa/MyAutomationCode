package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import generic.GenericMethods;
import pages.locators.PracticePageObj;
import uttils.Base;



public class PracticePageAction {
	
	//WebDriver driver=null;
	PracticePageObj locators =null;
	GenericMethods  gm=null;
	
	//Created constructor
	public PracticePageAction() {
		
	this.locators=new PracticePageObj();
	PageFactory.initElements(Base.getDriver(),locators);
			
	}
	
	
	public void getText() {
    Base.waitForPageToLoad();
	WebElement ele =locators.RadiobtnExmple;
    ele.getText();
	}
	
	
}
