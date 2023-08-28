package E_Commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void Ajio() {
	  Reporter.log("Opening Ajio in Browser ", true);
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.ajio.com");
	  driver.quit();
  }
  
}
