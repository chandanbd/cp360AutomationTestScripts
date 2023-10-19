package org.livesettings.test;

import org.baseclass.BaseClass;
import org.livesettings.pomclass.JobTitlePomClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobTitleTest extends BaseClass {
	
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
	public void Addjobtitle() throws InterruptedException
	{
		JobTitlePomClass jb = new JobTitlePomClass();
		Thread.sleep(3000);
		buttonClick(jb.getSettings());
		Thread.sleep(3000);
		buttonClick(jb.getJobtitle());
		Thread.sleep(3000);
		buttonClick(jb.getAddjobtitle());
		Thread.sleep(3000);
		fill(jb.getJobtitleinput(), "SomeAutomationTesting");
		Thread.sleep(3000);
		buttonClick(jb.getJobtitlesubmit());
		
		
	}
	
	@Test(enabled=true,priority=1)
	public void Editjobtitle() throws InterruptedException
	{
		JobTitlePomClass jb = new JobTitlePomClass();
		Thread.sleep(3000);
		buttonClick(jb.getSettings());
		Thread.sleep(3000);
		buttonClick(jb.getJobtitle());
		Thread.sleep(3000);
		fill(jb.getSearchbar(), "Some");
		Thread.sleep(3000);
		buttonClick(jb.getEdit());
		Thread.sleep(3000);
		delete(jb.getCleardata());
		Thread.sleep(3000);
		fill(jb.getEditinput(), "SomeAutomationTesting12345");
		Thread.sleep(3000);
		buttonClick(jb.getEditsubmit());
		
		
	}
	
	
	@Test(enabled=true,priority=2)
	public void Deactivatejobtitle() throws InterruptedException
	{
		JobTitlePomClass jb = new JobTitlePomClass();
		Thread.sleep(3000);
		buttonClick(jb.getSettings());
		Thread.sleep(3000);
		buttonClick(jb.getJobtitle());
		Thread.sleep(3000);
		fill(jb.getSearchbar(), "SomeAutomation");
		Thread.sleep(3000);
		buttonClick(jb.getDeactivate());
		Thread.sleep(3000);
		buttonClick(jb.getDeactivatesubmit());
		
		
		
	}
	
	@Test(enabled=true,priority=3)
	public void Activatejobtitle() throws InterruptedException
	{
		JobTitlePomClass jb = new JobTitlePomClass();
		Thread.sleep(3000);
		buttonClick(jb.getSettings());
		Thread.sleep(3000);
		buttonClick(jb.getJobtitle());
		Thread.sleep(3000);
		buttonClick(jb.getActive());
		Thread.sleep(3000);
		buttonClick(jb.getInactive());
		Thread.sleep(3000);
		fill(jb.getSearchbar(), "SomeAutomation");
		Thread.sleep(3000);
		buttonClick(jb.getActivate());
		Thread.sleep(3000);
		buttonClick(jb.getActivatesubmit());
		
		
		
	}

}
