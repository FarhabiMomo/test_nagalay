package MyMavenProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nagalay_Child_SpaceRental {

	@SuppressWarnings("unused")
	private static final WebDriver Driver = null;
	 static WebElement element_main =null;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//max window
		driver.manage().window().maximize();
		
		
		//nagalay baseUrl
		String NagalAYBaseUrl="http://ec2-54-179-255-33.ap-southeast-1.compute.amazonaws.com:3000/space-rental";
		driver.get(NagalAYBaseUrl);
		
		//Rental Space type click
		element_main=Nagalay_SupperClass_SpaceRental.SpaceRentalType_Click(driver);
		//Thread.sleep(1000);
		element_main.click();
		
		Thread.sleep(2000);
		//Rental Space type dropdown select one
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRentalType_Selectone(driver);
				Thread.sleep(2000);
				element_main.click();
	 //Select location
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental_Location(driver);
				
				element_main.click();
				
				//Wait for selecting the location
				
				Thread.sleep(3000);
				
				//error:UI break ,for this reason itis not working
				 //Select location ok button
//				element_main=Nagalay_SupperClass_SpaceRental.spacerental_location_OkButton(driver);
//				Thread.sleep(3000);
//				element_main.click();
				
				//check in and check out
				//Select check in button
				
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__CheckIn(driver);
				
				element_main.click();
				
				Thread.sleep(3000);
				//Select check in button in day
				
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__CheckIn_Day(driver);
				Thread.sleep(3000);
				//click for check in
				element_main.click();
				//click for check out
				Thread.sleep(3000);
				element_main.click();
				
				// end check in and check out
				
				
				//head count
				
				
				//Select Head count click 
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__HeadCount(driver);
				element_main.click();
				
				//adult headcount
				//Select Head count click(+ count add)
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__HeadCount_Adult(driver);
				//add head
				element_main.click();
				Thread.sleep(1000);
				// again add head
				element_main.click();
				Thread.sleep(1000);
				// again add head
				element_main.click();
				// end head count
				
				Thread.sleep(1000);
				//Select Head count click(- count dec)
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__HeadCount_Adult1(driver);
				//decrease head
				element_main.click();
				//end adult headcount
				
				//children headcount
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__HeadCount_Children(driver);
				//decrease head
				element_main.click();
				element_main.click();
				
				//Infants headcount
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__HeadCount_Infants(driver);
				//increase head
				element_main.click();
				
				//pet headcount
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__HeadCount_Pet(driver);
				//increase head
				element_main.click();
				
				//error:becuase of UI break
				//head count ok button
//				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__HeadCount_Okbutton(driver);
//				element_main.click();
				
				//search bar click
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__SearchButton(driver);
				element_main.click();
				
				
				
				
				 //another page go to the <a> tag link
				   //space rental/result with map
				Thread.sleep(4000);
				
				 //price button click
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__Price(driver);
				Thread.sleep(2000);
				element_main.click();
				Thread.sleep(3000);
				
				//cancel button click
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__Price_CancelButton(driver);
				element_main.click();
				Thread.sleep(3000);
			
				//again price button click
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__Price(driver);
				element_main.click();
				Thread.sleep(3000);
				
				//price starting range textbox value
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__Price_StartValue(driver);
				element_main.click();
				Thread.sleep(1000);
				 Robot rb= new Robot();
			       rb.keyPress(KeyEvent.VK_CONTROL);
			       rb.keyPress(KeyEvent.VK_A);
			       rb.keyPress(KeyEvent.VK_CONTROL);
			       rb.keyPress(KeyEvent.VK_DELETE);
			       Thread.sleep(1000);
				element_main.sendKeys("3444");
				Thread.sleep(3000);
				//price starting range textbox value
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__Price_EndValue(driver);
                element_main.click();
                rb.keyPress(KeyEvent.VK_CONTROL);
			       rb.keyPress(KeyEvent.VK_A);
			       rb.keyPress(KeyEvent.VK_CONTROL);
			       rb.keyPress(KeyEvent.VK_DELETE);
			       Thread.sleep(1000);
				element_main.sendKeys("7000");
				
				//price ok button clcik
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__Price_OkButton(driver);
                element_main.click();
                
                
                
                //customize filter click
                element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__CustomizeFliter_Click(driver);
                element_main.click();
                
                Thread.sleep(1000);
                //customize filter click X button
                
                element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__CustomizeFliter_CrossButton(driver);
                Thread.sleep(3000);
                element_main.click();
                
                Thread.sleep(3000);
              //customize filter click
                element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__CustomizeFliter_Click(driver);
                element_main.click();
                
                
                Thread.sleep(3000);
                //Guest Details
              //pet headcount
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__HeadCount_Pet1(driver);
				//increase head
				Thread.sleep(3000);
				element_main.click();
				
				Thread.sleep(3000);
				//Amenities
				// TOILETRIES AMENITIES
				
//				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__ToiletAmenities1(driver);
//				Thread.sleep(3000);
//				element_main.click();
//				Thread.sleep(3000);
//				element_main.click();
			
				 //customize filter search
				element_main=Nagalay_SupperClass_SpaceRental.SpaceRental__CustomizeFilter_Serach(driver);
				//increase head
				Thread.sleep(3000);
				element_main.click();
}
	
}