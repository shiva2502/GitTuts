package SeDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DebugDemo {
	
	WebDriver driver = null ;

	@Test
public void pass() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\cva\\Downloads\\firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.flipkart.com/");
		driver.getTitle();
		driver.close();

}

	@Test
public void fail ()
{
		//WebDriver driver = new FirefoxDriver();	
	
		driver.close();
}
}
