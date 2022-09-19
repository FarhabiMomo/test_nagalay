package MyMavenProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nagalay_Login_Main {

	 static WebElement element_main =null;
	public static void main(String[] args) throws AWTException, InterruptedException {

		
		// start reporters
	    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentNagalayWebsiteLogin.html");
	  
	     // create ExtentReports and attach reporter(s)
	     ExtentReports extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);
	     
	     
	     // main object for ExtentReport
	     ExtentTest test=extent.createTest("Nagalay Admin signin page test->Login", "this is the extent report, it will analysis all the test steps of our test case");
	     ExtentTest test_input=extent.createTest("Nagalay Admin Test Input Field->Login", "Input Field");
	     ExtentTest test_pass=extent.createTest("Nagalay Admin Pass Test->Login", "The test Case is pass");
	     ExtentTest test_eyeButton=extent.createTest("Nagalay Admin Test eye button->Login", "The eye button is working");
	     
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		 test.log(com.aventstack.extentreports.Status.INFO, "chromedriver setup");
		//max window
		driver.manage().window().maximize();
		
		
		 test.debug("Importing the Webdriver");
		//nagalay baseUrl
		String NagalAYBaseUrl="http://ec2-54-179-255-33.ap-southeast-1.compute.amazonaws.com:3000/sign-in";
		driver.get(NagalAYBaseUrl);
		test_pass.pass("Entering the BaseURL");
		
		//get the title
		System.out.println(driver.getTitle());
		
		
		//Test_Case1
		test_input.log(com.aventstack.extentreports.Status.INFO, "Usename textbox is blank");
		//send username blank
		element_main	=nagalyParentClass.login_userName(driver);
		element_main.sendKeys("");
	       Thread.sleep(2000);
	       test_input.log(com.aventstack.extentreports.Status.INFO, "Password textbox is blank");
		//send password blank
		element_main=nagalyParentClass.login_password(driver);
		element_main.sendKeys("");
		Thread.sleep(2000);
		test_input.log(com.aventstack.extentreports.Status.INFO, "Click the Submit button");
		//click submit
		element_main=nagalyParentClass.login_submit(driver);
		element_main.submit();
		test_pass.pass("Login Successfully");
		
		//Test_Case1 end
		
		
		//time for wait
		Thread.sleep(2000);
		
		
		//Test_Case2
				//send username fillup
		test_input.log(com.aventstack.extentreports.Status.INFO, "Usename textbox with input");
				element_main=nagalyParentClass.login_userName(driver);
				element_main.sendKeys("Momo");
				Thread.sleep(3000);
				
				//previous input remove and take the new one
				//CREATE A robot class for key() function
				Robot rb= new Robot();
				//ctrl +A (Select)
			       rb.keyPress(KeyEvent.VK_CONTROL);
			       rb.keyPress(KeyEvent.VK_A);
			       Thread.sleep(3000);
			       //delete
			       rb.keyPress(KeyEvent.VK_DELETE);
			       Thread.sleep(3000);
			    
			    //enter the new text input   
			 test_input.log(com.aventstack.extentreports.Status.INFO, "Usename textbox with input");
				element_main.sendKeys("momobhuyan89@gmail.com");
				
				test_input.log(com.aventstack.extentreports.Status.INFO, "Click the Submit button");
				//click submit
				element_main=nagalyParentClass.login_submit(driver);
				element_main.submit();				
				test_pass.pass("Login Successfully");	
				//Test_Case2 end
				
				Thread.sleep(2000);
				
				//Test_Case3	

				test_input.log(com.aventstack.extentreports.Status.INFO, "Password textbox with input");
				//send password
				element_main=nagalyParentClass.login_password(driver);
				test_input.log(com.aventstack.extentreports.Status.INFO, "Password textbox with input");
				//new input
				element_main.sendKeys("habijabi");
				
				Thread.sleep(2000);
				Robot rb1= new Robot();
			       rb1.keyPress(KeyEvent.VK_CONTROL);
			       rb1.keyPress(KeyEvent.VK_A);
			       Thread.sleep(2000);
			       rb1.keyPress(KeyEvent.VK_DELETE);
			       Thread.sleep(2000);
			       element_main.sendKeys("123456");
			       
			       
			       test_eyeButton.log(com.aventstack.extentreports.Status.INFO, "Eye button is on");
				//password eye on
				element_main=nagalyParentClass.login_password_eye(driver);
				element_main.click();
				test_pass.pass("Eye button working Successfully");
				Thread.sleep(2000);
				
				test_eyeButton.log(com.aventstack.extentreports.Status.INFO, "Eye button is off");
				//password eye off
				element_main=nagalyParentClass.login_password_eye_off(driver);
				element_main.click();
				test_pass.pass("Eye button working Successfully");
				
				test_input.log(com.aventstack.extentreports.Status.INFO, "Click the Submit button");
				//click submit
				element_main=nagalyParentClass.login_submit(driver);
				element_main.submit();
				test_pass.pass("Login Successfully");
				//Test_Case3 end
				Thread.sleep(2000);
				
				//test case 4
				
				element_main=nagalyParentClass.login_password(driver);
				rb1.keyPress(KeyEvent.VK_CONTROL);
			       rb1.keyPress(KeyEvent.VK_A);
			       Thread.sleep(2000);
			       rb1.keyPress(KeyEvent.VK_DELETE);
			       Thread.sleep(2000);
			       test_input.log(com.aventstack.extentreports.Status.INFO, "Password textbox with input");
			       element_main.sendKeys("Momo@A77");
			     //click submit
					
			       Thread.sleep(2000);
			       test_input.log(com.aventstack.extentreports.Status.INFO, "Click the Submit button");
					element_main=nagalyParentClass.login_submit(driver);
					element_main.submit();   
					test_pass.pass("Login Successfully");    

				
					 extent.flush();		
		
	}
	

}
