package com.qa.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.qa.utils.ReadProperty;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static void SetUPBrowser(String Browser) {
		if(Browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions();
		}
	}
	
	public static void ChromeOptions() {
		ChromeOptions options=new ChromeOptions();
		if(ReadProperty.getProperty("Headless").equalsIgnoreCase("yes")) {
			options.addArguments("--headless");
		}else if(ReadProperty.getProperty("Incognito").equalsIgnoreCase("yes")) {
			options.addArguments("--incognito");
		}else if(ReadProperty.getProperty("Notifications").equalsIgnoreCase("yes")) {
			options.addArguments("-disable--notifications");
		}else {
			throw new Exception("No Key")
		}
	}

}
