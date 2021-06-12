package org.Regressinion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {
	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","D:\\Java\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

}
