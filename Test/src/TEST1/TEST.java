package TEST1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST {

	
	public static void main(String [] args) throws InterruptedException


{
		
	System.setProperty("webdriver.chrome.driver", "F:\\EcLIPS\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://techreviewers.co/");
	
	WebElement Signin=driver.findElement(By.xpath("//*[@id=\"main_header\"]/div[1]/div/div[2]/a"));
	Signin.click();
	
	WebElement Email=driver.findElement(By.xpath("//*[@id=\"formBasicPassword\"]"));
	Email.sendKeys("babaa@yopmail.com");
	
	Thread.sleep(1000);
	
	WebElement password=driver.findElement(By.xpath("//*[@id=\"formBasicPassword\"]"));
	password.sendKeys("Baba@12345");
}
}
	
	//WebElement xyz=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	//xyz.sendKeys("standard_user");
	
	
	//WebElement xyza=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
	//xyza.sendKeys(Keys.ARROW_DOWN);//

	//WebElement xyzab=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
	//xyzab.sendKeys(Keys.ENTER);//
	
	//Thread.sleep(500);
	
	//WebElement Signin=driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/a"));
	//Signin.click();//
	
	//WebElement Email=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
	//Email.sendKeys("gaurankzerbade5159@gmail.com");//
	
	
	
	
	//WebElement Next=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
	//Next.click();
	
	//WebElement forget=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button"));
	//forget.click();
	
	
	
	
	
	//WebElement create=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span"));
	//create.click();
	
	
	
	//WebElement create1=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li[1]"));
	//create1.click();
	
	
	//WebElement create2=driver.findElement(By.xpath("//*[@id=\\\"view_container\\\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span"));
	//create2.sendKeys(Keys.ARROW_DOWN);
	
	//WebElement create3=driver.findElement(By.xpath("//*[@id=\\\"view_container\\\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span"));
	//create3.sendKeys(Keys.ENTER);
			
	
	


	
	
	

