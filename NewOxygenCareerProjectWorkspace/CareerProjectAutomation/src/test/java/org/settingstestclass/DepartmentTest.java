package org.settingstestclass;

import org.baseclass.BaseClass;
import org.loginlogutPomClass.LoginPomclass;
import org.settingspomclass.DepartmentPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DepartmentTest extends BaseClass{
	
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
	
	
	//@Test(enabled=true,priority=1)
	public void addnewdepartment() throws InterruptedException
	{
		DepartmentPomClass dp = new DepartmentPomClass();
		Thread.sleep(3000);
		buttonClick(dp.getSettings());
		Thread.sleep(3000);
		buttonClick(dp.getDepartment());
		Thread.sleep(3000);
		buttonClick(dp.getAddnewdeptnmt());
		Thread.sleep(3000);
		fill(dp.getInputnewdept(), "somedepartment");
		Thread.sleep(3000);
		buttonClick(dp.getNewdeptsave());
		Thread.sleep(3000);
		
		
	}
	
	
	//@Test(enabled=true,priority=2)
	public void editdepartment() throws InterruptedException
	{
		DepartmentPomClass dp = new DepartmentPomClass();
		Thread.sleep(3000);
		buttonClick(dp.getSettings());
		Thread.sleep(3000);
		buttonClick(dp.getDepartment());
		Thread.sleep(3000);
		fill(dp.getSearchbar(), "somedepartment");
		Thread.sleep(3000);
		buttonClick(dp.getSearchbutton());
		Thread.sleep(3000);
		buttonClick(dp.getEditdepartment());
		Thread.sleep(3000);
		delete(dp.getCleardata());
		Thread.sleep(3000);
		fill(dp.getEditinput(), "somedepartment123");
		Thread.sleep(3000);
		buttonClick(dp.getEditsave());
		
		
	}
	
	
	@Test
	public void deactivate() throws InterruptedException
	{
		DepartmentPomClass dp = new DepartmentPomClass();
		Thread.sleep(3000);
		buttonClick(dp.getSettings());
		Thread.sleep(3000);
		buttonClick(dp.getDepartment());
		Thread.sleep(3000);
		fill(dp.getSearchbar(), "somedepartment");
		Thread.sleep(3000);
		buttonClick(dp.getSearchbutton());
		Thread.sleep(3000);
		buttonClick(dp.getDeactivatedeptmnt());
		
	}
	
	
	
	

}
