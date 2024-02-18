package SoftwareTest_Utility1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SoftWareTest_Base1 {
	
	public static WebDriver driver;
	public static Properties propp;
	
	public SoftWareTest_Base1() {
		
		try {
			FileInputStream flss = new FileInputStream (System.getProperty("user.dir")  + "\\src\\test\\java\\SoftwareTest_Configure1\\SoftwareTest_Config1.Properties" );
			propp = new Properties();
			propp.load(flss);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void SoftWareTestBrowsers () {
		String SoftWareB = propp.getProperty("SoftWareTestBrowser1");
		
		if(SoftWareB.equals("Chrome")) {
			
			System.setProperty("wedriver.chrome.driver", (System.getProperty("user.dir")  + "\\SoftwareTest_ChromeDriver1\\chrome.exe"));
			ChromeOptions ops = new ChromeOptions ();
			ops.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			
			
			
		}else if (SoftWareB.equals("IE")) {
			
			
			
		}
		
		
}
	//launch url
	public static void SoftWareLaunchURL (String URL) {
		
		driver.get(propp.getProperty("SoftWareTestURL"));
		
		
		
	}	
	
}
