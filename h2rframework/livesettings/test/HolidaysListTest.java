package org.livesettings.test;

import java.awt.AWTException;

import org.baseclass.BaseClass;
import org.livesettings.pomclass.HolidaysListPomClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HolidaysListTest extends BaseClass {
	
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
	
	@Test
	public void holidaylist() throws InterruptedException, AWTException
	{
		HolidaysListPomClass hl = new HolidaysListPomClass();
		Thread.sleep(3000);
		buttonClick(hl.getSettings());
		Thread.sleep(3000);
		buttonClick(hl.getHolidays());
		Thread.sleep(3000);
		buttonClick(hl.getAddholidayslist());
		Thread.sleep(3000);
		fill(hl.getHolidayinput(), "AutomationHoliday");
		Thread.sleep(3000);
		toperformkeydown(hl.getLocationdrpdwn(), 11);
		Thread.sleep(3000);
		toperformenter();
		
		
		
		//fill(hl.getLocationinput(), "India - Bengaluru");
		//Thread.sleep(3000);
//robotkeydown();
		//Thread.sleep(3000);
		//toperformenter();
		
		
		
		
		
	}

}
