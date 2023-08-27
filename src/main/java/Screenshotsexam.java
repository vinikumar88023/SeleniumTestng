import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Screenshotsexam {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		SimpleDateFormat spl = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Date date = new Date();
		String todaydate =spl.format(date);
		TakesScreenshot scrhst = ((TakesScreenshot)driver);
	File file	= scrhst.getScreenshotAs(OutputType.FILE);
	Files.copy(file,  new File ("C:\\New folder\\amazon"+todaydate+".png"));
		
	}
}