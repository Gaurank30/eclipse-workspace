package gouran;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ssd {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		// options.addExtensions(new File(System.getProperty("user.dir") +
		// "//src//main//a.crx"));
		options.addArguments("--remote-allow-origins=*");

		String userProfilePath = "C:\\Users\\info\\AppData\\Local\\Google\\Chrome\\User Data\\Default";
		options.addArguments("--user-data-dir=" + userProfilePath);
		WebDriver wd = new ChromeDriver(options);
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
