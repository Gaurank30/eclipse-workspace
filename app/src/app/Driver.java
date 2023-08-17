package app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Driver {
	

	@SuppressWarnings("unused")
	private static void main() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\EcLIPS\\chromedriver_win32\\chromedriver.exe");
		Driver.get("https://www.spicejet.com/");
		
	}
}


