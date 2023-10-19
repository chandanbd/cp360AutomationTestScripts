package org.settingstest;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.DepartmentPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DepartmentTest extends BaseClass {
	
	
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
	public void department()
	{
		DepartmentPomClass dp = new DepartmentPomClass();
		buttonClick(dp.getSettings());
		buttonClick(dp.getDepartment());
		buttonClick(dp.getAdddept());
		fill(dp.getInputdept(), "AutoTestng");
		buttonClick(dp.getDeptsubmit());
	}
	
	
	//@Test
	public void departmentEdit() // successfully passed
	{
		DepartmentPomClass dp = new DepartmentPomClass();
		buttonClick(dp.getSettings());
		buttonClick(dp.getDepartment());
		buttonClick(dp.getStatusbutton());
		buttonClick(dp.getStatusall());
		buttonClick(dp.getEditbutton());
		delete(dp.getClearinputedit());
		fill(dp.getInputedit(), "112233445566");
		buttonClick(dp.getEditsubmit());
		
	}
	
	@Test
	public void departmentDeactivate()
	{
		DepartmentPomClass dp = new DepartmentPomClass();
		buttonClick(dp.getSettings());
		buttonClick(dp.getDepartment());
		buttonClick(dp.getStatusbutton());
		buttonClick(dp.getStatusall());
		buttonClick(dp.getDeactivate());
		buttonClick(dp.getDeactivatesubmit());
		
	}

}
