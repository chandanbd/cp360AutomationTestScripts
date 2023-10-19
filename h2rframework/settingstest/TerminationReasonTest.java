package org.settingstest;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.TerminationReasonPomClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TerminationReasonTest extends BaseClass{
	
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
	public void terminationreason()
	{
		TerminationReasonPomClass tr = new TerminationReasonPomClass();
		buttonClick(tr.getSettings());
		buttonClick(tr.getTerminationreason());
		buttonClick(tr.getAddreason());
		fill(tr.getInputreason(),"automation");
		buttonClick(tr.getReasonsubmit());
	}
	
	@Test(enabled=true,priority=2)
	public void terminationEdit()
	{
		TerminationReasonPomClass tr = new TerminationReasonPomClass();
		buttonClick(tr.getSettings());
		buttonClick(tr.getTerminationreason());
		buttonClick(tr.getEditbutton());
		delete(tr.getClearinput());
		fill(tr.getInputedit(), "automation123");
		buttonClick(tr.getEditsubmit());
		
	}
	
	
	@Test(enabled=true,priority=3)
	public void terminationDelete()
	{
		TerminationReasonPomClass tr = new TerminationReasonPomClass();
		buttonClick(tr.getSettings());
		buttonClick(tr.getTerminationreason());
		buttonClick(tr.getDeletebutton());
		buttonClick(tr.getDeletesubmit());
		
	}
	
	//@AfterMethod
	public void aftrmethod()
	{
		close();
	}

}
