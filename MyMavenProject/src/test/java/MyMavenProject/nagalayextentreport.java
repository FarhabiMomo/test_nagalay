package MyMavenProject;

import java.io.ObjectInputFilter.Status;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nagalayextentreport {
	


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// start reporters
	    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentNagalayLogin.html");
	  
	     // create ExtentReports and attach reporter(s)
	     ExtentReports extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);
	     
	  // main object for ExtentReport
	     ExtentTest test=extent.createTest("Nagalay signin page test", "this is the extent report, it will analysis all the test steps of our test case");
	     ExtentTest test_pass=extent.createTest("Nagalay signin page test", "pass test case");
	
	     
	     WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		 test.log(com.aventstack.extentreports.Status.INFO, "chromedriver setup");
		//max window
		driver.manage().window().maximize();
		
		
		 test.debug("importing the webdriver");
	     driver.get("http://192.168.10.140:3000/login");
	     test.pass("entering the URL");
	    
		 Thread.sleep(3000);
		 
		 test_pass.log(com.aventstack.extentreports.Status.INFO, "Enter your email and password");
		 NagalayAdminSupper.login_userName(driver).sendKeys("joniyed.bhuiyan@gmail.com");
		 NagalayAdminSupper.login_password(driver).sendKeys("123456@");
		 Thread.sleep(3000);
		 
		 NagalayAdminSupper.login_submit(driver).click();
		 Thread.sleep(3000);
		 
	     test_pass.log(com.aventstack.extentreports.Status.INFO, "login successfully");
	    
	     extent.flush();
	

	}

}
