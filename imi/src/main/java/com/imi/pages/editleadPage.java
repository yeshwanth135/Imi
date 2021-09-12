package com.imi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imi.genericlib.baseTest;

public class editleadPage {
	
	@FindBy(xpath="//input[@name='property(Company)']") private WebElement companyTB;
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement lntb;
	@FindBy(xpath="//input[@name='property(Fax)']") private WebElement ftb;
	@FindBy(xpath="(//input[@name='Button'])[1]") private WebElement saveBtn;
	
	public editleadPage() {
		PageFactory.initElements(baseTest.driver, this);
	}
	
	public void editleadswithmandatoryFields(String companyName,String ln,String fax) {
		companyTB.sendKeys(companyName);
		lntb.sendKeys(ln);
		ftb.sendKeys(fax);
		saveBtn.click();
	}

}
