package MyMavenProject;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nagalay_ChildClass_Profile {

	@SuppressWarnings("unused")
	private static final WebDriver Driver = null;
	 static WebElement element_main =null;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//max window
		driver.manage().window().maximize();
		
		
		//nagalay baseUrl
		String NagalAYBaseUrl="http://ec2-54-179-255-33.ap-southeast-1.compute.amazonaws.com:3000/profile";
		driver.get(NagalAYBaseUrl);
		
		//host mode
		
		Thread.sleep(3000);
		//Full Name
		element_main=Nagalay_SupperClass_Profile.Profile_UserName(driver);
		element_main.sendKeys("momo");
		
		//Primary number
				element_main=Nagalay_SupperClass_Profile.Profile_PrimaryNumber(driver);
				element_main.sendKeys("018343445");
				
				//Secondary number
				element_main=Nagalay_SupperClass_Profile.Profile_SecondaryNumber(driver);
				element_main.sendKeys("018000000");
				
				//Email
				element_main=Nagalay_SupperClass_Profile.Profile_Email(driver);
				element_main.sendKeys("momo344f");
				
				
				   //gender
				element_main=Nagalay_SupperClass_Profile.Profile_Gender(driver);
				element_main.click();
				
				//date 
				
				
				//Facebook
				
				element_main=Nagalay_SupperClass_Profile.Profile_Facebook(driver);
				element_main.sendKeys("momo");
				
				//Linkedin
				
				element_main=Nagalay_SupperClass_Profile.Profile_Linkedin(driver);
				element_main.sendKeys("momo");
				
				
				//Twitter
				
				element_main=Nagalay_SupperClass_Profile.Profile_Twitter(driver);
				element_main.sendKeys("momo");
				
				//Instagram
				
				element_main=Nagalay_SupperClass_Profile.Profile_Instagram(driver);
				element_main.sendKeys("momo");
				
				//submit button
				element_main=Nagalay_SupperClass_Profile.Profile_Instagram(driver);
				element_main.click();
		
		
}
}
