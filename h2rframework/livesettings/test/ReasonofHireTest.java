package org.livesettings.test;

import org.baseclass.BaseClass;
import org.livesettings.pomclass.ReasonofHirePomClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReasonofHireTest extends BaseClass{
	
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
	public void addReasonofHire() throws InterruptedException
	{
		ReasonofHirePomClass rh = new ReasonofHirePomClass();
		Thread.sleep(3000);
		buttonClick(rh.getSettings());
		Thread.sleep(3000);
		buttonClick(rh.getReasonofhire());
		Thread.sleep(3000);
		buttonClick(rh.getAddreasonofhire());
		Thread.sleep(3000);
		fill(rh.getInputreasonofhire(), "SomeAutomationreason");
		Thread.sleep(3000);
		buttonClick(rh.getSubmit());
		
	}
	
	
	@Test(enabled=true,priority=1)
	public void editReasonofHire() throws InterruptedException
	{
		ReasonofHirePomClass rh = new ReasonofHirePomClass();
		Thread.sleep(3000);
		buttonClick(rh.getSettings());
		Thread.sleep(3000);
		buttonClick(rh.getReasonofhire());
		Thread.sleep(3000);
		fill(rh.getSearchbar(), "SomeAuto");
		Thread.sleep(3000);
		buttonClick(rh.getEditbutton());
		Thread.sleep(3000);
		delete(rh.getCleardata());
		Thread.sleep(3000);
		fill(rh.getInputedit(), "AutomationReason12345");
		Thread.sleep(3000);
		buttonClick(rh.getEditsubmit());
		Thread.sleep(3000);
		
		
	}
	
	@Test(enabled=true,priority=2)
	public void deleteReasonofHire() throws InterruptedException
	{
		ReasonofHirePomClass rh = new ReasonofHirePomClass();
		Thread.sleep(3000);
		buttonClick(rh.getSettings());
		Thread.sleep(3000);
		buttonClick(rh.getReasonofhire());
		Thread.sleep(3000);
		fill(rh.getSearchbar(), "AutomationReason");
		Thread.sleep(3000);
		buttonClick(rh.getDeletebutton());
		Thread.sleep(3000);
		buttonClick(rh.getDeletesubmit());
		
	}

}
