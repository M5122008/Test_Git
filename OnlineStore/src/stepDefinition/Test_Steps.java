package stepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	private static WebDriver driver;
	@Given("^User is on Sign in Page$")
	public void user_is_on_Sign_in_Page() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();		
        String baseUrl = "http://automationpractice.com/index.php?controller=my-account";
        driver.manage().window().maximize();
        driver.get(baseUrl);
	    
	}

	@When("^User Navigate to Sign in Page$")
	public void user_Navigate_to_Sign_in_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Sign in")).click();
	    
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("passwd")).sendKeys(password);
        
        driver.findElement(By.id("SubmitLogin")).click();
        
	    
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("logged in successfully");
	    
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    
	    driver.findElement(By.linkText("Sign out")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    System.out.println("logged out successfully");
	}



}
