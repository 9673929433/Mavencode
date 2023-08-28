package E_Commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class myntra {
  @Test
  public void myntratest() {
	  Reporter.log("Opening Myntra in Browser ", true);
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.myntra.com/");
	  driver.quit();
  }
  }

