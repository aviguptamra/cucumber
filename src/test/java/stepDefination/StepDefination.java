package stepDefination;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {
	
	WebDriver driver;
	
	
	@Given("^User must be landed on CRM login$")
	public void user_must_be_landed_on_CRM_login() throws Throwable {
        
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32(87)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");
    }

	 @When("^User enter valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_enter_valid_username_something_and_password_something(String UserName, String Password) throws Throwable {
        
    	driver.findElement(By.name("email")).sendKeys(UserName);
    	driver.findElement(By.name("password")).sendKeys(Password);
    	driver.findElement(By.xpath("//div[text()='Login']")).click();
    	Thread.sleep(5000);
    }

	@Then("^User must be landed on login page$")
	public void user_must_be_landed_on_login_page()  throws Throwable {
       
    	driver.findElement(By.xpath("//span[text()='Avi Gupta']")).isDisplayed();
    	
    }

    @And("^Check user is really login into home page$")
    public void check_user_is_really_login_into_home_page() throws Throwable {
    	
    	driver.findElement(By.xpath("//div[@role='listbox']")).isDisplayed();
        
    }
    
    @When("^User enter username (.+) and password (.+)$")
    public void user_enter_username_and_password(String username, String password) throws Throwable {
     
    {
    	driver.findElement(By.name("email")).sendKeys(username);
    	driver.findElement(By.name("password")).sendKeys(password);
    	driver.findElement(By.xpath("//div[text()='Login']")).click();
    	Thread.sleep(5000);
    }
	

}

}