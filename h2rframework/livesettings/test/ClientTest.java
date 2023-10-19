package org.livesettings.test;

import org.baseclass.BaseClass;
import org.livesettings.pomclass.ClientPomClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClientTest extends BaseClass {
	
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
	
	@Test(enabled=true,priority=0)
	public void addClient() throws InterruptedException
	{
		ClientPomClass cl = new ClientPomClass();
		Thread.sleep(3000);
		buttonClick(cl.getSettings());
		Thread.sleep(3000);
		buttonClick(cl.getClient());
		Thread.sleep(3000);
		buttonClick(cl.getAdddclient());
		Thread.sleep(3000);
		fill(cl.getClientinput(), "AutomationtestDept");
		Thread.sleep(3000);
		buttonClick(cl.getSubmit());
		
		
	}
	
	
	@Test(enabled=true,priority=1)
	public void editClient() throws InterruptedException
	{
		ClientPomClass cl = new ClientPomClass();
		Thread.sleep(3000);
		buttonClick(cl.getSettings());
		Thread.sleep(3000);
		buttonClick(cl.getClient());
		Thread.sleep(3000);
		fill(cl.getSearchbar(), "Automation");
		Thread.sleep(3000);
		buttonClick(cl.getEdit());
		Thread.sleep(3000);
		delete(cl.getCleardata());
		Thread.sleep(5000);
		fill(cl.getEditinput(), "AutomationtestDept123");
		Thread.sleep(5000);
		buttonClick(cl.getEditsubmit());
		
	}
	
	
	@Test(enabled=true,priority=2)
	public void deactivateClient() throws InterruptedException
	{
		ClientPomClass cl = new ClientPomClass();
		Thread.sleep(3000);
		buttonClick(cl.getSettings());
		Thread.sleep(3000);
		buttonClick(cl.getClient());
		Thread.sleep(3000);
		fill(cl.getSearchbar(), "Automation");
		Thread.sleep(3000);
		buttonClick(cl.getDeactivate());
		Thread.sleep(3000);
		buttonClick(cl.getDeactivatesubmit());
		
	}
	
	
	@Test(enabled=true,priority=3)
	public void activateClient() throws InterruptedException
	{
		ClientPomClass cl = new ClientPomClass();
		Thread.sleep(3000);
		buttonClick(cl.getSettings());
		Thread.sleep(3000);
		buttonClick(cl.getClient());
		Thread.sleep(3000);
		buttonClick(cl.getActive());
		Thread.sleep(3000);
		buttonClick(cl.getInactive());
		Thread.sleep(3000);
		fill(cl.getSearchbar(), "Automationtest");
		Thread.sleep(3000);
		buttonClick(cl.getActivate());
		Thread.sleep(3000);
		buttonClick(cl.getActivatesubmit());
		
		
	}

}
