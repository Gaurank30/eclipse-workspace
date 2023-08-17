package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\EcLIPS\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222"); 
		WebDriver driver = new ChromeDriver(options); 
		//name field on contact us page of abodeqa 
		driver.findElement(By.id("g1280-name")).sendKeys("abodeqa"); 
		//Email id field 
		driver.findElement(By.id("g1280-email")).sendKeys("abodeqa@gmail.com"); 
		//website 
		driver.findElement(By.id("g1280-website")).sendKeys("https://abodeqa.com"); 
		//comment. 
		driver.findElement(By.id("contact-form-comment-g1280-comment")).sendKeys("This is one sample comment.");
		
		
	}

}