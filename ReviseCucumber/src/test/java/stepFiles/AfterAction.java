package stepFiles;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import uttils.Base;

public class AfterAction {
	
	@After
    public static void tearDown(Scenario scenario) {
    	
    	WebDriver driver=Base.getDriver();
    	System.out.println(scenario.isFailed());
    	 if (scenario.isFailed()) {
             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshotBytes, "image/png");
          
         }
    	 Base.TearDown();
    }

}
