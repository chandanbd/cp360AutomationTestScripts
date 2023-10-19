package org.accesslevels.test;

import java.awt.AWTException;

import org.accesslevels.pomclass.EmployeeAccessLevelPomClass;
import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.EmployeeGroupsPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmployeeAccessLevelTest extends BaseClass {
	
	
	@BeforeMethod 
	public void bfrmthd()     
	{
		//launchBrowsergoogle();
		launchBrowseredgedriver();
		//launchBrowserfirefox();
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
	public void addingEmployeeAccesslevelSettings() throws InterruptedException, AWTException
	{
		EmployeeAccessLevelPomClass el =new EmployeeAccessLevelPomClass();
		buttonClick(el.getSettings());
		buttonClick(el.getAllaccesslevel());
		Thread.sleep(3000);
		buttonClick(el.getEmployeeaccesslevel());
		Thread.sleep(3000);
		buttonClick(el.getEmployautomation());
		Thread.sleep(3000);
		buttonClick(el.getAddaccesslevelsettings());
		buttonClick(el.getNext());
		Thread.sleep(3000);
		buttonClick(el.getGendergraph());
		buttonClick(el.getViewlinks());
		buttonClick(el.getWhosout());
		buttonClick(el.getDivisiongraph());
		buttonClick(el.getHeadcountreport());
		buttonClick(el.getViewmyteam());
		buttonClick(el.getGenerationgraph());
		buttonClick(el.getTimeoffsummary());
		buttonClick(el.getAnnouncements());
		buttonClick(el.getEmployeesgeography());
		buttonClick(el.getHolidaylist());
		buttonClick(el.getNewteammembers());
		buttonClick(el.getCelebrations());
		buttonClick(el.getEmploymentstatusgraph());
		buttonClick(el.getJoblocationgraph());
		buttonClick(el.getTotalcounts());
		buttonClick(el.getDepartmentgraph());
		Thread.sleep(3000);
		buttonClick(el.getJobinformation());
		Thread.sleep(3000);
		toperformkeydown(el.getJobinfodrpdwn(), 4);
		toperformenter();
		buttonClick(el.getSave());
		Thread.sleep(3000);
		buttonClick(el.getEmergency());
		buttonClick(el.getEmergencyinfo());
		Thread.sleep(3000);
		toperformkeydown(el.getEmergencydrpdwn(), 6);
		toperformenter();
		Thread.sleep(3000);
		buttonClick(el.getSave1());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
