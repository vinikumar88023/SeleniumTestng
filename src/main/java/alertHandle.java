import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertHandle {
		public static void main(String[] args) throws InterruptedException {
			 
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			driver.findElement(By.name("cusid")).sendKeys("2134231");
			driver.findElement(By.name("submit")).click();
			Thread.sleep(2000);
		String s1	= driver.switchTo().alert().getText();
		System.out.println(s1);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			String s2 =driver.switchTo().alert().getText();
			System.out.println(s2);
			driver.switchTo().alert().accept();
			
			
		}
}
