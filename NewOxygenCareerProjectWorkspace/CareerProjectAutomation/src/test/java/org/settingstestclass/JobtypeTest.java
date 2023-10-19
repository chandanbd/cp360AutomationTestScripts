package org.settingstestclass;

import org.baseclass.BaseClass;
import org.loginlogutPomClass.LoginPomclass;
import org.settingspomclass.JobtypePomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobtypeTest extends BaseClass{
	
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
	public void jobtype() throws InterruptedException
	{
		JobtypePomClass jt = new JobtypePomClass();
		Thread.sleep(3000);
		buttonClick(jt.getSettings());
		Thread.sleep(3000);
		buttonClick(jt.getJobtype());
		Thread.sleep(3000);
		buttonClick(jt.getAddnewjobtype());
		Thread.sleep(3000);
		fill(jt.getInputjobtype(), "somejobtype");
		Thread.sleep(3000);
		buttonClick(jt.getJobtypesave());
		
		
		
		
	}

}
