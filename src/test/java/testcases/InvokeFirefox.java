package testcases;

import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hello\\Documents\\SELENIUM\\Browser_Executables\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://way2automation.com/");
		
	}

}
