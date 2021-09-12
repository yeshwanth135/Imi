package com.imi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imi.genericlib.baseTest;

public class editaccountDetails {
	
	@FindBy(xpath="(//input[@name='edit2'])[1]") private WebElement editbtn;
	
	public editaccountDetails() {
		PageFactory.initElements(baseTest.driver, this);
		}
	public void editbtn() {
     editbtn.click();		
	}

}
