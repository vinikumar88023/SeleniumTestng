import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crosbrowserTest {
	
	WebDriver driver;
	@Test
	@Parameters ("browser")
	public void beforeclas(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println("Chromedriver run sucessfully");
	}
else if ((browser.equalsIgnoreCase("edge"))){
	
	WebDriverManager.edgedriver().setup();
	 driver = new EdgeDriver();
	driver.get("https://www.amazon.in");
	System.out.println("edgedriver run sucessfully");
		}
	}
	
	
	@Test 
	public void testcase1() {
		String title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	 String originaltitile=driver.getTitle();
	 System.out.println("Verify the title : " + originaltitile);
	Assert.assertEquals(originaltitile, title);
	 }
	
	@Test 
	@Parameters ("productName")
	public void testcase2(String productName) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
		driver.findElement(By.id("nav-search-submit-button")).click();
     System.out.println("testcase2 : Opening the Webbrowser ");
	}
	@Test
	public void testcase3() {
		//driver.findElement(By.xpath("//*[text() =  \"Solid Men's Round Neck Cotton Blend Half Sleeve T-Shirts\"]")).click();
	System.out.println("Program run scuessfully");
	 System.out.println("testcase3 : click on the search button and also the add the Tshirts text");

	}
}
