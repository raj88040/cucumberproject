package cucumber;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchstep {
	WebDriver driver;
	
	@Given("User Open chrome browser and enter eBay website")
	public void user_opens_chrome_browser_and_enter_e_bay_website() {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	}
	@When("User selects Arts from the filter dropdown")
	public void user_selects_arts_from_the_filter_dropdown() {
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Art");
			
	}
	@When("User clicks on Search")
	public void user_clicks_on_search() {
		driver.findElement(By.id("gh-btn")).click();
		
	}
	@Then("All the items related to Arts should be displayed.")
	public void all_the_items_related_to_arts_should_be_displayed() {
		String arttext = driver.findElement(By.cssSelector(".title-banner__title")).getText();
		Assert.assertEquals(arttext, "Art");
		System.out.println("Test case passed - validation completed");
		
		
	}
	}
