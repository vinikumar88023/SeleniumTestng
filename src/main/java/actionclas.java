import java.awt.event.ActionEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class actionclas {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/keyboard-mouse-events-files-webdriver.html");
		driver.manage().window().maximize();
		Actions builder = new Actions(driver);
		Thread.sleep(2000);
		builder.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		builder.sendKeys(Keys.HOME).perform();
	}

}
