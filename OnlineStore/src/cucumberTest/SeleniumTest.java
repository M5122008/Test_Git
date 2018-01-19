package cucumberTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class SeleniumTest {
		
	
		
		public static void main(String[] args) throws InterruptedException {
	System.out.println("Good morning");
        System.out.println("Welcome");
		WebDriver driver = new FirefoxDriver();		
        String baseUrl = "http://automationpractice.com/index.php?controller=my-account";
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Thread.sleep(2000);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("vermavarsha@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Test@123");
        Thread.sleep(2000);
        driver.findElement(By.id("SubmitLogin")).click();
        System.out.println("logged in successfully");
        Thread.sleep(4000);
        driver.findElement(By.linkText("Sign out")).click();
        System.out.println("logged out successfully");
        //driver.quit();
 
        
        
		/*private static WebDriver driver = null;
		public static void main(String[] args) {
			// Create a new instance of the Firefox driver
	 
	        driver = new FirefoxDriver();
	 
	        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        //Launch the Online Store Website
	 
	        driver.get("http://www.store.demoqa.com");
	 
	        // Find the element that's ID attribute is 'account'(My Account) 
	 
	        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	        // Find the element that's ID attribute is 'log' (Username)
	 
	        // Enter Username on the element found by above desc.
	 
	        driver.findElement(By.id("log")).sendKeys("testuser_1"); 
	 
	        // Find the element that's ID attribute is 'pwd' (Password)
	 
	        // Enter Password on the element found by the above desc.
	 
	        driver.findElement(By.id("pwd")).sendKeys("Test@123");
	 
	        // Now submit the form. WebDriver will find the form for us from the element 
	 
	        driver.findElement(By.id("login")).click();
	 
	        // Print a Log In message to the screen
	 
	        System.out.println("Login Successfully");
	 
	        // Find the element that's ID attribute is 'account_logout' (Log Out)
	 
	        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	 
	        // Print a Log In message to the screen
	 
	        System.out.println("LogOut Successfully");
	 
	        // Close the driver
	 	System.out.println("closing all the windows");
		System.out.println("changing some text");
	        driver.quit();
		*/
	}
}
