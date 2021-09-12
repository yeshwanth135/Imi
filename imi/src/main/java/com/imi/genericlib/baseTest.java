package com.imi.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.firefox.FirefoxDriver;

public class baseTest implements IAutoConsts {
	 
	public static WebDriver driver;
	
	public void openBrowser() throws Throwable {
		FileLib flib=new FileLib();
		String browser=flib.readpropData(PROP_PATH, "browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
			}else {
				System.out.println("enter correct browsername");
			}
		driver.manage().window().maximize();
		String appurl=flib.readpropData(PROP_PATH, "url");
		driver.get(appurl);
		
		webdrivercommomLib wlib=new webdrivercommomLib();
		wlib.verify(wlib.getpageTitle(), flib.readpropData(PROP_PATH, "loginTitle"), "Loginpage displayed");
		
		
	}
        public void closeBrowser() {
        	driver.quit();
        }
}