package com.imi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imi.genericlib.baseTest;

public class Deleteaccount {
	
	@FindBy(xpath="(//input[@name='Delete2'])[1]") private WebElement delete;
	
public Deleteaccount() {
	PageFactory.initElements(baseTest.driver, this);
}
public void deleteAccount() {
	delete.click();
}
}