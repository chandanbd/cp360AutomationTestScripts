package org.livesettings.test;

import org.baseclass.BaseClass;
import org.livesettings.pomclass.CompensationChangeReasonPomClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompensationChangeReasonTest extends BaseClass{
	
	@BeforeMethod 
	public void bfrmthd()     
	{
		//launchBrowsergoogle();
		//launchBrowseredgedriver();
		launchBrowserfirefox();
		maxBrowser();
		loadUrl("https://contactpoint360.h2r.ai/app");
		implictyWait();
		LoginPomClass po = new LoginPomClass();
		fill(po.getEmail(), "estelle123@yopmail.com");
		fill(po.getPasswrd(), "Test@123");
		buttonClick(po.getCheckbox());
		buttonClick(po.getSubmit());
		
	}
	
	@Test(enabled=true,priority=0)
	public void addCompensationchangeReason() throws InterruptedException
	{
		CompensationChangeReasonPomClass cc = new CompensationChangeReasonPomClass();
		Thread.sleep(3000);
		buttonClick(cc.getSettings());
		Thread.sleep(3000);
		buttonClick(cc.getCompensationchangereason());
		Thread.sleep(3000);
		buttonClick(cc.getCcraddreason());
		Thread.sleep(3000);
		fill(cc.getInputccreason(), "SomeAutomationReason");
		Thread.sleep(3000);
		buttonClick(cc.getSubmit());
		
		
		
	}
	
	@Test(enabled=true,priority=1)
	public void editCompensationchangeReason() throws InterruptedException
	{
		CompensationChangeReasonPomClass cc = new CompensationChangeReasonPomClass();
		Thread.sleep(3000);
		buttonClick(cc.getSettings());
		Thread.sleep(3000);
		buttonClick(cc.getCompensationchangereason());
		Thread.sleep(3000);
		fill(cc.getSearchbar(), "someauto");
		Thread.sleep(3000);
		buttonClick(cc.getEditbutton());
		Thread.sleep(3000);
		delete(cc.getCleardata());
		Thread.sleep(3000);
		fill(cc.getInputedit(), "AutomationReason12345");
		Thread.sleep(3000);
		buttonClick(cc.getEditsubmit());
		Thread.sleep(3000);
		
		
		
		
	}
	
	@Test(enabled=true,priority=2)
	public void deleteCompensationchangeReason() throws InterruptedException
	{
		CompensationChangeReasonPomClass cc = new CompensationChangeReasonPomClass();
		Thread.sleep(3000);
		buttonClick(cc.getSettings());
		Thread.sleep(3000);
		buttonClick(cc.getCompensationchangereason());
		Thread.sleep(3000);
		fill(cc.getSearchbar(), "AutomationReason");
		Thread.sleep(3000);
		buttonClick(cc.getDeletebutton());
		Thread.sleep(3000);
		buttonClick(cc.getDeletesubmit());
		
		
		
	}

}
