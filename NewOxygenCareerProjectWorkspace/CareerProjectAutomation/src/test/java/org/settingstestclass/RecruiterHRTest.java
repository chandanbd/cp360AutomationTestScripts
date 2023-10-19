package org.settingstestclass;

import org.baseclass.BaseClass;
import org.loginlogutPomClass.LoginPomclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.settingspomclass.RecruiterHRPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecruiterHRTest extends BaseClass {



	@BeforeMethod
	public void beforemethod() throws InterruptedException 
	{

		//launchBrowsergoogle();
		launchBrowserfirefox();
		//launchBrowseredgedriver();
		maxBrowser();
		loadUrl("http://dvcareer.cp360apps.com/Admin/Account");
		implictyWait();
		LoginPomclass po = new LoginPomclass();
		fill(po.getEmail(), "chandan.bd@contactpoint360.com");
		Thread.sleep(3000);
		fill(po.getPassword(),"Rayaru@123");
		Thread.sleep(3000);
		//buttonClick(po.getHideicon());
		buttonClick(po.getLogin());
		//toQuit();

	}

	@Test(enabled=true,priority=0)
	public void RecruiterPanel() throws InterruptedException
	{

		RecruiterHRPomClass rh = new RecruiterHRPomClass();
		Thread.sleep(3000);
		buttonClick(rh.getSettings());
		Thread.sleep(3000);
		buttonClick(rh.getRecruiter());
		Thread.sleep(3000);
		buttonClick(rh.getAddnewuser());
		Thread.sleep(3000);
		fill(rh.getFirstname(), "chandan");
		Thread.sleep(3000);
		fill(rh.getLastname(), "automation");
		Thread.sleep(3000);
		fill(rh.getEmail(), "chandanautomation@yopmail.com");
		Thread.sleep(3000);
		buttonClick(rh.getRole());
		Thread.sleep(3000);
		buttonClick(rh.getSelectrole());
		Thread.sleep(6000);
		buttonClick(rh.getCountry());
		Thread.sleep(3000);
		buttonClick(rh.getSelectcountry());
		Thread.sleep(3000);
		buttonClick(rh.getStatus());
		Thread.sleep(6000);
		buttonClick(rh.getSelectstatus());
		Thread.sleep(3000);
		buttonClick(rh.getAdduser());
		//Thread.sleep(3000);
		//toQuit();

	}


	@Test(enabled=true,priority=1)
	public void searchbarandresetpassword() throws InterruptedException
	{
		RecruiterHRPomClass rh = new RecruiterHRPomClass();
		Thread.sleep(3000);
		buttonClick(rh.getSettings());
		Thread.sleep(3000);
		buttonClick(rh.getRecruiter());
		Thread.sleep(3000);
		fill(rh.getSearchbar(), "chandan automation");
		Thread.sleep(3000);
		buttonClick(rh.getSearchbutton());
		Thread.sleep(3000);
		buttonClick(rh.getResetpassword());
		Thread.sleep(3000);
		buttonClick(rh.getSendresetpassword());
		//Thread.sleep(3000);
		//toQuit();



	}
	
	@Test(enabled=true,priority=2)
	public void edit() throws InterruptedException
	{
		RecruiterHRPomClass rh = new RecruiterHRPomClass();
		Thread.sleep(3000);
		buttonClick(rh.getSettings());
		Thread.sleep(3000);
		buttonClick(rh.getRecruiter());
		Thread.sleep(3000);
		fill(rh.getSearchbar(), "chandan automation");
		Thread.sleep(3000);
		buttonClick(rh.getSearchbutton());
		Thread.sleep(3000);
		buttonClick(rh.getEditbutton());
		Thread.sleep(3000);
		delete(rh.getCleardata());
		Thread.sleep(3000);
		fill(rh.getLastname(), "automation123");
		buttonClick(rh.getUpdateuser());
		Thread.sleep(5000);
		buttonClick(rh.getClickok());
		//Thread.sleep(3000);
		//toQuit();
		
		
		
		
		

		
	}
	
	

	@Test(enabled=true,priority=3)
	public void delete() throws InterruptedException
	{
		RecruiterHRPomClass rh = new RecruiterHRPomClass();
		Thread.sleep(3000);
		buttonClick(rh.getSettings());
		Thread.sleep(3000);
		buttonClick(rh.getRecruiter());
		Thread.sleep(3000);
		fill(rh.getSearchbar(), "chandan automation123");
		Thread.sleep(3000);
		buttonClick(rh.getSearchbutton());
		Thread.sleep(3000);
		buttonClick(rh.getDeleteuser());
		Thread.sleep(3000);
		buttonClick(rh.getYesdeleteit());
		//Thread.sleep(3000);
		//toQuit();

	}
	
	
































}
