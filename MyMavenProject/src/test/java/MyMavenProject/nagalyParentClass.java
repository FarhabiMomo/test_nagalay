package MyMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nagalyParentClass {

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
	   	   
	 //login_password_eye button 
	   
	   static String eye_password="//*[@id=\"basic\"]/div[2]/div[2]/div/div/span/span/span";
	   public static WebElement login_password_eye(WebDriver driver){
	       element= driver.findElement(By.xpath(eye_password));
	       return element;
	   }
	   
	   static String eye_off_password="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]";
	   public static WebElement login_password_eye_off(WebDriver driver){
	       element= driver.findElement(By.xpath(eye_off_password));
	       return element;
	   }
	   
	  static String submit="//button[@type='submit']";
	  public static WebElement login_submit(WebDriver driver){
	       element= driver.findElement(By.xpath(submit));
	       return element;
	   	}
	   
	   
	   
	   
	   
}