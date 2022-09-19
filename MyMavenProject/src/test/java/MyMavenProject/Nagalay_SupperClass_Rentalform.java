package MyMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Nagalay_SupperClass_Rentalform {
	
	private static WebElement element;



	//PropertyName
	   public static WebElement login_PropertyName(WebDriver driver){

	      element= driver.findElement(By.id("basic_title"));
	     return element;
	   }
	   
	   
	   //PhoneNumber
	   public static WebElement login_PhoneNumber(WebDriver driver){

		      element= driver.findElement(By.id("basic_phone"));
		     return element;
		   }
		    
	//Email
	   public static WebElement login_Email(WebDriver driver){

		      element= driver.findElement(By.id("basic_email"));
		     return element;
		   }
	  // Additional Contact Info
	   
	   public static WebElement Additional_ContactInfo(WebDriver driver){

		      element= driver.findElement(By.id("basic_contactInfo"));
		     return element;
		   }
 
	   
	 //City
	   public static WebElement login_City(WebDriver driver){

		      element= driver.findElement(By.id("basic_city"));
		     return element;
		   }

	   //State
	   
	   public static WebElement State(WebDriver driver){

		      element= driver.findElement(By.id("basic_state"));
		     return element;
	   } 
		     
		   //Zip Code
			   public static WebElement Zip_Code(WebDriver driver){

				      element= driver.findElement(By.id("basic_zipCode"));
				     return element;     
			   
	   }
	 //Country
	   public static WebElement login_Country(WebDriver driver){

		      element= driver.findElement(By.id("basic_country"));
		     return element;
		   }

	   
	 //StreetAddress
	   public static WebElement StreetAddress(WebDriver driver){

		      element= driver.findElement(By.id("basic_streetAddress"));
		     return element;
		   }
	   
	  //PropertyAddress
	   
	   static String propertyaddress="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[5]/div[6]/div[1]/div[1]/label[1]/div[1]/div[2]/span[1]";
	  
	   public static WebElement PropertyAddress(WebDriver driver){

		      element= driver.findElement(By.xpath(propertyaddress));
		     return element;
		     
		   }
	   
	   //cancel the the basic model
	   
	   static String propertyaddress_cancel="body.ant-scrolling-effect:nth-child(2) div.ant-modal-root div.ant-modal-wrap div.ant-modal div.ant-modal-content:nth-child(2) button.ant-modal-close > span.ant-modal-close-x";
		  
	   public static WebElement PropertyAddress_cancel(WebDriver driver){	      
		     //for ok button
		     element= driver.findElement(By.cssSelector(propertyaddress_cancel));
		     return element;
		   }
	   
	 //ok butoon after address select
	   static String propertyaddress_okbutton="body.ant-scrolling-effect:nth-child(2) div.ant-modal-root div.ant-modal-wrap div.ant-modal div.ant-modal-content:nth-child(2) div.ant-modal-body div:nth-child(1) > button.ant-btn.ant-btn-round.ant-btn-primary.ant-btn-lg:nth-child(2)";
	  
	   public static WebElement PropertyAddress_oK(WebDriver driver){	      
		     //for ok button
		     element= driver.findElement(By.cssSelector(propertyaddress_okbutton));
		     return element;
 
		   }
	
	 // end of PropertyAddress
	   
	 //PropertyDescription
	   public static WebElement PropertyDescribtion(WebDriver driver){

		      element= driver.findElement(By.id("basic_description"));
		     return element;
		   }

	   
	   //Property details
	  // Number of bathrooms
	   	
	   public static WebElement Number_Bathroom(WebDriver driver){

		      element= driver.findElement(By.id("basic_bathrooms"));
		     return element;
		   }
	   
	   //  Number of Bedrooms
	   public static WebElement Number_Bedrooms(WebDriver driver){

		      element= driver.findElement(By.id("basic_bedrooms"));
		     return element;
		   }
	   
	   
	   //Number of beds
	   public static WebElement Number_Bed(WebDriver driver){

		      element= driver.findElement(By.id("basic_beds"));
		     return element;
		   }
	   
	   
//		Adults
	   
	   public static WebElement Adults(WebDriver driver){

		      element= driver.findElement(By.id("basic_guests"));
		     return element;
	   }
	   
	   //Children
	   
	   public static WebElement Children(WebDriver driver){

		      element= driver.findElement(By.id("basic_children"));
		     return element;
	   }
	   
	 //Infants
	   
	   public static WebElement Infants(WebDriver driver){

		      element= driver.findElement(By.id("basic_infants"));
		     return element;
	   } 
	   
	   
	   //Pets
	   
	   public static WebElement Pets(WebDriver driver){

		      element= driver.findElement(By.id("basic_pets"));
		     return element;
	   } 
	   //End Property details
	   
	   
		// PropertyAmenity_list
	   
	   
	   //Amenity List
	   //cancel button
	   static String amenitylist_cancelbutton="body.ant-scrolling-effect:nth-child(2) div.ant-modal-root div.ant-modal-wrap div.ant-modal.amenitiy-modal div.ant-modal-content:nth-child(2) div.ant-modal-footer button.ant-btn.ant-btn-default:nth-child(1) > span:nth-child(1)";
	   public static WebElement Amenitylist_CancelButton(WebDriver driver){

			      element= driver.findElement(By.cssSelector(amenitylist_cancelbutton));
			     return element;
				   }
	   
	   
	   //name
	   static String property_amenities="//input[@placeholder='Enter Title']";
   public static WebElement PropertyAmenity_list(WebDriver driver){

		      element= driver.findElement(By.xpath(property_amenities));
		     return element;
			   }
   //add field 
   
   static String property_amenities_addfield="body.ant-scrolling-effect:nth-child(2) div.ant-modal-root div.ant-modal-wrap div.ant-modal.amenitiy-modal div.ant-modal-content:nth-child(2) div.ant-modal-body div.ant-col.ant-col-md-24 div.ant-row div.ant-col.ant-col-md-20:nth-child(2) div.ant-row.ant-form-item div.ant-col.ant-form-item-control div.ant-form-item-control-input div.ant-form-item-control-input-content span.ant-input-group.ant-input-group-compact > input.ant-input";
   public static WebElement PropertyAmenity_list_addfield(WebDriver driver){

		      element= driver.findElement(By.cssSelector(property_amenities_addfield));
		     return element;
	
   }
//end  PropertyAmenity_list 
   
 //Check in hour starting day
   
 //from date
   //click the text button foe calendar
   public static WebElement From_DateRange(WebDriver driver){

	      element= driver.findElement(By.id("basic_checkIn"));
	     return element;
		   }
   
   
   //Check out hour starting day
   
   //to date
     //click the text button foe calendar
     public static WebElement To_DateRange(WebDriver driver){

  	      element= driver.findElement(By.id("basic_checkOut"));
  	     return element;
  		   }
     //ok button after selecting date from calendar
     static String daterange_okbutton="//body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/button[1]/span[1]";
     public static WebElement DateRange_okbutton(WebDriver driver){

 	      element= driver.findElement(By.xpath(daterange_okbutton));
 	     return element;
 		   }
     
   
// Price Details
   //Price Per Night
	   
   
   public static WebElement Price_pernight(WebDriver driver){

		      element= driver.findElement(By.id("basic_price"));
		     return element;
			   }	   
	//Booking price   
   
   public static WebElement Price_Booking(WebDriver driver){

	      element= driver.findElement(By.id("basic_bookingPrice"));
	     return element;
		   }
//min booking days
   
   public static WebElement Price_BookingDay(WebDriver driver){

	      element= driver.findElement(By.id("basic_minBookingDays"));
	     return element;
		   }
   
   
   
  // Discount Details
   //Discount Type
   static String Discount_class="//span[contains(text(),'FLAT')]";
   public static WebElement Discount_Class(WebDriver driver){

	      element= driver.findElement(By.xpath(Discount_class));
	     return element;
		   }
   
// //Flat Price
   //this part is an not find sendkey so we follow another way
//   public static WebElement Flat_Price(WebDriver driver){
//
//	      element= driver.findElement(By.xpath("//input[@id='basic_flatPrice']"));
//	     return element;
//		   }
   
   //Min Booking Days 
   public static WebElement Min_BookingDays(WebDriver driver){

	      element= driver.findElement(By.id("basic_discountMinBookingDays"));
	     return element;
		   }
   
   
   //Additional Fee
   //title
   static String additionFee_title="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
   public static WebElement AdditionFee_Title(WebDriver driver){

		      element= driver.findElement(By.xpath(additionFee_title));
		     return element;
			   }
   //price
   static String additionFee_price="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]";
   public static WebElement AdditionFee_Price(WebDriver driver){

		      element= driver.findElement(By.xpath(additionFee_price));
		     return element;
			   }
   
   //+ button click after put value in title and price
   
   static String additionFee_okbutton="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]/span[1]/*[1]";
   public static WebElement AdditionFee_Okbutton(WebDriver driver){

		      element= driver.findElement(By.xpath(additionFee_okbutton));
		     return element;
			   }
   //delete additional fee
   
   static String additionFee_calcelButton="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/span[1]";
   public static WebElement AdditionFee_Cancelbutton(WebDriver driver){

		      element= driver.findElement(By.xpath(additionFee_calcelButton));
		     return element;
			   }
   
   //end additional fee
   
   
   
   //Set Special Date Range (Optional)
   
   //from date
   //click the text button foe calendar
   public static WebElement Special_DateRange(WebDriver driver){

	      element= driver.findElement(By.id("basic_from"));
	     return element;
		   }
   //delete the date set
   static String delete_specialDate="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[14]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]/span[1]/*[1]";
   public static WebElement Delete_SpecialDate(WebDriver driver){

	      element= driver.findElement(By.xpath(delete_specialDate));
	     return element;
		   }
   //end from date
   
   //to date
   public static WebElement Special_DateRange_to(WebDriver driver){

	      element= driver.findElement(By.id("basic_to"));
	     return element;
		   }
   
   //Set Special Price
   
   public static WebElement Special_Price(WebDriver driver){

	      element= driver.findElement(By.id("basic_specialPrice"));
	     return element;
		   }
   
   //Weekend Price
   public static WebElement Weekend_Price(WebDriver driver){

	      element= driver.findElement(By.id("basic_weekendPrice"));
	     return element;
		   }
   
   //click the next button
   static String next_button="//span[contains(text(),'Next')]";
   public static WebElement Next_button(WebDriver driver){

	      element= driver.findElement(By.xpath(next_button));
	     return element;
		   }
   
   
   
}
