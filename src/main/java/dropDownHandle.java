import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement drop  = driver.findElement(By.name("country"));
		Select dropdown = new Select(drop);
		
		//dropdown.selectByIndex(12);
		//dropdown.selectByValue("BANGLADESH");
	dropdown.selectByVisibleText("INDIA");
	}
}
