package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PracticePageObj {

	@FindBy(how=How.XPATH,using="//legend[contains(text(),'Radio Button Example')]")
	public WebElement RadiobtnExmple;
	
	By RadioBtnBMW = By.xpath("//input[@id='bmwradio']");
	By RadioBtnBenz = By.xpath("//input[@id='benzradio']");
	By RadioBtnHonda = By.xpath("//input[@id='hondaradio']");
	By Gettext= By.xpath("//input[@type=\"radio\"]");

}
