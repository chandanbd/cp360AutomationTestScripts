package org.livesettings.test;

import org.baseclass.BaseClass;
import org.livesettings.pomclass.JobTypePomClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobTypeTest extends BaseClass{
	
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
	public void addJobtype() throws InterruptedException
	{
		JobTypePomClass jb = new JobTypePomClass();
		Thread.sleep(3000);
		buttonClick(jb.getSettings());
		Thread.sleep(3000);
		buttonClick(jb.getJobtype());
		Thread.sleep(3000);
		buttonClick(jb.getAddjobtype());
		Thread.sleep(3000);
		fill(jb.getInputjobtype(), "SomeAutomationJobtype");
		Thread.sleep(3000);
		buttonClick(jb.getSubmit());
		
	}
	
	@Test(enabled=true,priority=1)
	public void editJobtype() throws InterruptedException
	{
		JobTypePomClass jb = new JobTypePomClass();
		Thread.sleep(3000);
		buttonClick(jb.getSettings());
		Thread.sleep(3000);
		buttonClick(jb.getJobtype());
		Thread.sleep(3000);
		fill(jb.getSearchbar(), "someauto");
		Thread.sleep(3000);
		buttonClick(jb.getEditbutton());
		Thread.sleep(3000);
		delete(jb.getCleardata());
		Thread.sleep(3000);
		fill(jb.getInputedit(), "SomeAutomationJobtype12345");
		Thread.sleep(3000);
		buttonClick(jb.getEditsubmit());
		Thread.sleep(3000);
		
		
		
	}
	
	
	@Test(enabled=true,priority=2)
	public void deleteJobtype() throws InterruptedException
	{
		JobTypePomClass jb = new JobTypePomClass();
		Thread.sleep(3000);
		buttonClick(jb.getSettings());
		Thread.sleep(3000);
		buttonClick(jb.getJobtype());
		Thread.sleep(3000);
		fill(jb.getSearchbar(), "SomeAutomationJobtype");
		Thread.sleep(3000);
		buttonClick(jb.getDeletebutton());
		Thread.sleep(3000);
		buttonClick(jb.getDeletesubmit());
	

		
	}

}
