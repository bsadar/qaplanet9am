package MGID.MAID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//this is update by sadar
public class LgTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.manage().window().maximize();
		
	    bo.get("http://apps.qaplanet.in/qahrm/login.php");
	   // bo.getTitle();
		System.out.println( bo.getTitle());
		
		bo.close();
  }
}
