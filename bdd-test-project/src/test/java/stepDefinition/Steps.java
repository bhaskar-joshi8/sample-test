package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps 
{

	String url = "www.google.com";
	WebDriver dri;
	
	@Given("^Open google chrome$")
	public void open_google_chrome () throws Throwable
	{
		System.out.println("open google chrome");
		System.setProperty("webdriver.chrome.driver", "D:\\POC\\Software\\chromedriver_win32\\chromedriver.exe");
		dri = new ChromeDriver();
	}
	
	@And("^Navigate to website$")
	public void Navigate_to_website(String url)
	{
		System.out.println("Navigate to website");
		dri.get(url);		
	}

	@Then("^Site is launched successfully$")
	public void Site_is_launched_successfully()
	{
		System.out.println("Site is launched successfully");
	}
	
	
}
