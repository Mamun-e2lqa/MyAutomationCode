package testUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basePlay {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		WebElement ele= driver.findElement(By.xpath("//legend[contains(text(),'Radio Button Example')]"));
		System.out.println(ele.getText());
	}

}
