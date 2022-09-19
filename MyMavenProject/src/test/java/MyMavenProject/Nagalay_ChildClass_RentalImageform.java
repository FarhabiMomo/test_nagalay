package MyMavenProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nagalay_ChildClass_RentalImageform {

	@SuppressWarnings("unused")
	private static final WebDriver Driver = null;
	 static WebElement element_main =null;
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//max window
		driver.manage().window().maximize();
		
		
		//nagalay baseUrl
				String NagalAYBaseUrl="http://192.168.10.240:3000/sign-in";
				driver.get(NagalAYBaseUrl);
		
				//login
				
				element_main=Nagalay_SupperClass_RentalImageform.login_userName(driver);
				element_main.sendKeys("momobhuyan89@gmail.com");
				Thread.sleep(3000);
	
				//password
				
				element_main=Nagalay_SupperClass_RentalImageform.login_password(driver);			
				//new input
				element_main.sendKeys("123456");
				
				
				//submit button
				
				element_main=Nagalay_SupperClass_RentalImageform.login_submit(driver);
				element_main.submit(); 
				
				//end of login
				
				//url for rentanl image form URL
				String NagalAYBaseUr2="http://192.168.10.240:3000/try-hosting/space-rental/rental-image-form?id=6328411f08a62e2530d963fa";
				driver.get(NagalAYBaseUr2);
					
				//Image upload click
				element_main=Nagalay_SupperClass_RentalImageform.Rental_ImageUpload_Click(driver);
				element_main.click();
		
				 Thread.sleep(4000);
		
				   //end the field upload from desktop		 
			
				 
		//		 robot class
				 
				 Robot rb= new Robot();
			       //select string
			    StringSelection ss=new StringSelection("C:\\Users\\Arafat\\Pictures\\Screenshots\\Screenshot (4)");
			    // clt c
			    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
         		     rb.delay(3000);
			       // clt v
			      rb.keyPress(KeyEvent.VK_CONTROL);
			      rb.keyPress(KeyEvent.VK_V);
			       Thread.sleep(4000);
			       
			     //enter press
			       rb.keyPress(KeyEvent.VK_ENTER);
			       
			       Thread.sleep(4000);
			       //enter release
			      rb.keyRelease(KeyEvent.VK_ENTER);
			       //tab press
			       rb.keyPress(KeyEvent.VK_TAB);
			       //tab release
			       rb.keyRelease(KeyEvent.VK_TAB);
			       
			       //end the field upload from desktop
			       
			       Thread.sleep(4000);
			       //next button click
			       
			       element_main=Nagalay_SupperClass_RentalImageform.Rental_ImageUpload_NextButton(driver);
					element_main.click();
					
					 //after next click the yes buttom
					// but now it show successfull massage for no button
					//after next click the yes buttom
					
					element_main=Nagalay_SupperClass_RentalImageform.Rental_ImageUpload_YesButton(driver);
					element_main.click();
	}
}
