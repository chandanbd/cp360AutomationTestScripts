package org.settingstest;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.ClientPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClientTest extends BaseClass{
	
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
	public void client()  // Successfully Test Passed
	{
		ClientPomClass ct = new ClientPomClass();
		buttonClick(ct.getSettings());
		buttonClick(ct.getClient());
		buttonClick(ct.getAddclient());
		fill(ct.getClientinput(), "Automation");
		buttonClick(ct.getClientsubmit());
		
	}
	
	
	//@Test
	public void clientEdit()  // Successfully Test Passed
	{
		ClientPomClass ct = new ClientPomClass();
		buttonClick(ct.getSettings());
		buttonClick(ct.getClient());
		buttonClick(ct.getEditbutton());
		delete(ct.getCleartext());
		fill(ct.getInputedit(), "AutomationTesting");
		buttonClick(ct.getEditsubmit());
		
	}
	
	@Test
	public void clientDelete()   // Successfully Test Passed
	{
		ClientPomClass ct = new ClientPomClass();
		buttonClick(ct.getSettings());
		buttonClick(ct.getClient());
		buttonClick(ct.getDeactivate());
		buttonClick(ct.getDeactivatesubmit());
		
	}


}
