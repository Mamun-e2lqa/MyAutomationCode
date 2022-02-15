package stepFiles;

import cucumber.api.java.Before;
import uttils.Base;

public class BeforeAction {
	@Before()
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
       Base.setUpDriver();
    }

}
