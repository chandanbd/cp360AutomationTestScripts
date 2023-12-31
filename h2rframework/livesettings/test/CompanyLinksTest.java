package org.livesettings.test;

import java.awt.AWTException;

import org.baseclass.BaseClass;
import org.livesettings.pomclass.CompanyLinksPomClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompanyLinksTest extends BaseClass {
	
	@BeforeMethod 
	public void bfrmthd()     
	{
		//launchBrowsergoogle();
		//launchBrowseredgedriver();
		launchBrowserfirefox();
		maxBrowser();
		loadUrl("https://contactpoint360.h2r.ai/app");
		implictyWait();
		LoginPomClass po = new LoginPomClass();
		fill(po.getEmail(), "estelle123@yopmail.com");
		fill(po.getPasswrd(), "Test@123");
		buttonClick(po.getCheckbox());
		buttonClick(po.getSubmit());
		
	}
	
	//@Test
	public void addCategory() throws InterruptedException
	{
		CompanyLinksPomClass cl = new CompanyLinksPomClass();
		Thread.sleep(3000);
		buttonClick(cl.getSettings());
		Thread.sleep(3000);
		buttonClick(cl.getCompanylinks());
		Thread.sleep(3000);
		buttonClick(cl.getAddcategory());
		Thread.sleep(3000);
		fill(cl.getCategoryinput(), "AutomationTesting");
		Thread.sleep(3000);
		buttonClick(cl.getCategorysave());
		
		
		
	}
	
	@Test
	public void addLink() throws InterruptedException, AWTException
	{
		CompanyLinksPomClass cl = new CompanyLinksPomClass();
		Thread.sleep(3000);
		buttonClick(cl.getSettings());
		Thread.sleep(3000);
		buttonClick(cl.getCompanylinks());
		Thread.sleep(3000);
		buttonClick(cl.getAddlink());
		Thread.sleep(3000);
		fill(cl.getLinkname(), "somelinkname");
		Thread.sleep(3000);
		fill(cl.getUrl(), "https://www.google.com/");
		Thread.sleep(3000);
		toperformkeydown(cl.getCategorydrpdwn(), 1);
		
		
		
		
		
		

		
	}

}
