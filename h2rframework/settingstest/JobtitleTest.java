package org.settingstest;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.pomclass.PeoplePomClass;
import org.settingspomclass.JobTitlePomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobtitleTest  extends BaseClass{
	
	
	@BeforeMethod 
	public void bfrmthd()
	{
		launchBrowsergoogle();
		maxBrowser();
		loadUrl("https://h2rdv.cp360apps.com/app");
		implictyWait();
		LoginPomClass po = new LoginPomClass();
		fill(po.getEmail(), "admin@o2ohrms.com");
		fill(po.getPasswrd(), "Super@dmin@1234");
		buttonClick(po.getCheckbox());
		buttonClick(po.getSubmit());
		
	}
	
	//@Test(enabled=true,priority=1)
	public void jobtitle()
	{
		org.settingspomclass.JobTitlePomClass jb = new org.settingspomclass.JobTitlePomClass();
		buttonClick(jb.getSettings());
		buttonClick(jb.getJobtitle());
		buttonClick(jb.getAddjobtitle());
		fill(jb.getInputjobtitle(), "AutomationTesting12345");
		buttonClick(jb.getJobsubmit());
		close();
		
	}
	
	
	//@Test(enabled=true,priority=2)
	public void jobtitle1()
	{
		org.settingspomclass.JobTitlePomClass jb = new org.settingspomclass.JobTitlePomClass();
		buttonClick(jb.getSettings());
		buttonClick(jb.getJobtitle());
		buttonClick(jb.getAddjobtitle());
		fill(jb.getInputjobtitle(), "AutomationTesting12345");
		buttonClick(jb.getJobsubmit());
		close();
		
		
	}
	
	//@Test
	public void jobtitleEdit() throws InterruptedException // Successfully test passed
	{
		org.settingspomclass.JobTitlePomClass jb = new org.settingspomclass.JobTitlePomClass();
		buttonClick(jb.getSettings());
		buttonClick(jb.getJobtitle());
		buttonClick(jb.getJobtitleedit());
		delete(jb.getClearjobtitleedit());
		fill(jb.getInputjobtitleedit(), "helloautomation");
		buttonClick(jb.getEditsubmit());
		
	}
	
	@Test
	public void jontitleDelete()
	{
		JobTitlePomClass jb = new JobTitlePomClass();
		buttonClick(jb.getSettings());
		buttonClick(jb.getJobtitle());
		buttonClick(jb.getStatusbutton());
		buttonClick(jb.getAllstatus());
		buttonClick(jb.getDeactivatebutto());
		buttonClick(jb.getDeactivatesubmit());
		
	}
	
	
	
	
	
	
	
	
	

}
