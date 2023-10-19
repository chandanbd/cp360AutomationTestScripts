package org.settingstest;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.DivisionPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DivisionTestClass extends BaseClass{
	
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
	
	//@Test
	public void division()
	{
		DivisionPomClass dv = new DivisionPomClass();
		buttonClick(dv.getSettings());
		buttonClick(dv.getDivision());
		buttonClick(dv.getAdddivision());
		fill(dv.getInputadddivision(), "AutomationDivision");
		buttonClick(dv.getDivisionsubmit());
		
	}
	
	
	//@Test
	public void edit() // successfully passed
	{
		DivisionPomClass dv = new DivisionPomClass();
		buttonClick(dv.getSettings());
		buttonClick(dv.getDivision());
		buttonClick(dv.getStatusbutton());
		buttonClick(dv.getStatusall());
		buttonClick(dv.getEdit());
		delete(dv.getCleareditinput());
		fill(dv.getInputedit(), "something");
		buttonClick(dv.getEditsubmit());
		
		
	}
	
	@Test
	public void delete()
	{
		DivisionPomClass dv = new DivisionPomClass();
		buttonClick(dv.getSettings());
		buttonClick(dv.getDivision());
		buttonClick(dv.getStatusbutton());
		buttonClick(dv.getStatusall());
		buttonClick(dv.getDeactivate());
		buttonClick(dv.getDeactivatesubmit());
		
	}
	
	
	
	

}
