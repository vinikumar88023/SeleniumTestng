import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitWat {
	public static void main(String[] args) throws InterruptedException {
		String execptitile = "Demo Guru99 page";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.get("http://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(20000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-shirts");
		
		
		
	}

}
