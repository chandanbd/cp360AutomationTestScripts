package org.accesslevels.test;

import java.awt.AWTException;
import java.io.IOException;

import org.accesslevels.pomclass.AddNewLevelPomClass;
import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddnewlevelTest extends BaseClass{
	
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
	public void addnEwemployeeacesslevel() throws InterruptedException, AWTException
	{
		AddNewLevelPomClass al = new AddNewLevelPomClass();
		buttonClick(al.getSettings());
		buttonClick(al.getAllaccesslevel());
		Thread.sleep(3000);
		buttonClick(al.getAddnewlevel());
		buttonClick(al.getSelectemploylevel());
		buttonClick(al.getEmploynxt());
		fill(al.getEmployinput(), "EmployeeAutomation");
		buttonClick(al.getEmploynxt1());
		buttonClick(al.getVa());
		buttonClick(al.getVc());
		buttonClick(al.getVntm());
		buttonClick(al.getBasicinfo());
		Thread.sleep(5000);
		toperformkeydown(al.getBasicinfodrpdwn(), 5);
		toperformenter();
		buttonClick(al.getDrpdwnsave());
		buttonClick(al.getEmplysubmit());
		
	}
	
	//@Test
	public void addemployeeinemplaccesslevel() throws InterruptedException, AWTException, IOException
	{
		AddNewLevelPomClass al = new AddNewLevelPomClass();
		buttonClick(al.getSettings());
		buttonClick(al.getAllaccesslevel());
		Thread.sleep(3000);
		buttonClick(al.getEmployeeaccesslevel());
		Thread.sleep(3000);
		buttonClick(al.getEmployautomation());
		Thread.sleep(3000);
		buttonClick(al.getAddemployees());
		Thread.sleep(3000);
		/*fill(al.getAddemployeesinput(), "rashmika mandanna");
		Thread.sleep(5000);
		robotkeydown();
		Thread.sleep(3000);
		toperformenter();*/
		toperformkeydown(al.getAddemployeesdrpdwn(), 6);
		toperformenter();
		buttonClick(al.getAddemploysubmit());
		Thread.sleep(6000);
		buttonClick(al.getPrivewbutton());
		Thread.sleep(10000);
		buttonClick(al.getPreviewash2r());
		Thread.sleep(10000);
		System.out.println("hello");
		
		BaseClass.TakeScreenshot("previewash2r");
		System.out.println("hello");
		}
	
	
	
	@Test
	public void  addManageracesslevel() throws InterruptedException
	{
		AddNewLevelPomClass al = new AddNewLevelPomClass();
		buttonClick(al.getSettings());
		buttonClick(al.getAllaccesslevel());
		Thread.sleep(3000);
		buttonClick(al.getAddnewlevel());
		buttonClick(al.getSlctmanageraccesslevel());
		buttonClick(al.getAccessnxt());
		fill(al.getAccessinput(), "ManagerAutomation");
		buttonClick(al.getAccessnxt1());
		buttonClick(al.getAccesssubmit());
		
	}
	
	//@Test
	public void accesslevelsettingsinManageraccesslevel() throws InterruptedException, AWTException // tried with 3 widgets
	{
		AddNewLevelPomClass al = new AddNewLevelPomClass();
		buttonClick(al.getSettings());
		buttonClick(al.getAllaccesslevel());
		Thread.sleep(3000);
		buttonClick(al.getManageraccesslevel());
		buttonClick(al.getManagerautomation());
		Thread.sleep(3000);
		buttonClick(al.getAccesslevelsettings());
		Thread.sleep(3000);
		buttonClick(al.getAccessnext3());
		buttonClick(al.getVa());
		buttonClick(al.getVc());
		Thread.sleep(3000);
		buttonClick(al.getManagaccesslevelbasicinfo());
		Thread.sleep(2000);
		toperformkeydown(al.getManagaccesslevelbasicinfodrpdwn(), 3);
		toperformenter();
		buttonClick(al.getManghaccleveldrpdwnsave());
		buttonClick(al.getMangacceslvlsubmit());
		

		
		
	}
	
	//@Test
	public void addemployeeinManageraccesslevel() throws InterruptedException, AWTException
	{
		AddNewLevelPomClass al = new AddNewLevelPomClass();
		buttonClick(al.getSettings());
		buttonClick(al.getAllaccesslevel());
		Thread.sleep(3000);
		buttonClick(al.getManageraccesslevel());
		buttonClick(al.getManagerautomation());
		Thread.sleep(3000);
		buttonClick(al.getAddmanageremployees());
		Thread.sleep(3000);
		toperformkeydown(al.getAddmanageremployeesdrpdwn(), 11);
		toperformenter();
		Thread.sleep(3000);
		buttonClick(al.getAddmangeremployeesubmit());
		Thread.sleep(9000);
		buttonClick(al.getMangaccesslevelprivewbutton());
		Thread.sleep(9000);
		buttonClick(al.getMangaccesslevelpreviewash2r());
		Thread.sleep(9000);
		
		
		
	}
	
	
	//@Test
	public void addallWidgetsinManageraccesslevel() throws InterruptedException // tried with all the widgets
	{
		
		AddNewLevelPomClass al = new AddNewLevelPomClass();
		buttonClick(al.getSettings());
		buttonClick(al.getAllaccesslevel());
		Thread.sleep(3000);
		buttonClick(al.getManageraccesslevel());
		buttonClick(al.getManagerautomation());
		Thread.sleep(3000);
		buttonClick(al.getAccesslevelsettings());
		Thread.sleep(3000);
		buttonClick(al.getAccessnext3());
		Thread.sleep(3000);
		buttonClick(al.getMangviewannouncements());
		buttonClick(al.getMangviewemploygegrphy());
		buttonClick(al.getMangviewholidayslist());
		buttonClick(al.getMangviewnewteammemb());
		buttonClick(al.getMangviewcelebrations());
		buttonClick(al.getMangviewemploystatusgraph());
		buttonClick(al.getMangviewdepartmntgraph());
		buttonClick(al.getMangviewjoblocation());
		buttonClick(al.getMangviewtotalcounts());
		buttonClick(al.getMangviewgendergraph());
	
		buttonClick(al.getMangviewlinks());
		buttonClick(al.getMangviewwhosout());
		buttonClick(al.getMangview());
		buttonClick(al.getMangviewheadcountreport());
		buttonClick(al.getMangviewmyteam());
		buttonClick(al.getMangviewgenerationgraph());
		
		
	}
	

}
