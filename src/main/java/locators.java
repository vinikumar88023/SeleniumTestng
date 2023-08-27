import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		
driver.manage().window().maximize();
		
		driver.findElement(By.id ("twotabsearchtextbox")).sendKeys("AC Whirlpool"); // absolute xpath
		Thread.sleep(2000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id = 'low-price' or @placeholder= 'M']")).sendKeys("10000"); // relative xpath 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[starts-with(@id, 'high')]")).sendKeys("25000");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[starts-with(@aria-labelledby, 'a-autoid-1')] ")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[text()= 'Air conditioner Indoor Unints (1.5 TON FOR BLUE STAR)']")).click();
	Thread.sleep(2000);
	driver.quit();
	//driver.close();

	}
}
