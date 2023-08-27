package StepsDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class registration {
	WebDriver driver;
	@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     
	}

	@Given("Hit the valid website url")
	public void hit_the_valid_website_url() throws InterruptedException {
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(3000);
	}

	@Given("Add the firstname and Lastname in Registraton page")
	public void add_the_firstname_and_lastname_in_registraton_page() throws InterruptedException {
		driver.findElement(By.id("fname")).sendKeys("Vinit");
		driver.findElement(By.id("lname")).sendKeys("Kumar");
		Thread.sleep(3000);
	}

	@When("Select the dropdown in Registraton page")
	public void select_the_dropdown_in_registraton_page() throws InterruptedException {
		WebElement dorp = driver.findElement(By.id("option"));
	    Select slt = new Select(dorp);
	    slt.selectByIndex(1);
	    Thread.sleep(3000);
	}

	@Then("Validate the registraiton process")
	public void validate_the_registraiton_process() {
	  String Tittle = driver.getTitle();
	  System.out.println("Tittle of WebSite "+Tittle);
	}
}
