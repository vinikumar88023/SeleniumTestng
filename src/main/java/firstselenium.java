import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstselenium {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement  searchbutton =driver.findElement(By.id("twotabsearchtextbox"));
		
		searchbutton.sendKeys("AC whirlpool");
		
		WebElement submitbutton= driver.findElement(By.id("nav-search-submit-button"));
		System.out.println(submitbutton.isEnabled());
		submitbutton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id, 'low-price')]")).sendKeys("10000");
		driver.findElement(By.xpath("//input[ contains (@placeholder, 'Max')]")).sendKeys("30000");
		driver.findElement(By.xpath("//*[contains (@class, \"a-button-input\")]")).click();
		driver.navigate().refresh();
		
	}

}
