package com.imi.script;

import org.testng.annotations.Test;

import com.imi.genericlib.FileLib;
import com.imi.genericlib.baseTest;
import com.imi.genericlib.webdrivercommomLib;
import com.imi.pages.customviewPage;
import com.imi.pages.editAccount;
import com.imi.pages.editaccountDetails;
import com.imi.pages.homePage;
import com.imi.pages.loginPage;

public class editrescentItems extends baseTest {

	@Test
	public void verify() throws Throwable {
		baseTest bt=new baseTest();
		bt.openBrowser();
		
		loginPage lp=new loginPage();
		FileLib flib=new FileLib();
		lp.logintoappn(flib.readpropData(PROP_PATH, "username"), flib.readpropData(PROP_PATH, "password"));
		
		webdrivercommomLib wlib=new webdrivercommomLib();
		
		wlib.verify(wlib.getpageTitle(), flib.readpropData(PROP_PATH, "homeTitle"), "home page is displayed");
		homePage hp=new homePage();
		hp.clickaccountsTab();
		
		wlib.verify(wlib.getpageTitle(), flib.readpropData(PROP_PATH, "accountstab"), "displaying custom view details");
		customviewPage cv=new customviewPage();
		cv.clickrescentitemslink();
		
		wlib.verify(wlib.getpageTitle(), flib.readpropData(PROP_PATH, "accountDetails"), "Account Details Page");
	    editaccountDetails ed=new editaccountDetails();
	     ed.editbtn();
	     
	     wlib.verify(wlib.getpageTitle(), flib.readpropData(PROP_PATH, "editaccount"), "edit account details");
	     editAccount ea=new editAccount();
	     ea.accountnametB(flib.readexcelData(EXCEL_PATH, "createlead", 1, 0));
	     
	     wlib.verify(wlib.getpageTitle(), flib.readpropData(PROP_PATH, "accountDetails"), "Account Details");
	    
	}
}
