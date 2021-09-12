package com.imi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imi.genericlib.baseTest;

public class loginPage {
	
	@FindBy(xpath="//input[@id='userName']") private WebElement untb;
	@FindBy(xpath="//input[@id='passWord']") private WebElement pwtb;
	@FindBy(xpath="//input[@type='image']") private WebElement signinBtn;
    
	public loginPage()
	{
		PageFactory.initElements(baseTest.driver, this);
	}

	public WebElement getUntb() {
		return untb;
	}

	public void setUntb(WebElement untb) {
		this.untb=untb;
	}

	public WebElement getPwtb() {
		return pwtb;
	}

	public void setPwtb(WebElement pwtb) {
	     this.pwtb=pwtb;
	}

	public WebElement getSignInBtn() {
		return signinBtn;
	}

	public void setSignInBtn(WebElement signinBtn) {
		this.signinBtn=signinBtn;
	}

	public void logintoappn(String un,String pwd)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		signinBtn.click();
	}
}