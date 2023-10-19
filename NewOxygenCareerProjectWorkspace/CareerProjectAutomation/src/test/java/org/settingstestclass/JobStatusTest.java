package org.settingstestclass;

import org.baseclass.BaseClass;
import org.loginlogutPomClass.LoginPomclass;
import org.settingspomclass.JobStatusPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobStatusTest extends BaseClass {
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException 
	{

		//launchBrowsergoogle();
		launchBrowserfirefox();
		//launchBrowseredgedriver();
		maxBrowser();
		loadUrl("http://dvcareer.cp360apps.com/Admin/Account");
		implictyWait();
		LoginPomclass po = new LoginPomclass();
		fill(po.getEmail(), "chandan.bd@contactpoint360.com");
		Thread.sleep(3000);
		fill(po.getPassword(),"Rayaru@123");
		Thread.sleep(3000);
		//buttonClick(po.getHideicon());
		buttonClick(po.getLogin());
		//toQuit();

	}
	
	@Test
	public void jobstatus() throws InterruptedException
	{
		JobStatusPomClass jb = new JobStatusPomClass();
		Thread.sleep(3000);
		buttonClick(jb.getSettings());
		Thread.sleep(3000);
		buttonClick(jb.getJobstatus());
		Thread.sleep(3000);
		buttonClick(jb.getAddjobstatus());
		Thread.sleep(3000);
		fill(jb.getJobstatusinput(), "somejobstatus");
		Thread.sleep(3000);
		buttonClick(jb.getJobstatussave());
		
	}
	
	
	//@Test
	public void jobstatusedit() throws InterruptedException
	{
		JobStatusPomClass jb = new JobStatusPomClass();
		Thread.sleep(3000);
		buttonClick(jb.getSettings());
		Thread.sleep(3000);
		buttonClick(jb.getJobstatus());
		Thread.sleep(3000);
		fill(jb.getSearchbar(),"somejobstatus");
		Thread.sleep(3000);
		buttonClick(jb.getSearchbutton());
		Thread.sleep(3000);
		buttonClick(jb.getEditjobstatus());
		Thread.sleep(3000);
		delete(jb.getCleardata());
		Thread.sleep(3000);
		fill(jb.getJobstatusinput1(), "somejobstatus123");
		Thread.sleep(3000);
		buttonClick(jb.getSubmit());
		
		
	}
	
	//@Test
	public void deactivatestatus() throws InterruptedException
	{
		JobStatusPomClass jb = new JobStatusPomClass();
		Thread.sleep(3000);
		buttonClick(jb.getSettings());
		Thread.sleep(3000);
		buttonClick(jb.getJobstatus());
		Thread.sleep(3000);
		fill(jb.getSearchbar(),"somejobstatus");
		Thread.sleep(3000);
		buttonClick(jb.getSearchbutton());
		Thread.sleep(3000);
		buttonClick(jb.getDeactivatejobstatus());
		
	}

}
