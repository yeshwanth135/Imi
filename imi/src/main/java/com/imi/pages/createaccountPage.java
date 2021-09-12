package com.imi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imi.genericlib.baseTest;

public class createaccountPage {
	
	@FindBy(xpath="//input[@name='property(Account Name)']") private WebElement accountnameTB;
	@FindBy(xpath="(//input[@name='Button'])[1]") private WebElement saveBtn;
	
	public createaccountPage()
	{
		PageFactory.initElements(baseTest.driver, this);
	}
	public void createaccountwithmandatoryDetails(String accountName) {
		accountnameTB.sendKeys(accountName);
		saveBtn.click();
	}

}
