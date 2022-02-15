package uttils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.GenericMethods;

public class Base {

	// define class variable//Encapsulation
	private static Base SeleniumDriver;
	private static WebDriver driver;//interface
	private static WebDriverWait WaitDriver;
	private static int Time_Out = 30;
	private static int pageload = 50;
	private static GetTitle getTitle;
	private GenericMethods gm;
	// Constructor
	private Base() {
		driver = new ChromeDriver();
		gm =new GenericMethods(driver);
		driver.manage().window().maximize();
		WaitDriver = new WebDriverWait(driver, Time_Out);
		// Method Overload
		driver.manage().timeouts().implicitlyWait(Time_Out, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageload, TimeUnit.SECONDS);
	}
	// Common method

	public static void openPage(String url) {//Parameterized Method
		System.out.println(url);
    	System.out.println(driver);
        driver.get(url);
		
	}
	
	public static String getTitle() {
	return driver.getTitle();
	}
	

	public static WebDriver getDriver() {//Method// getter method
		return driver;
	}

	public static void setUpDriver() {// setter Method
		if (SeleniumDriver == null) {
			SeleniumDriver = new Base();
		}
	}

	public static void TearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
			SeleniumDriver = null;
		}
	}
	
	public static void waitForPageToLoad()
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
