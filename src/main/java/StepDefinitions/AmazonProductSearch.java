package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonProductSearch {
	String path = "D:\\Selenium_drivers\\geckodriver.exe";
//	System.setProperty("webdriver.gecko.driver", path);
	WebDriver Driver = new FirefoxDriver();
		
	@Given("^user is on amazon page$")
	public void user_is_on_amazon_page() throws Throwable {
		/*driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		*/
		throw new PendingException();
	}

	@When("^user enters productName in search textBox$")
	public void user_enters_productName_in_search_textBox() throws Throwable {
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Inspiron");
		driver.findElement(By.className("nav-input")).click();*/
		
		throw new PendingException();
	}

	@When("^user clicks on textBox$")
	public void user_clicks_on_textBox() throws Throwable {

		throw new PendingException();
	}

	@When("^user checks all products$")
	public void user_checks_all_products() throws Throwable {

		throw new PendingException();
	}

	@Then("^user sort items by relevance$")
	public void user_sort_items_by_relevance() throws Throwable {
		
		throw new PendingException();
	}

}
