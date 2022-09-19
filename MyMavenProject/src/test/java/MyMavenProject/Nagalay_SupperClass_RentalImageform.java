package MyMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nagalay_SupperClass_RentalImageform {

		private static WebElement element;

			//login
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
		   
		   //submit button
		  static String submit="//button[@type='submit']";
			  public static WebElement login_submit(WebDriver driver){
			       element= driver.findElement(By.xpath(submit));
			       return element;
			  }
		   
		   //end of login

		//Image upload click
		 static String rental_imageUpload_click="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]";
		   public static WebElement Rental_ImageUpload_Click(WebDriver driver){

		      element= driver.findElement(By.xpath(rental_imageUpload_click));
		     return element;
		   }
		   
		   
		 //next button click
		   static String rental_imageupload_nextbutton="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]";
		   public static WebElement Rental_ImageUpload_NextButton(WebDriver driver){

			      element= driver.findElement(By.xpath(rental_imageupload_nextbutton));
			     return element;
			   }  
		   
		   
		 //after next click the yes buttom
		 // but now it show successfull massage for no button
		 //after next click the yes buttom
		   static String rental_imageupload_okbutton="//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/button[2]";
		   public static WebElement Rental_ImageUpload_YesButton(WebDriver driver){

			      element= driver.findElement(By.xpath(rental_imageupload_okbutton));
			     return element;
			   } 
		   
		   
		
	}

