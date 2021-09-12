package com.imi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imi.genericlib.baseTest;

public class homePage {
	@FindBy(xpath="//a[text()='Accounts']") private WebElement accountsTab;
	@FindBy(xpath="//a[text()='leads']") private WebElement leadsTab;
	
	public homePage() {
		PageFactory.initElements(baseTest.driver, this);
	}
	public void clickaccountsTab() {
		accountsTab.click(); 
	}
	public void clickleadsTab() {
		leadsTab.click();
	}

}
