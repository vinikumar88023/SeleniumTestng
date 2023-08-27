import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class windowhandles {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		String mainWindow = driver.getWindowHandle();
		System.out.println("main windonw id "+ mainWindow);
	   Set<String> st = driver.getWindowHandles();
	   System.out.println("Set of Window id"+st);
		
	   Iterator<String> li = st.iterator();
	   while(li.hasNext()) {
		   String childWindow = li.next();
		   if(!mainWindow.equalsIgnoreCase(childWindow)) {
			   driver.switchTo().window(childWindow);
			   driver.findElement(By.name("emailid")).sendKeys("vinikumar671@gmail.com");
				driver.findElement(By.name("btnLogin")).click(); 
		   }
		   
		   
	   }
	   driver.quit();
		driver.switchTo().window(mainWindow);
		
		}
}
