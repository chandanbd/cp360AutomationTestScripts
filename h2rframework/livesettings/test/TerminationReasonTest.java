package org.livesettings.test;

import org.baseclass.BaseClass;
import org.livesettings.pomclass.TerminationReasonPomClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TerminationReasonTest extends BaseClass{
	
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
	public void addTerminationReason() throws InterruptedException
	{
		TerminationReasonPomClass tr = new TerminationReasonPomClass();
		Thread.sleep(3000);
		buttonClick(tr.getSettings());
		Thread.sleep(3000);
		buttonClick(tr.getTerminationreason());
		Thread.sleep(3000);
		buttonClick(tr.getTraddreason());
		Thread.sleep(3000);
		fill(tr.getInputreason(), "SomeAutomationReason");
		Thread.sleep(3000);
		buttonClick(tr.getSubmit());
		
		
		
		
	}
	
	
	@Test(enabled=true,priority=1)
	public void editTerminationReason() throws InterruptedException
	{
		TerminationReasonPomClass tr = new TerminationReasonPomClass();
		Thread.sleep(3000);
		buttonClick(tr.getSettings());
		Thread.sleep(3000);
		buttonClick(tr.getTerminationreason());
		Thread.sleep(3000);
		fill(tr.getSearchbar(), "someauto");
		Thread.sleep(3000);
		buttonClick(tr.getEditbutton());
		Thread.sleep(3000);
		delete(tr.getCleardata());
		Thread.sleep(3000);
		fill(tr.getInputedit(), "AutomationReason12345");
		Thread.sleep(3000);
		buttonClick(tr.getEditsubmit());
		Thread.sleep(3000);
		
		
	}
	
	@Test(enabled=true,priority=2)
	public void deleteTerminationReasom() throws InterruptedException
	{
		TerminationReasonPomClass tr = new TerminationReasonPomClass();
		Thread.sleep(3000);
		buttonClick(tr.getSettings());
		Thread.sleep(3000);
		buttonClick(tr.getTerminationreason());
		Thread.sleep(3000);
		fill(tr.getSearchbar(), "AutomationReason");
		Thread.sleep(3000);
		buttonClick(tr.getDeletebutton());
		Thread.sleep(3000);
		buttonClick(tr.getDeletesubmit());
		
		
	}

}
