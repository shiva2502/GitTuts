package fireFoxBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {
		
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\cva\\Downloads\\firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.flipkart.com/");
		driver.getTitle();
		//driver.close();

	}
	
}
