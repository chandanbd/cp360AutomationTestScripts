package org.livesettings.test;

import org.baseclass.BaseClass;
import org.livesettings.pomclass.DepartmentPomClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DepartmentTest extends BaseClass {
	
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
	public void AddDepartment() throws InterruptedException
	{
		DepartmentPomClass dp = new DepartmentPomClass();
		Thread.sleep(3000);
		buttonClick(dp.getSettings());
		Thread.sleep(3000);
		buttonClick(dp.getDepartment());
		Thread.sleep(3000);
		buttonClick(dp.getAdddepartment());
		Thread.sleep(3000);
		fill(dp.getDepartmentinput(), "AutomationtestDept");
		Thread.sleep(3000);
		buttonClick(dp.getDepartmentsubmit());
		
		
	}
	
	@Test(enabled=true,priority=1)
	public void EditDepartment() throws InterruptedException
	{
		DepartmentPomClass dp = new DepartmentPomClass();
		Thread.sleep(3000);
		buttonClick(dp.getSettings());
		Thread.sleep(3000);
		buttonClick(dp.getDepartment());
		Thread.sleep(3000);
		fill(dp.getSearchbar(), "Automation");
		Thread.sleep(3000);
		buttonClick(dp.getEdit());
		Thread.sleep(3000);
		delete(dp.getCleardata());
		Thread.sleep(5000);
		fill(dp.getEditinput(), "AutomationtestDept123");
		Thread.sleep(5000);
		buttonClick(dp.getEditsubmit());
		
	}
	
	@Test(enabled=true,priority=2)
	public void DeactivateDepartment() throws InterruptedException
	{
		DepartmentPomClass dp = new DepartmentPomClass();
		Thread.sleep(3000);
		buttonClick(dp.getSettings());
		Thread.sleep(3000);
		buttonClick(dp.getDepartment());
		Thread.sleep(3000);
		fill(dp.getSearchbar(), "Automation");
		Thread.sleep(3000);
		buttonClick(dp.getDeactivate());
		Thread.sleep(3000);
		buttonClick(dp.getDeactivatesubmit());
		
	}
	
	@Test(enabled=true,priority=3)
	public void ActivateDepartment() throws InterruptedException
	{
		DepartmentPomClass dp = new DepartmentPomClass();
		Thread.sleep(3000);
		buttonClick(dp.getSettings());
		Thread.sleep(3000);
		buttonClick(dp.getDepartment());
		Thread.sleep(3000);
		buttonClick(dp.getActive());
		Thread.sleep(3000);
		buttonClick(dp.getInactive());
		Thread.sleep(3000);
		fill(dp.getSearchbar(), "Automationtest");
		Thread.sleep(3000);
		buttonClick(dp.getActivate());
		Thread.sleep(3000);
		buttonClick(dp.getActivatesubmit());
		
	}

}
