package org.settingstest;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.JobLocationPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobLocationTest extends BaseClass {
	
	
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
	
	@Test(enabled=true,priority=1)
	public void joblocation()
	{
		JobLocationPomClass jb = new JobLocationPomClass();
		buttonClick(jb.getSettings());
		buttonClick(jb.getJoblocation());
		buttonClick(jb.getAddjoblocation());
		fill(jb.getInputjoblocation(), "somelocation");
		buttonClick(jb.getJblocationsave());
		
		
	}
	
	@Test(enabled=true,priority=2)
	public void joblocationEdit() throws InterruptedException, IOException
	{
		JobLocationPomClass jb = new JobLocationPomClass();
		buttonClick(jb.getSettings());
		buttonClick(jb.getJoblocation());
		fill(jb.getSearchbar(), "somelocation");
		Thread.sleep(3000);
		buttonClick(jb.getEditbutton());
		delete(jb.getCleartext());
		fill(jb.getInputtext(), "somelocation123");
		Thread.sleep(2000);
		buttonClick(jb.getEditsave());
		Thread.sleep(3000);
		BaseClass.TakeScreenshot("editsave");
		
		
	}

}
