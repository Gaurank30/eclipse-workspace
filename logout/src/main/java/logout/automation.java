package logout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wb.get("");

		wb.findElement(By.xpath("")).click();
	}

}
