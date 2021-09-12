package com.imi.genericlib;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class webdrivercommomLib {
	public void verify(String actualTitle,String expectedTitle,String page) {
		if(actualTitle.equals(expectedTitle)) {
			System.out.println(page+ " is displayed, pass");
		}else {
			System.out.println(page+ " is not displayed, fail");
		}
	}
	public String getpageTitle() {
		String title=baseTest.driver.getTitle();
		return title;
		}
    public void waitforpageTitle(String title) {
    	WebDriverWait wait=new WebDriverWait(baseTest.driver,20);
    	wait.until(ExpectedConditions.titleContains(title));
    }
    public void selectOption(WebElement element,String text) {
    	Select sel=new Select(element);
    	sel.selectByValue(text);
    }
    public void selectOption(String value,WebElement element) {
    	Select sel=new Select(element);
    	sel.selectByValue(value);
    }
    public void selectOption(WebElement element,int index) {
    	Select sel=new Select(element);
    	sel.deselectByIndex(index);
    }
    public void mouseHover(WebElement element) {
    	Actions ac=new Actions(baseTest.driver);
    	ac.moveToElement(element).perform();
    }
    public void rightClick(WebElement element) {
    	Actions ac= new Actions(baseTest.driver);
    	ac.contextClick(element).perform();
    }
    public void getpagescreenShot(String path) {
    	TakesScreenshot ts=(TakesScreenshot)baseTest.driver;
    	File src=ts.getScreenshotAs(OutputType.FILE);
    	File dest=new File(path);
    	try {
    		Files.copy(src, dest);
          }catch (Exception e) {
			e.printStackTrace();
		}
    }
    public void switchtoFrame(int index) {
    	baseTest.driver.switchTo().frame(index);
    	}
    public void switchtoFrame(String value) {
    	baseTest.driver.switchTo().frame(value);
    }
    public void switchtoFrame(WebElement element) {
    	baseTest.driver.switchTo().frame(element);
    }
} 