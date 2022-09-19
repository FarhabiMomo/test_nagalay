package MyMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nagalay_Registration_POM {

private static WebElement element;
	
	
			//Full Name
	   public static WebElement Registration_UserName(WebDriver driver){

	      element= driver.findElement(By.id("basic_fullName"));
	     return element;
	   }
	   
	 //death of birth
	   public static WebElement Registration_DateOfBirth(WebDriver driver){

		      element= driver.findElement(By.id("basic_dateOfBirth"));
		     return element;
		   }
	   
	   
	 //gender click 
	   static String registration_gender="//span[@class='ant-select-selection-search']";
	   public static WebElement Registration_Gender(WebDriver driver){

		      element= driver.findElement(By.xpath(registration_gender));
		     return element;
	   }
	   
	 //email enter
		     public static WebElement Registration_Email(WebDriver driver){

			      element= driver.findElement(By.id("basic_email"));
			     return element;
			 		     
		   }
}
