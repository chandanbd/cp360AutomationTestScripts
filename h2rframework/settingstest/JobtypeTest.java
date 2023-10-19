package org.settingstest;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.JobtypePomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobtypeTest  extends BaseClass{
	
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
	
	@Test
	public void jobtype()
	{
		JobtypePomClass jt = new JobtypePomClass();
		buttonClick(jt.getSettings());
		buttonClick(jt.getJobtype());
		buttonClick(jt.getAddjobtype());
		fill(jt.getInputjobtype(), "userautomation");
		buttonClick(jt.getSubmitjobtype());
		
	}

}
