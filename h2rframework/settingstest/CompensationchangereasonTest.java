package org.settingstest;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.CompensationchangreasonPOM;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompensationchangereasonTest extends BaseClass {
	
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
	public void compchangereason()
	{
		CompensationchangreasonPOM cr = new CompensationchangreasonPOM();
		buttonClick(cr.getSettings());
		buttonClick(cr.getCompensationchangereason());
		buttonClick(cr.getAddreason());
		fill(cr.getInputreason(), "autotestt");
		buttonClick(cr.getReasonsubmit());	
		
	}
	
	@Test(enabled=true,priority=2)
	public void compchangereasonEdit()
	{
		CompensationchangreasonPOM cr = new CompensationchangreasonPOM();
		buttonClick(cr.getSettings());
		buttonClick(cr.getCompensationchangereason());
		buttonClick(cr.getCcreditbutton());
		delete(cr.getCcrcleaarinput());
		fill(cr.getInputeditreason(), "autotestattt");
		buttonClick(cr.getEditsubmit());
			
		
	}
	
	@Test(enabled=true,priority=3)
	public void compchangereasonDelete()
	{
		CompensationchangreasonPOM cr = new CompensationchangreasonPOM();
		buttonClick(cr.getSettings());
		buttonClick(cr.getCompensationchangereason());
		buttonClick(cr.getDeletebutton());
		buttonClick(cr.getDeletesubmit());
		
		
	}

}
