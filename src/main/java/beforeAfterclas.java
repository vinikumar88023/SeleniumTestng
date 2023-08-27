import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class beforeAfterclas {
	WebDriver driver;
	@BeforeClass (groups = {"smoke", "sanity"})
	public void beforeclas() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println("Chromedriver run sucessfully");
	}
	@Test (groups = {"smoke", "sanity"})
	public void testcase1() {
		String title = "Online Shopping site in India: Shop nline for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	 String originaltitile=driver.getTitle();
	 System.out.println("Verify the title : " + originaltitile);
	Assert.assertEquals(originaltitile, title);
	
	              }
	@Test (groups = {"smoke", "sanity"})
	@Parameters ("productName")
	public void testcase2(String productName) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
		driver.findElement(By.id("nav-search-submit-button")).click();
     System.out.println("testcase2 : Opening the Webbrowser ");
	}
	@Test(groups = "sanity") 
	public void testcase3() {
		//driver.findElement(By.xpath("//*[text() =  \"Solid Men's Round Neck Cotton Blend Half Sleeve T-Shirts\"]")).click();
	System.out.println("Program run scuessfully");
	 System.out.println("testcase3 : click on the search button and also the add the Tshirts text");
}
	@AfterClass
	public void afteclas() throws InterruptedException {
		
		driver.quit();
	}
	@BeforeGroups("sanity")
	public void beforegroup() throws InterruptedException {
		Thread.sleep(2000);
		
	}
	
}
