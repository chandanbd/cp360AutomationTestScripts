package org.livesettings.test;

import org.baseclass.BaseClass;
import org.livesettings.pomclass.DivisionPomClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DivisionTest extends BaseClass{
	
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
	public void AddDivision() throws InterruptedException
	{
		DivisionPomClass dv = new DivisionPomClass();
		Thread.sleep(3000);
		buttonClick(dv.getSettings());
		Thread.sleep(3000);
		buttonClick(dv.getDivision());
		Thread.sleep(3000);
		buttonClick(dv.getAdddivision());
		Thread.sleep(3000);
		fill(dv.getDivisioninput(), "AutomationDivision");
		Thread.sleep(3000);
		buttonClick(dv.getDivisionsubmit());
		
		
		
		
	}
	
	
	
	@Test(enabled=true,priority=1)
	public void EditDivision() throws InterruptedException
	{
		DivisionPomClass dv = new DivisionPomClass();
		Thread.sleep(3000);
		buttonClick(dv.getSettings());
		Thread.sleep(3000);
		buttonClick(dv.getDivision());
		Thread.sleep(3000);
		fill(dv.getSearchbar(), "Automation");
		Thread.sleep(3000);
		buttonClick(dv.getEdit());
		Thread.sleep(3000);
		delete(dv.getCleardata());
		Thread.sleep(5000);
		fill(dv.getEditinput(), "AutomationDivision12345");
		Thread.sleep(5000);
		buttonClick(dv.getEditsubmit());
		
		
		
		
	}
	
	@Test(enabled=true,priority=2)
	public void DeactivateDivision() throws InterruptedException
	{
		DivisionPomClass dv = new DivisionPomClass();
		Thread.sleep(3000);
		buttonClick(dv.getSettings());
		Thread.sleep(3000);
		buttonClick(dv.getDivision());
		Thread.sleep(3000);
		fill(dv.getSearchbar(), "Automation");
		Thread.sleep(3000);
		buttonClick(dv.getDeactivate());
		Thread.sleep(3000);
		buttonClick(dv.getDeactivatesubmit());
		
		
	}
	
	@Test(enabled=true,priority=3)
	public void ActivateDivision() throws InterruptedException
	{
		DivisionPomClass dv = new DivisionPomClass();
		Thread.sleep(3000);
		buttonClick(dv.getSettings());
		Thread.sleep(3000);
		buttonClick(dv.getDivision());
		Thread.sleep(3000);
		buttonClick(dv.getActive());
		Thread.sleep(3000);
		buttonClick(dv.getInactive());
		Thread.sleep(3000);
		fill(dv.getSearchbar(), "AutomationDivision");
		Thread.sleep(3000);
		buttonClick(dv.getActivate());
		Thread.sleep(3000);
		buttonClick(dv.getActivatesubmit());
	}

}
