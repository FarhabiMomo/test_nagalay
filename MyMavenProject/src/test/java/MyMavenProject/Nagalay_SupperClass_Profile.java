package MyMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nagalay_SupperClass_Profile {

	private static WebElement element;
	
	//host mode
	
			//Full Name
	   public static WebElement Profile_UserName(WebDriver driver){

	      element= driver.findElement(By.id("fullName"));
	     return element;
	   }
	   
	   //Primary Number
	   public static WebElement Profile_PrimaryNumber(WebDriver driver){

		      element= driver.findElement(By.id("primaryNumber"));
		     return element;
		   }
	   
	 //Secondary Number
	   public static WebElement Profile_SecondaryNumber(WebDriver driver){

		      element= driver.findElement(By.id("secondaryNumber"));
		     return element;
		   }
	   
	 //Email
	   public static WebElement Profile_Email(WebDriver driver){

		      element= driver.findElement(By.id("email"));
		     return element;
		   }
	   
	   //gender
	   static String profile_gender="//span[contains(text(),'Others')]";
	   public static WebElement Profile_Gender(WebDriver driver){

		      element= driver.findElement(By.xpath(profile_gender));
		     return element;
		   }
	   
	   //Facebook
	   static String profile_facebook="//input[@id='facebook']";
	   public static WebElement Profile_Facebook(WebDriver driver){

		      element= driver.findElement(By.xpath(profile_facebook));
		     return element;
		   }
	   
	   //Linkedin
	   static String profile_linkedin="//input[@id='linkedIn']";
	   public static WebElement Profile_Linkedin(WebDriver driver){

		      element= driver.findElement(By.xpath(profile_linkedin));
		     return element;
		   }
	   
	   
	   //Twitter
	   static String profile_twitter="//input[@id='twitter']";
	   public static WebElement Profile_Twitter(WebDriver driver){

		      element= driver.findElement(By.xpath(profile_twitter));
		     return element;
		   }
	   
	   //  Instagram
	   static String profile_instagram="//input[@id='instagram']";
	   public static WebElement Profile_Instagram(WebDriver driver){

		      element= driver.findElement(By.xpath(profile_instagram));
		     return element;
		   }
	   
	   
	 //submit button
	   
	   static String profile_submit="//span[contains(text(),'Submit')]";
	   public static WebElement Profile_Submit(WebDriver driver){

		      element= driver.findElement(By.xpath(profile_submit));
		     return element;
		   }
	   
	   
	   
	   
}
