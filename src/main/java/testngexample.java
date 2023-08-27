import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testngexample {

	WebDriver driver;
	@Test 
	public void testcase1() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	              }
	@Test 
	public void testcase2() {
		driver.get("https://www.amazon.in");
     System.out.println("testcase2 : Opening the Webbrowser ");
	}
	@Test 
	public void testcase3() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tshirts");
	System.out.println("Program run scuessfully");
	 System.out.println("testcase3 : click on the search button and also the add the Tshirts text");
}
    @BeforeClass
	public void beforemethod() {
		System.out.println("We are printing the Before method name ============================");
	}
    
    @AfterClass
    public void Aftermethod() {
		System.out.println("We are printing the After method name ---------------------------------");
	}
}
