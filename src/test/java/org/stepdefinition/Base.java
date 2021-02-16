package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void fill(WebElement element, String txt) {

		element.sendKeys(txt);
	}

	public static void btnClick(WebElement element) {

		element.click();
	}
	
	public static void closeBrowser() {
		driver.close();
		

	}
}
