package secondProjectAutomationJuly;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {
	WebDriver driver = new ChromeDriver ();
	}
@BeforeTest
public void mySetup () {
driver.get ("http://127.0.0.1:5500/index.html") ;
driver.manage().window().maximize ();
}
@Test
public void myTest () {
 WebElement userNameInput = driver.findElement(By.id("input1"));
 WebElement passWordInput = driver.findElement(By.id("input2"));
 WebElement mobileNumberInput = driver.findElement(By.id("input3"));
 WebElement dateOfBirth = driver.findElement (By.id("input4"));
 userNameInput.sendKeys("ahmad"); 
 passWordInput.sendKeys ("ilovemyMom");
 mobileNumberInput.sendKeys("0797700235");
 dateOfBirth.sendKeys("10/02/1993");
}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            