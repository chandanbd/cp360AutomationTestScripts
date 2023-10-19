package org.test;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.pomclass.HomePomClass;
import org.pomclass.LoginPomClass;
import org.pomclass.PeoplePomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class PeopleTest extends BaseClass{
	//WebDriver driver;
	
	
	@BeforeMethod 
	public void bfrmthd()
	{
		launchBrowserfirefox();
		//launchBrowsergoogle();
		//launchBrowseredgedriver();
		//maxBrowser();
		loadUrl("https://h2rdv.cp360apps.com/app");
		implictyWait();
		LoginPomClass po = new LoginPomClass();
		PeoplePomClass pl = new PeoplePomClass();
		fill(po.getEmail(), "admin@o2ohrms.com");
		fill(po.getPasswrd(), "Super@dmin@1234");
		buttonClick(po.getCheckbox());
		buttonClick(po.getSubmit());
		
	}
	
	@Test(enabled=true)
	public void onboardingEmployee() throws InterruptedException, AWTException, IOException 
	{
		
		PeoplePomClass pl = new PeoplePomClass();
		buttonClick(pl.getPeople()); 
		buttonClick(pl.getObrdngemployee());
		fill(pl.getFrstname(), "sanketh");
		fill(pl.getLstname(),"puttanshetty");
		fill(pl.getPersonalemail(),"sankethputtanassdhetty@yopmail.com");
		Thread.sleep(3000);
		buttonClick(pl.getNext());
		Thread.sleep(5000);
		toperformkeydown(pl.getJoblocation(),4);
		toperformenter();
		
		toperformkeydown(pl.getDivision(),3);
		toperformenter();
		
		toperformkeydown(pl.getDepartment(),3);
		toperformenter();
		
		toperformkeydown(pl.getJobtitle(),3);
		toperformenter();
		
		Thread.sleep(3000);
		
		toperformkeydown(pl.getEmploymentstatus(),3);
		toperformenter();
		
		Thread.sleep(3000);
		
		toperformkeydown(pl.getWorktype(),3);
		toperformenter();
		
		Thread.sleep(3000);
		
		buttonClick(pl.getHiredate());
		Thread.sleep(3000);
		buttonClick(pl.getSelectdate());
		
		Thread.sleep(3000);
		
		toperformkeydown(pl.getReportsto(), 3);
		toperformenter();
		
		Thread.sleep(3000);
		
		buttonClick(pl.getAssignbycategory());
		
		Thread.sleep(3000);

		
		toperformkeydown(pl.getTimeoffcategory(), 9);
		toperformenter();
		
		Thread.sleep(6000);
		
		//toperformkeydown(pl.getHolidays(), 9);
		Thread.sleep(3000);
		//toperformenter();
		
		Thread.sleep(3000);
		
		
		
		
		buttonClick(pl.getJobnext());
		
		Thread.sleep(3000);
		
		toperformkeydown(pl.getEmployeeacess(), 5);
		Thread.sleep(3000);
		toperformenter();
		
		
	
		buttonClick(pl.getCompensationnext());
		
		buttonClick(pl.getOnboardingtask());
		buttonClick(pl.getSubmit());
		Thread.sleep(3000);
		BaseClass.TakeScreenshot("submit");
		
	}
	
	
	//@Test(enabled=true)
	public void offboarding() throws InterruptedException, AWTException
	{
		
		PeoplePomClass pl = new PeoplePomClass();
		buttonClick(pl.getPeople()); 
		fill(pl.getSearchemployees(), "pankaj pattar");
		buttonClick(pl.getParticularprofile());
		Thread.sleep(5000);
		//toperformkeydown(pl.getSettingsdropdown(), 6);
		buttonClick(pl.getSettingsdropdown());
		buttonClick(pl.getOffboarding());
		buttonClick(pl.getRelievingdate());
		buttonClick(pl.getSelectrelievingdate());
		buttonClick(pl.getTypedropdown());
		buttonClick(pl.getResignationvoluntary());
		
		Thread.sleep(3000);
		
		
		toperformkeydown(pl.getReasonbutton(), 4);
		toperformenter();
		
		Thread.sleep(3000);
		
		toperformkeydown(pl.getEligiblerehire(), 3);
		toperformenter();
		Thread.sleep(3000);
		
		fill(pl.getComment(), "hello offboarding");
		
		//buttonClick(pl.getLastwrkngday());
		//buttonClick(pl.getNextmonth());
		//buttonClick(pl.getSelectnextmonthdate());
		
		buttonClick(pl.getAddoffboardingtasks());
		buttonClick(pl.getOffboardinglist());
		buttonClick(pl.getAddselectedtasks());
		buttonClick(pl.getSubmitoffboardingtask());
		
		
	}

}
