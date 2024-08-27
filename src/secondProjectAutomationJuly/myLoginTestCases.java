package secondProjectAutomationJuly;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myLoginTestCases {
	WebDriver driver = new ChromeDriver ();

	@BeforeTest
	public void mySetup() {
		driver.manage().window().maximize();
		
	    driver.get("https://www.saucedemo.com/");
	}
	 @Test (priority = 1)
	public void LoginTest() {
		 String Username ="standard_user";
		 String Password ="secert_sauce";
		 
		 WebElement userNameInput = driver.findElement(By.id("user-name"));
		 WebElement PasswordInput = driver.findElement(By.id("password"));
		 WebElement LoginButton = driver.findElement(By.id("Login-button"));
		 
		userNameInput.sendKeys(Username);
		PasswordInput.sendKeys(Password);
		LoginButton.click();
		
		
		
		   
	 }
			
  @Test (priority = 2)
		   
		        public void addToCartAllItems() throws InterruptedException {
	  List<WebElement> addToCartButtons = driver.findElements(By.className("btn"));
     
	  for ( int i= 0 ; i<6; i++) {
		  addToCartButtons.get(i).click();
	  }
	  
      
  }

  @Test(priority = 3)
  public void removeFromCartAllItems() throws InterruptedException {
      List<WebElement> removeButtons = driver.findElements(By.className("btn"));
      for (WebElement button : removeButtons) {
          button.click();
          Thread.sleep(1000);

      }
		
		        
	} 
}
	
	
	
	

