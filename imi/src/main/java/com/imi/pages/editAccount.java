package com.imi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imi.genericlib.baseTest;

public class editAccount {
	
	@FindBy(xpath="//input[@name='property(Account Name)']") private WebElement accountnametB;
	@FindBy(xpath="(//input[@class='button'])[2]") private WebElement saveBtn;
	
public editAccount() {
	PageFactory.initElements(baseTest.driver, this);
}
public void accountnametB(String antb) {
	accountnametB.sendKeys(antb);
	saveBtn.click();
}
}







