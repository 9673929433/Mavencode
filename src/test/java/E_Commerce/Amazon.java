package E_Commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void AmazonTest() {
	  Reporter.log("Opening Amazon in Browser ", true);
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.in");
	  driver.quit();
  }
}
