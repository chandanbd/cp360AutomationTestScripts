package org.settingstest;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.ReasonofHirePomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReasonofHireTest extends BaseClass {
	
	
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
	public void reasonofHire()
	{
		ReasonofHirePomClass rh = new ReasonofHirePomClass();
		buttonClick(rh.getSettings());
		buttonClick(rh.getReasonofhire());
		buttonClick(rh.getAddreasonofhire());
		fill(rh.getInputreason(), "somereason12345");
		buttonClick(rh.getReasonsubmit());
	}
	
	@Test(enabled=true,priority=2)
	public void reasonofHireEdit()
	{
		ReasonofHirePomClass rh = new ReasonofHirePomClass();
		buttonClick(rh.getSettings());
		buttonClick(rh.getReasonofhire());
		//robotscrollDown();
		buttonClick(rh.getEditbutton());
		delete(rh.getCleartext());
		fill(rh.getInputedit(), "some12345reason");
		buttonClick(rh.getEditsubmit());
		
		
	}
	
	@Test(enabled=true,priority=3)
	public void reasonofHireDelete()
	{
		ReasonofHirePomClass rh = new ReasonofHirePomClass();
		buttonClick(rh.getSettings());
		buttonClick(rh.getReasonofhire());
		buttonClick(rh.getDeletebutton());
		buttonClick(rh.getDeletesubmit());
		
		
		
	}
	
	

}
