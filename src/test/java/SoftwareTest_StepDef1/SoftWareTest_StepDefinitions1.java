package SoftwareTest_StepDef1;

import SoftwareTest_Utility1.SoftWareTest_Base1;
import cucumber.api.java.en.Given;

public class SoftWareTest_StepDefinitions1 extends SoftWareTest_Base1 {
	
	@Given("^Launch \"([^\"]*)\" Application$")
	public void launch_Application(String URL) throws Throwable {
		
		SoftWareLaunchURL(URL);
	    
	}


}
