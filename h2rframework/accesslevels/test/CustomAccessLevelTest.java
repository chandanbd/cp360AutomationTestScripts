package org.accesslevels.test;

import java.awt.AWTException;

import org.accesslevels.pomclass.CustomAccessLevelPomClass;
import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomAccessLevelTest extends BaseClass {
	
	@BeforeMethod 
	public void bfrmthd()     
	{
		//launchBrowsergoogle();
		//launchBrowseredgedriver();
		launchBrowserfirefox();
		maxBrowser();
		loadUrl("https://h2rdv.cp360apps.com/app");
		implictyWait();
		LoginPomClass po = new LoginPomClass();
		fill(po.getEmail(), "admin@o2ohrms.com");
		fill(po.getPasswrd(), "Super@dmin@1234");
		buttonClick(po.getCheckbox());
		buttonClick(po.getSubmit());
		
	}
	
	//@Test
	public void creatingCustomaccesslevel() throws InterruptedException
	{
		CustomAccessLevelPomClass cl = new CustomAccessLevelPomClass();
		buttonClick(cl.getSettings());
		buttonClick(cl.getAllaccesslevel());
		Thread.sleep(3000);
		buttonClick(cl.getAddnewlevel());
		Thread.sleep(3000);
		buttonClick(cl.getSelectcustomlevel());
		buttonClick(cl.getCustomnxt());
		fill(cl.getCustominput(), "CustomAutomation");
		buttonClick(cl.getCustomnxt1());
		Thread.sleep(3000);
		buttonClick(cl.getCustomnxt2());
		Thread.sleep(3000);
		buttonClick(cl.getCustomsubmit());
		
	}
	
	//@Test
	public void addcustomlevelsettings() throws InterruptedException
	{
		CustomAccessLevelPomClass cl = new CustomAccessLevelPomClass();
		buttonClick(cl.getSettings());
		buttonClick(cl.getAllaccesslevel());
		Thread.sleep(3000);
		buttonClick(cl.getClickcustomaccesslevel());
		buttonClick(cl.getSelectcustomautomation());
		buttonClick(cl.getAddaccesslevelsettings());
		buttonClick(cl.getAccesslvlsettingsnext());
		Thread.sleep(3000);
		buttonClick(cl.getCustomreport());
		//buttonClick(cl.getEmployeereport());
		buttonClick(cl.getStandardreport());
		//buttonClick(cl.getEmployeeturnoverreport());
		buttonClick(cl.getCustomnxt2());
		Thread.sleep(3000);
		buttonClick(cl.getCustomsubmit());
		
		
	}
	
	
	@Test
	public void addOnlyEmployeesinaccesslevelsettings() throws InterruptedException, AWTException
	{
		CustomAccessLevelPomClass cl = new CustomAccessLevelPomClass();
		buttonClick(cl.getSettings());
		buttonClick(cl.getAllaccesslevel());
		Thread.sleep(3000);
		buttonClick(cl.getClickcustomaccesslevel());
		buttonClick(cl.getSelectcustomautomation());
		buttonClick(cl.getAddaccesslevelsettings());
		buttonClick(cl.getAccesslvlsettingsnext());
		Thread.sleep(3000);
		buttonClick(cl.getCustomnxt2());
		Thread.sleep(3000);
		toperformkeydown(cl.getMaindrpdwn(), 5);
		Thread.sleep(3000);
		toperformenter();
		
	}

}
