package Maven_Testng.Maven_Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	// Maven_Testng.Maven_Testng.NewTest
	
  @Test
  public void f()throws InterruptedException {
	  
	  System.out.println("this is my test area1");
  }
  
  @Test
  public void g() {
	  System.out.println("this is my test area2");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is my precondition area1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is my postcondition area2");
  }

}
