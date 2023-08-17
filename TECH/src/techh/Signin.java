package techh;


public class Signin {
	public static void main(String[] args) throws InterruptedException {

	// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","D:\\WebDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://bharattoken.org/fairbet/");

	}
}

