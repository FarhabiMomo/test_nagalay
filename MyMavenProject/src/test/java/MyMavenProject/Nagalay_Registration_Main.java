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

public class Nagalay_Registration_Main {

	
	@SuppressWarnings("unused")
	private static final WebDriver Driver = null;
	 static WebElement element_main =null;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//max window
		driver.manage().window().maximize();
		
		
		//nagalay baseUrl
		String NagalAYBaseUrl="http://192.168.10.240:3000/sign-up";
		driver.get(NagalAYBaseUrl);
		
		//FullName
		element_main=Nagalay_Registration_POM.Registration_UserName(driver);
		element_main.sendKeys("Farhabi Mostafa");
		
		//date of birth
		element_main=Nagalay_Registration_POM.Registration_DateOfBirth(driver);
		element_main.click();
		
		//deathofbirth  select from mouse click
	       Actions builder = new Actions(driver);
	       builder.moveToElement(driver.findElement(By.xpath("//tbody/tr[4]/td[3]"))).click().build().perform();

	       Thread.sleep(2000);
	     //gender click
	       element_main=Nagalay_Registration_POM.Registration_Gender(driver);
			element_main.click();
			Thread.sleep(2000);
			//select specific one
	       Robot rb= new Robot();
	       rb.keyPress(KeyEvent.VK_DOWN);
	       rb.keyPress(KeyEvent.VK_ENTER);
	       
	       //email enter
	       element_main=Nagalay_Registration_POM.Registration_Email(driver);
			element_main.sendKeys("momo@gmail.com");
	       
}
}