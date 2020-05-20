package testcases;

import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChrome {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\Documents\\SELENIUM\\Browser_Executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com/");
		
	}

}
