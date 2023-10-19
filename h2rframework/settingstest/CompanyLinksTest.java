package org.settingstest;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.CompanyLinksPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompanyLinksTest extends BaseClass {
	
	
	@BeforeMethod 
	public void bfrmthd()
	{
		launchBrowseredgedriver();
		//launchBrowsergoogle();
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
	public void companylinks()
	{
		CompanyLinksPomClass cl = new CompanyLinksPomClass();
		buttonClick(cl.getSettings());
		buttonClick(cl.getCompanylinks());
		buttonClick(cl.getAddcategory());
		fill(cl.getInputcategory(), "AutomationTesting");
		buttonClick(cl.getCategorysave());
	}
	
	@Test(enabled=true,priority=2)
	public void companylinksEdit() throws IOException, InterruptedException
	{
		CompanyLinksPomClass cl = new CompanyLinksPomClass();
		buttonClick(cl.getSettings());
		buttonClick(cl.getCompanylinks());
		buttonClick(cl.getEditbutton());
		delete(cl.getClearedittext());
		fill(cl.getInputedit(), "Automation");
		buttonClick(cl.getEditsave());
		Thread.sleep(3000);
		BaseClass.TakeScreenshot("editsave");
		
	}
	
	@Test(enabled=true,priority=3)
	public void companylinksDelete() throws InterruptedException
	{
		CompanyLinksPomClass cl = new CompanyLinksPomClass();
		buttonClick(cl.getSettings());
		//Thread.sleep(3000);
		buttonClick(cl.getCompanylinks());
		buttonClick(cl.getDeletebutton());
		buttonClick(cl.getDelsave());
	}
	
	@Test(enabled=true,priority=4)
	public void addlink() throws InterruptedException, AWTException
	{
		CompanyLinksPomClass cl = new CompanyLinksPomClass();
		buttonClick(cl.getSettings());
		buttonClick(cl.getCompanylinks());
		buttonClick(cl.getAddlink());
		fill(cl.getLinkname(), "automation");
		fill(cl.getLinkurl(), "https://www.google.com/");
		toperformkeydown(cl.getCategorydrpdown(), 4);
		toperformenter();
		buttonClick(cl.getCategorysave());
	}

}
