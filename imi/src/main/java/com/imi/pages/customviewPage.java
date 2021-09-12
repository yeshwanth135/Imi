package com.imi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imi.genericlib.baseTest;

public class customviewPage {
	
	@FindBy(xpath="//input[@value='New Account']") private WebElement newaccountsBtn;
	@FindBy(xpath="//input[@value='New lead']") private WebElement newleadsBtn;
	@FindBy(xpath="(//a[text()='hi'])[1]") private WebElement rescentitemslink;
	public customviewPage() {
		PageFactory.initElements(baseTest.driver, this);
	}
	public void clicknewaccountsBtn() {
		newaccountsBtn.click();
	}
	public void clicknewleadsBtn() {
		newleadsBtn.click();
	}
	public void clickrescentitemslink() {
		rescentitemslink.click();
	}

}
