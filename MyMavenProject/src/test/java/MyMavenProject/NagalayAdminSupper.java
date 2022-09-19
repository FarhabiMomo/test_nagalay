package MyMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NagalayAdminSupper {
	
	static WebElement element =null;
	 
	 //login_phone or email
	   public static WebElement login_userName(WebDriver driver){

	      element= driver.findElement(By.id("basic_username"));
	     return element;
	   }

	   
	   	//login_password
	   public static WebElement login_password(WebDriver driver){
	       element= driver.findElement(By.id("basic_password"));
	       return element;
	   	}
	   
	   //submit
	   
	   public static WebElement login_submit(WebDriver driver){
	       element= driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/button[1]"));
	       return element;
	   	}
	   

}
