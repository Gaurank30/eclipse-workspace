package testNG;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	ChromeDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "F:\\EcLIPS\\chromedriver_win32\\chromedriver.exe");
	  
	  
	  driver = new ChromeDriver();
  	  String url = ("https://www.spicejet.com");
  	  driver.get(url);
  	  
  	
  }
  @BeforeMethod
  public void beforeMethod() {
  	  System.out.println("Starting the browser session");
  }
 
  @AfterMethod
  public void afterMethod() {
  	  System.out.println("https://www.spicejet.com..");
  	  
  }

}
