package E_Commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void FlipkartTest() {
	  Reporter.log("Opening Flipkart in Browser ", true);
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.Flipkart.com");
	  driver.quit();
  }
}
