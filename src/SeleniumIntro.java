import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
public class SeleniumIntro {
	
	public static void main(String[] args) {
		//step to invoke chrome, firefox driver - selenium manager will take care of this. rather than manually giving the path of driver exe
		
		//Interface - Webdriver, it defines all the method name (empty) and classes implements them 
		//invoking browser
		//chrome 
		//ChromeDriver driver = new ChromeDriver()
		//creating object to call methods present in the driver class
		WebDriver driver = new FirefoxDriver();
		//driver object here access to the methods of Chrome driver which are defined in web Driver interface
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
