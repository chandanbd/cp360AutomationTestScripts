package org.settingstest;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.AnnouncementsPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnouncementsTest extends BaseClass {

	@BeforeMethod 
	public void bfrmthd()
	{
		//launchBrowsergoogle();
		//launchBrowserfirefox();
		launchBrowseredgedriver();
		maxBrowser();
		loadUrl("https://h2rtest.cp360apps.com/app/");
		implictyWait();
		LoginPomClass po = new LoginPomClass();
		fill(po.getEmail(), "admin@o2ohrms.com");
		fill(po.getPasswrd(), "Super@dmin@1234");
		buttonClick(po.getCheckbox());
		buttonClick(po.getSubmit());

	}

	//@Test
	public void announcementOnlysomeEmployees() throws InterruptedException, AWTException, IOException
	{
		AnnouncementsPomClass an = new AnnouncementsPomClass();
		buttonClick(an.getSettings());
		buttonClick(an.getAnnouncements());
		buttonClick(an.getAddannouncement());
		fill(an.getTitle(), "workday_happy_wednesday_automation");
		Thread.sleep(3000);
		
		buttonClick(an.getAnnouncementchoice());
		buttonClick(an.getSelectingchoice());
		Thread.sleep(6000);

		toperformkeydown(an.getJobtitle(), 9);
		Thread.sleep(3000);
		toperformenter();
		buttonClick(an.getJobtitle());
		Thread.sleep(2000);

		toperformkeydown(an.getDepartment(), 3);
		toperformenter();
		buttonClick(an.getDepartment());

		Thread.sleep(2000);

		toperformkeydown(an.getCountry(), 5);
		toperformenter();
		buttonClick(an.getCountry());

		Thread.sleep(2000);


		toperformkeydown(an.getEmploygrp(), 6);
		toperformenter();
		buttonClick(an.getEmploygrp());

		Thread.sleep(5000);

		fill(an.getContentinput(), " hello, wednesday12345 can feel a bit tiring and boring, but at the same time, Mondaycan bring some peace and freshness to our minds as the week starts");

		Thread.sleep(2000);

		buttonClick(an.getSendmail());
		Thread.sleep(2000);
		buttonClick(an.getPostancmnt());
		Thread.sleep(3000);
		BaseClass.TakeScreenshot("postancmnt");

	}
	
	@Test
	public void announcementsAllEmployees() throws InterruptedException, IOException
	{
		AnnouncementsPomClass an = new AnnouncementsPomClass();
		buttonClick(an.getSettings());
		buttonClick(an.getAnnouncements());
		buttonClick(an.getAddannouncement());
		fill(an.getTitle(), "friday_bliss_Automation");
		Thread.sleep(9000);
		fill(an.getContentinput(), " hello, friday");

		Thread.sleep(3000);

		buttonClick(an.getSendmail());
		Thread.sleep(2000);
		buttonClick(an.getPostancmnt());
		Thread.sleep(6000);
		BaseClass.TakeScreenshot("postancmnt");
		
	}

}
