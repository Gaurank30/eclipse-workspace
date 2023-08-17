package tech;

public class WebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bharattoken.org/fairbet/");
	}

	private Object manage() {
		// TODO Auto-generated method stub
		return null;
	}

}
