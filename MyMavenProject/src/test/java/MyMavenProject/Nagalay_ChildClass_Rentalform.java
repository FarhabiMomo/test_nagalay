package MyMavenProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nagalay_ChildClass_Rentalform {

	@SuppressWarnings("unused")
	private static final WebDriver Driver = null;
	static String NagalAYBaseUrl="http://ec2-54-179-255-33.ap-southeast-1.compute.amazonaws.com:3000/try-hosting/space-rental/rental-form?id=6279f0c43d39305eca909368";

	 static WebElement element_main =null;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//max window
		driver.manage().window().maximize();
		//nagalay baseUrl
		try {
			driver.get(NagalAYBaseUrl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//get the title
		System.out.println(driver.getTitle());
		
		
		
		//Whole Rentalform
		//Property name
		Thread.sleep(1000);
		element_main=Nagalay_SupperClass_Rentalform.login_PropertyName(driver);
		element_main.sendKeys("MOMO");
		

		//Phone Number
		element_main=Nagalay_SupperClass_Rentalform.login_PhoneNumber(driver);
		element_main.sendKeys("01857316111");
		
		
		//email
				element_main=Nagalay_SupperClass_Rentalform.login_Email(driver);
				element_main.sendKeys("momo@gmail.com");
			
				// Additional Contact Info
				element_main=Nagalay_SupperClass_Rentalform.Additional_ContactInfo(driver);
				element_main.sendKeys("napiterpul");
				
				//city
				element_main=Nagalay_SupperClass_Rentalform.login_City(driver);
				element_main.sendKeys("momo@gmail.com");
				
				//State
				
				element_main=Nagalay_SupperClass_Rentalform.State(driver);
				element_main.sendKeys("chowmuhany");
				
				
				//Zip Code
				
				element_main=Nagalay_SupperClass_Rentalform.Zip_Code(driver);
				element_main.sendKeys("123");
				
				//Country
				element_main=Nagalay_SupperClass_Rentalform.login_Country(driver);
				element_main.sendKeys("momo");
				
				
				//StreetAddress
				element_main=Nagalay_SupperClass_Rentalform.StreetAddress(driver);
				element_main.sendKeys("momo");
				
				
				
				//PropertyAddress
				
				//click the address icon 
				element_main=Nagalay_SupperClass_Rentalform.PropertyAddress(driver);
				element_main.click();
				Thread.sleep(1000);
				//cancel the the basic model
				element_main=Nagalay_SupperClass_Rentalform.PropertyAddress_cancel(driver);
				element_main.click();
				Thread.sleep(1000);
				// again click the address icon 
				element_main=Nagalay_SupperClass_Rentalform.PropertyAddress(driver);
				element_main.click();
				
				
				//wait for select the address
				Thread.sleep(1000);
				
				//PropertyAddress ok button
				element_main=Nagalay_SupperClass_Rentalform.PropertyAddress_oK(driver);
				element_main.click();
				
				//end of PropertyAddress
				
				
				//PropertyDescribtion
				element_main=Nagalay_SupperClass_Rentalform.PropertyDescribtion(driver);
				element_main.sendKeys("momo");
				
				Thread.sleep(1000);
				//Property details
				  // Number of bathrooms
				element_main=Nagalay_SupperClass_Rentalform.Number_Bathroom(driver);
				element_main.sendKeys("3");	
				
				// Number of bedrooms
				element_main=Nagalay_SupperClass_Rentalform.Number_Bedrooms(driver);
				element_main.sendKeys("3");	
				
				//Number of beds
				
				element_main=Nagalay_SupperClass_Rentalform.Number_Bed(driver);
				element_main.sendKeys("3");	
				
				//		Adults
				element_main=Nagalay_SupperClass_Rentalform.Adults(driver);
				element_main.sendKeys("3");	
				
				//Children
				
				element_main=Nagalay_SupperClass_Rentalform.Children(driver);
				element_main.sendKeys("3");
				
				//Infants
				element_main=Nagalay_SupperClass_Rentalform.Infants(driver);
				element_main.sendKeys("3");
				
				//Pets
				element_main=Nagalay_SupperClass_Rentalform.Pets(driver);
				element_main.sendKeys("3");
				//End Property details
				
				Thread.sleep(1000);
				
				//Check in hour starting day
				
				
				//PropertyAmenities
				
					String property_Amenities="//span[contains(text(),'Add More')]";
				 Actions builder = new Actions(driver);
				 Thread.sleep(1000);
		       builder.moveToElement(driver.findElement(By.xpath(property_Amenities))).click().build().perform();
			
		      //cancel button 
		       
		       element_main=Nagalay_SupperClass_Rentalform.Amenitylist_CancelButton(driver);
		       Thread.sleep(1000);
			    element_main.click();
			    Thread.sleep(1000);
		       
//			    //error:2nd time starting isnot found 
		       

			       builder.moveToElement(driver.findElement(By.xpath(property_Amenities))).click().build().perform();
			       Thread.sleep(2000);
		     //PropertyAmenity_list	
		       //name
		       element_main=Nagalay_SupperClass_Rentalform.PropertyAmenity_list(driver);
		      // element_main.click();
		       Thread.sleep(1000);
		       element_main.sendKeys("momo");
		       
		      // Thread.sleep(2000);
		       //add field
		       element_main=Nagalay_SupperClass_Rentalform.PropertyAmenity_list_addfield(driver);		   
		       element_main.sendKeys("1234");
		       Thread.sleep(1000);
		     //end PropertyAmenity_list  
		       
		    	       
		     //+ button to add field
		      
		    String addbutton="body.ant-scrolling-effect:nth-child(2) div.ant-modal-root div.ant-modal-wrap div.ant-modal.amenitiy-modal div.ant-modal-content:nth-child(2) div.ant-modal-body div.ant-col.ant-col-md-24 div.ant-row div.ant-col.ant-col-md-20:nth-child(2) div.ant-row.ant-form-item div.ant-col.ant-form-item-control div.ant-form-item-control-input div.ant-form-item-control-input-content span.ant-input-group.ant-input-group-compact button.ant-btn.ant-btn-primary.ant-btn-icon-only span.anticon.anticon-plus > svg:nth-child(1)";
		      
		       builder.moveToElement(driver.findElement(By.cssSelector(addbutton))).click().build().perform();
		       
		     //ok button to add field  
			
		       String add_okbutton="//body/div[4]/div[1]/div[2]/div[1]/div[2]/div[3]/button[2]";
			      
		       builder.moveToElement(driver.findElement(By.xpath(add_okbutton))).click().build().perform();    
		       
		       //Wating time
		       Thread.sleep(1000);
		       
		       //Check in hour starting day
		       // from date calendar
		       //click the date range button to show calendar
		       element_main=Nagalay_SupperClass_Rentalform.From_DateRange(driver);
		       element_main.click(); 
		       String pick_date ="div.ant-picker-dropdown.ant-picker-dropdown-placement-bottomLeft div.ant-picker-panel-container div.ant-picker-panel div.ant-picker-footer ul.ant-picker-ranges li.ant-picker-now > a.ant-picker-now-btn";
		     //Select from date using mouse click
		       Thread.sleep(1000);
		       builder.moveToElement(driver.findElement(By.cssSelector(pick_date))).click().build().perform();
		       //End in hour starting day
		       
		       Thread.sleep(1000);
		       //Check out hour starting day
		       // to date calendar
		      // click the date range button to show calendar
//		       element_main=Nagalay_SupperClass_Rentalform.To_DateRange(driver);
//		       element_main.click(); 
		       Robot rb= new Robot();
		       rb.keyPress(KeyEvent.VK_TAB);
		       rb.keyPress(KeyEvent.VK_ENTER);
		       
		       Thread.sleep(1000);
		       String pick_date2 ="Now";
		     //Select from date using mouse click
		       Thread.sleep(1000);
		       builder.moveToElement(driver.findElement(By.linkText(pick_date2))).click().build().perform();
//		       //End in hour starting day
//		       
//		       
//		      //ok button after selecting date from calendar
//		       element_main=Nagalay_SupperClass_Rentalform.DateRange_okbutton(driver);
//		       element_main.click();
		       
		       
		       
		      // Thread.sleep(6000);
		       
		      // Price Details
		       //Price Per Night
		       
		       element_main=Nagalay_SupperClass_Rentalform.Price_pernight(driver);
		      // element_main.click();
		       element_main.sendKeys("13");
		       
		       //Booking price
		       element_main=Nagalay_SupperClass_Rentalform.Price_Booking(driver);
			      // element_main.click();
			       element_main.sendKeys("12");
			       
			     //min booking days
			       
			       element_main=Nagalay_SupperClass_Rentalform.Price_BookingDay(driver);
				      // element_main.click();
				       element_main.sendKeys("13");
				       
				       // Price Details end
				       
				       
				       
				       
				       // Discount Details
				       //Discount Type
				       //type select textbox clcik
				       element_main=Nagalay_SupperClass_Rentalform.Discount_Class(driver);
					       element_main.click();  
					       
					   //select the dropdown type
						    String Discount_Dropdown="//div[contains(text(),'PERCENTAGE')]";
					       builder.moveToElement(driver.findElement(By.xpath(Discount_Dropdown))).click().build().perform();
	       
					   // Thread.sleep(2000);
					    
					    //Tab for move next field and the field is flat price
					      // Robot rb= new Robot();
					       rb.keyPress(KeyEvent.VK_TAB);
					       
					    // Flat Price
					       //flat price text field value
					       rb.keyPress(KeyEvent.VK_2);
					      
					        
//					       Thread.sleep(5000);
					       
					     //alternative way for flat price
					       //error:because if we follow the way the text field cannot find the send() fuction
//					      // Flat Price
//					       element_main=Nagalay_SupperClass_Rentalform.Flat_Price(driver);
//						       element_main.click();
//						       element_main.sendKeys("12"); 
					       
					       //Tab for move next field and the field is Min Booking Days
					       rb.keyPress(KeyEvent.VK_TAB);
					       
					       	// Min Booking Days 
					      
					element_main=Nagalay_SupperClass_Rentalform.Min_BookingDays(driver);
				 // element_main.click();
			       element_main.sendKeys("3345"); 	
							       
					// Discount Details end
							       
					
					//Additional Fee
					//title		       
				  element_main=Nagalay_SupperClass_Rentalform.AdditionFee_Title(driver);
				element_main.sendKeys("3345"); 
				
				//price			       
							       
				element_main=Nagalay_SupperClass_Rentalform.AdditionFee_Price(driver);
				element_main.sendKeys("3345"); 	
				
				//+ button click after put value in title and price
				
				element_main=Nagalay_SupperClass_Rentalform.AdditionFee_Okbutton(driver);
				element_main.click(); 	
				
				//Again add adition fee form
				//title		       
				  element_main=Nagalay_SupperClass_Rentalform.AdditionFee_Title(driver);
				element_main.sendKeys("3345"); 
				
				//price			       
							       
				element_main=Nagalay_SupperClass_Rentalform.AdditionFee_Price(driver);
				element_main.sendKeys("3345"); 	
				
				//+ button click after put value in title and price
				
				element_main=Nagalay_SupperClass_Rentalform.AdditionFee_Okbutton(driver);
				element_main.click(); 
				
				//cancel additional fee
				element_main=Nagalay_SupperClass_Rentalform.AdditionFee_Cancelbutton(driver);
				element_main.click(); 
				
				//end addition fee
				
				
				
					//Week Day	
							       
					//for friday		       
				  String friday="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[14]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/input[1]";
				  String sunday="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[14]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/input[1]";
				  String thusday="//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[14]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/input[1]";
				  //check friday
			       builder.moveToElement(driver.findElement(By.xpath(friday))).click().build().perform();
			       //uncheck friday
			       builder.moveToElement(driver.findElement(By.xpath(friday))).click().build().perform();
			       //check sunaday
			       builder.moveToElement(driver.findElement(By.xpath(sunday))).click().build().perform();
			       //uncheck sunday
			       //builder.moveToElement(driver.findElement(By.xpath(sunday))).click().build().perform();
			       //check thusday
			       builder.moveToElement(driver.findElement(By.xpath(thusday))).click().build().perform();
			       //uncheck thusday
			      // builder.moveToElement(driver.findElement(By.xpath(thusday))).click().build().perform();
			    
			       //Week Day end
			       
			      // Set Special Date Range (Optional)
			       
			      
			      // from date calendar
			       //click the date range button to show calendar
			       element_main=Nagalay_SupperClass_Rentalform.Special_DateRange(driver);
			       element_main.click(); 
			       String pick_date1 ="div.ant-picker-dropdown.ant-picker-dropdown-placement-bottomLeft div.ant-picker-panel-container div.ant-picker-panel div.ant-picker-date-panel div.ant-picker-body table.ant-picker-content tbody:nth-child(2) tr:nth-child(3) td.ant-picker-cell.ant-picker-cell-in-view:nth-child(3) > div.ant-picker-cell-inner";
			     //Select from date using mouse click
			       builder.moveToElement(driver.findElement(By.cssSelector(pick_date1))).click().build().perform();
			       
			       //delete the date set
			       element_main=Nagalay_SupperClass_Rentalform.Delete_SpecialDate(driver);
			       element_main.click();  
			     
			      //again select date
			     //again click the date range button to show calendar
			       element_main=Nagalay_SupperClass_Rentalform.Special_DateRange(driver);
			       element_main.click(); 
			     // Again Select from date using mouse click
			       builder.moveToElement(driver.findElement(By.cssSelector(pick_date1))).click().build().perform();
			       
			    // from date calendar end
			    
			    // to date calendar
			     //click the date range button to show calendar
			       element_main=Nagalay_SupperClass_Rentalform.Special_DateRange_to(driver);
			      element_main.click(); 
			       Thread.sleep(1000);
//			       error:this part isnot working,i need to check again,the calender date isnot picking
		       String pick_date_to="Today";
		       //Thread.sleep(2000);
		       builder.moveToElement(driver.findElement(By.linkText(pick_date_to))).click().build().perform();
//	
	
			       //Set Special Price
			       element_main=Nagalay_SupperClass_Rentalform.Special_Price(driver);
				      element_main.click(); 
				      element_main.sendKeys("17"); 
				      
				      //Weekend Price
				      element_main=Nagalay_SupperClass_Rentalform.Weekend_Price(driver);
				      element_main.click(); 
				      element_main.sendKeys("17"); 
				      
				      //next button
				      element_main=Nagalay_SupperClass_Rentalform.Next_button(driver);
				      element_main.click();  
				      
				      
	}
	
			

}

	
	