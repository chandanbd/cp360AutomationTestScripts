package org.settingstest;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.HolidaysListPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HolidaysListTest extends BaseClass {
	
	
	@BeforeMethod 
	public void bfrmthd()
	{
		//launchBrowsergoogle();
		launchBrowserfirefox();
		maxBrowser();
		loadUrl("https://h2rdv.cp360apps.com/app");
		implictyWait();
		LoginPomClass po = new LoginPomClass();
		fill(po.getEmail(), "admin@o2ohrms.com");
		fill(po.getPasswrd(), "Super@dmin@1234");
		buttonClick(po.getCheckbox());
		buttonClick(po.getSubmit());
		
	}
	
	@Test
	public void holidaylist() throws InterruptedException, AWTException, IOException
	{
		
		HolidaysListPomClass hl = new HolidaysListPomClass();
		buttonClick(hl.getSettings());
		buttonClick(hl.getHolidays());
		buttonClick(hl.getAddholidayslist());
		fill(hl.getInputholidaylistname(), "simple holiday");
		Thread.sleep(3000);
		toperformkeydown(hl.getLocationdropdown(), 3);
		toperformenter();
		buttonClick(hl.getFromdate());
		Thread.sleep(3000);
		buttonClick(hl.getSelectfromdate());
		Thread.sleep(2000);
		buttonClick(hl.getTodate());
		buttonClick(hl.getSelecttodate());
		
		Thread.sleep(5000);
		
		buttonClick(hl.getChoosedate1());
		Thread.sleep(3000);
		buttonClick(hl.getSelectfromdatedown());
		fill(hl.getDescription1(), "hfcdjg");
		
		buttonClick(hl.getAddrow());
		
		Thread.sleep(3000);
		
		buttonClick(hl.getChoosedate2());
		Thread.sleep(3000);
		buttonClick(hl.getSelecttodatedown());
		fill(hl.getDescription2(), "wertghj");
		
		//scrollUp();
		
		//Thread.sleep(9000);
		//webdriverwait1(hl.getSaveholiday());
		
		robotscrollup();
		Thread.sleep(3000);
		buttonClick(hl.getSaveholiday());
		Thread.sleep(3000);
		BaseClass.TakeScreenshot("saveholiday");
		
		
		
		
		
		
		
	}

}
