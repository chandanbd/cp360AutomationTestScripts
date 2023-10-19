package org.livesettings.test;

import org.baseclass.BaseClass;
import org.livesettings.pomclass.JobLocationPomClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobLocationTest extends BaseClass{
	
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
	public void addJoblocation() throws InterruptedException
	{
		JobLocationPomClass jb = new JobLocationPomClass();
		Thread.sleep(3000);
		buttonClick(jb.getSettings());
		Thread.sleep(3000);
		buttonClick(jb.getJoblocation());
		Thread.sleep(3000);
		buttonClick(jb.getAddjoblocation());
		Thread.sleep(3000);
		fill(jb.getInputjoblocationname(), "Automation");
		Thread.sleep(3000);
		buttonClick(jb.getSave());
		
		
	}
	
	@Test(enabled=true,priority=1)
	public void editJoblocation() throws InterruptedException
	{
		JobLocationPomClass jb = new JobLocationPomClass();
		Thread.sleep(3000);
		buttonClick(jb.getSettings());
		Thread.sleep(3000);
		buttonClick(jb.getJoblocation());
		Thread.sleep(3000);
		fill(jb.getSearchbar(), "automation");
		Thread.sleep(3000);
		buttonClick(jb.getEdit());
		Thread.sleep(3000);
		delete(jb.getCleardata());
		Thread.sleep(3000);
		fill(jb.getEditinput(), "Automation12");
		Thread.sleep(3000);
		buttonClick(jb.getEditsave());
		
		
	}
	
	@Test(enabled=true,priority=2)
	public void deleteJoblocation() throws InterruptedException
	{
		JobLocationPomClass jb = new JobLocationPomClass();
		Thread.sleep(3000);
		buttonClick(jb.getSettings());
		Thread.sleep(3000);
		buttonClick(jb.getJoblocation());
		Thread.sleep(3000);
		fill(jb.getSearchbar(), "automation");
		Thread.sleep(3000);
		buttonClick(jb.getDelete());
		Thread.sleep(3000);
		buttonClick(jb.getDeletesave());
		
		
	}
	
	

}
