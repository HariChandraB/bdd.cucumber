package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.Classes.Facebook_Login;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin {

	/*public static WebDriver driver;
	Facebook_Login login ;

	@Given("^user is on fb login page$")
	public void user_is_on_fb_login_page() throws Throwable {

		String path = "D:\\Selenium_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		login = PageFactory.initElements(driver, Facebook_Login.class);
		throw new PendingException();
	}

	@When("^user enters username in username textbox$")
	public void user_enters_username_in_username_textbox() throws Throwable {
		Thread.sleep(3000);
		login.enterUsername("username");

		throw new PendingException();
	}

	@When("^user enters password in password textbox$")
	public void user_enters_password_in_password_textbox() throws Throwable {
		login.enterPassword("Password");
		throw new PendingException();
	}

	@When("^user clicks on logIn button$")
	public void user_clicks_on_logIn_button() throws Throwable {
		login.clickOnLogin();
		throw new PendingException();
	}

	@Then("^user navigates to other page$")
	public void user_navigates_to_other_page() throws Throwable {
		System.out.println("user_navigates_to_other_page");
		throw new PendingException();
	}

	@Then("^user validates the error message$")
	public void user_validates_the_error_message() throws Throwable {
		System.out.println("user_validates_the_error_message");
		throw new PendingException();
	}
*/
}
