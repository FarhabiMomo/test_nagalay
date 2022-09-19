package MyMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nagalay_SupperClass_SpaceRental {

	private static WebElement element;
	
	//Rental Space type click
	 static String spacerentalType_click="//small[contains(text(),'Space Rental type')]";
	   public static WebElement SpaceRentalType_Click(WebDriver driver){

	      element= driver.findElement(By.xpath(spacerentalType_click));
	     return element;
	   }
	   
	   
	 //Rental Space type dropdown select one
		 static String spacerentalType_selectone="//p[contains(text(),'SERVICE APT')]";
		   public static WebElement SpaceRentalType_Selectone(WebDriver driver){

		      element= driver.findElement(By.xpath(spacerentalType_selectone));
		     return element;
		   }
		   
		   //Select location
			 static String spacerental_location="//small[contains(text(),'Select Location')]";
			   public static WebElement SpaceRental_Location(WebDriver driver){

			      element= driver.findElement(By.xpath(spacerental_location));
			     return element;
			   }	
			   
			   //Select location ok button
				 static String spacerental_location_okbutton="//span[contains(text(),'Select area')]";
				   public static WebElement spacerental_location_OkButton(WebDriver driver){

				      element= driver.findElement(By.xpath(spacerental_location_okbutton));
				     return element;
				   }
				   //Select check in button
					 static String spacerental__checkin="//small[contains(text(),'Check in')]";
					   public static WebElement SpaceRental__CheckIn(WebDriver driver){

					      element= driver.findElement(By.xpath(spacerental__checkin));
					     return element;     				     
				   }
			   
					   //Select check in button day
						 static String spacerental__checkin_day="//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[4]/div[1]";
						   public static WebElement SpaceRental__CheckIn_Day(WebDriver driver){

						      element= driver.findElement(By.xpath(spacerental__checkin_day));
						     return element;     				     
					   }
						   
					//Select Head count click  
						   
						   static String spacerental__headcount="//small[contains(text(),'Select Head Count')]";
						   public static WebElement SpaceRental__HeadCount(WebDriver driver){

						      element= driver.findElement(By.xpath(spacerental__headcount));
						     return element;     				     
					   }
						   
						   //Select Head count adult +
						   //increase the count
						   static String spacerental__headcount_adult="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/span[2]/*[1]";
						   public static WebElement SpaceRental__HeadCount_Adult(WebDriver driver){

						      element= driver.findElement(By.xpath(spacerental__headcount_adult));
						     return element;     				     
					   }
						   
						   //Select Head count adult -  
						   //decrease the count
						   static String spacerental__headcount_adult1="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/span[1]";
						   public static WebElement SpaceRental__HeadCount_Adult1(WebDriver driver){

						      element= driver.findElement(By.xpath(spacerental__headcount_adult1));
						     return element;     				     
					   }
						   
						 //adult head count end  
						   
						 //children headcount
						   
						   static String spacerental__headcount_children="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/span[2]/*[1]";
						   public static WebElement SpaceRental__HeadCount_Children(WebDriver driver){

						      element= driver.findElement(By.xpath(spacerental__headcount_children));
						     return element;
						   }
						   
						   //Infants headcount
						   
						   static String spacerental__headcount_infants="//div[@class='container']//div[3]//div[2]//span[2]//*[name()='svg']";
						   public static WebElement SpaceRental__HeadCount_Infants(WebDriver driver){

						      element= driver.findElement(By.xpath(spacerental__headcount_infants));
						     return element;
						   }
						   
						   //Pet headcount
						   
						   static String spacerental__headcount_pet="//div[4]//div[2]//span[2]//*[name()='svg']";
						   public static WebElement SpaceRental__HeadCount_Pet(WebDriver driver){

						      element= driver.findElement(By.xpath(spacerental__headcount_pet));
						     return element;
						   }
						   
						   
						   //head count ok button
						   static String spacerental__headcount_okbutton="button[type='button'] span";
						   public static WebElement SpaceRental__HeadCount_Okbutton(WebDriver driver){

						      element= driver.findElement(By.cssSelector(spacerental__headcount_okbutton));
						     return element;
						   }
						   //end of head count
						   
						 //search bar click
						   static String spacerental__searchbutton="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/img[1]";
						   public static WebElement SpaceRental__SearchButton(WebDriver driver){

						      element= driver.findElement(By.xpath(spacerental__searchbutton));
						     return element;
						   } 
						   
						   //end of space rental
						   
						   
						   
						   
						   //another page go to the <a> tag link
						   //space rental/result with map
						 
						   //price
						 //price button click
						   static String spacerental__price="//div[@class='ant-space ant-space-horizontal ant-space-align-center']//div[1]//p[1]";
						   public static WebElement SpaceRental__Price(WebDriver driver){

						      element= driver.findElement(By.xpath(spacerental__price));
						     return element;
						   }
						   
						 //cancel button click
						   static String spacerental__price_cancelbutton="//span[contains(text(),'Clear')]";
						   public static WebElement SpaceRental__Price_CancelButton(WebDriver driver){

						      element= driver.findElement(By.xpath(spacerental__price_cancelbutton));
						     return element;
						   } 
						   
						   
						 //price starting range textbox value
						   static String spacerental__price_startvalue="div.ant-dropdown.ant-dropdown-show-arrow.ant-dropdown-placement-bottom div.container div.filter-price-card div.ant-space.ant-space-horizontal.ant-space-align-center:nth-child(4) div.ant-space-item:nth-child(1) > input.ant-input";
						   public static WebElement SpaceRental__Price_StartValue(WebDriver driver){

						      element= driver.findElement(By.cssSelector(spacerental__price_startvalue));
						     return element;
						   } 
						   
						   
							 //price ending range textbox value
							   static String spacerental__price_endtvalue="div.ant-dropdown.ant-dropdown-show-arrow.ant-dropdown-placement-bottom div.container div.filter-price-card div.ant-space.ant-space-horizontal.ant-space-align-center:nth-child(4) div.ant-space-item:nth-child(2) > input.ant-input";
							   public static WebElement SpaceRental__Price_EndValue(WebDriver driver){

							      element= driver.findElement(By.cssSelector(spacerental__price_endtvalue));
							     return element;
							   } 
					
							   //price ok button click
							   
							   static String spacerental__price_okbutton="div.ant-dropdown.ant-dropdown-show-arrow.ant-dropdown-placement-bottom div.container div.filter-price-card div.ant-space.ant-space-horizontal.ant-space-align-center:nth-child(6) div.ant-space-item:nth-child(2) button.ant-btn.ant-btn-round.ant-btn-default.save-btn > span:nth-child(1)";
							   public static WebElement SpaceRental__Price_OkButton(WebDriver driver){

							      element= driver.findElement(By.cssSelector(spacerental__price_okbutton));
							     return element;
							   } 
							   
							   //end price
							   
							   //customize filter
							   
							   static String spacerental__customizefliter_click="//p[contains(text(),'Customise filter')]";
							   public static WebElement SpaceRental__CustomizeFliter_Click(WebDriver driver){

							      element= driver.findElement(By.xpath(spacerental__customizefliter_click));
							     return element;
							   } 
							   
							   //customize filter click X button
							   
							   static String spacerental__customizefliter_crossbutton="div.ant-dropdown.ant-dropdown-placement-bottom div.container div.customized-filter div.customized-filter-header:nth-child(1) > button.ant-btn.ant-btn-circle.ant-btn-danger.ant-btn-icon-only";
							   public static WebElement SpaceRental__CustomizeFliter_CrossButton(WebDriver driver){

							      element= driver.findElement(By.cssSelector(spacerental__customizefliter_crossbutton));
							     return element;
							   }
							   
							  //Guest Details
							 //Pet headcount
							   
							   static String spacerental__headcount_pet1="//div[4]//div[2]//span[2]//*[name()='svg']";
							   public static WebElement SpaceRental__HeadCount_Pet1(WebDriver driver){

							      element= driver.findElement(By.xpath(spacerental__headcount_pet1));
							     return element;
							   }
							   
							  // Amenities
							  // TOILETRIES AMENITIES
							   
							   static String spacerental__ToiletAmenities1="div.ant-dropdown.ant-dropdown-placement-bottom div.container div.customized-filter div.customized-filter-wrapper:nth-child(3) div.property-details:nth-child(5) div.amenity-wrapper:nth-child(2) label.ant-checkbox-wrapper.ant-checkbox-wrapper-checked:nth-child(2) span.ant-checkbox.ant-checkbox-checked:nth-child(1) > input.ant-checkbox-input";
							   public static WebElement SpaceRental__ToiletAmenities1(WebDriver driver){

							      element= driver.findElement(By.cssSelector(spacerental__ToiletAmenities1));
							     return element;
							   }
							   
							 //customize filter search
							   
							   static String spacerental__customizefilter_serach="//span[contains(text(),'SEARCH')]";
							   public static WebElement SpaceRental__CustomizeFilter_Serach(WebDriver driver){

							      element= driver.findElement(By.xpath(spacerental__customizefilter_serach));
							     return element;
							   }
							   
}
