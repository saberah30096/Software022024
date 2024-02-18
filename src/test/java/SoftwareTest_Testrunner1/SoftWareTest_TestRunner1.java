package SoftwareTest_Testrunner1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import SoftwareTest_Utility1.SoftWareTest_Base1;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/SoftwareTestingFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "SoftwareTest_StepDef1")//tags = {"@Jahan1"})


public class SoftWareTest_TestRunner1 extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void SoftWareStartURL() {
		SoftWareTest_Base1 test1 = new SoftWareTest_Base1();
		test1.SoftWareTestBrowsers();
	}
	
	@AfterTest
	public void closeURL() {
		SoftWareTest_Base1 test1 = new SoftWareTest_Base1();
		test1.driver.quit();
		
		
	}
	
	

}
