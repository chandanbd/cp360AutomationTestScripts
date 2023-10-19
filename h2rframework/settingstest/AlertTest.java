package org.settingstest;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.AlertPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest extends BaseClass{
	
	
	
	@BeforeMethod 
	public void bfrmthd()     // should write testscripts with other timezones
	{
		launchBrowsergoogle();
		//launchBrowseredgedriver();
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
	public void birthdayalert() throws InterruptedException, AWTException, IOException
	{
		
		AlertPomClass al = new AlertPomClass();
		buttonClick(al.getSettings());
		buttonClick(al.getAlerts());
		buttonClick(al.getAddalert());
		buttonClick(al.getBirthdays());
		fill(al.getInputalertname(), "Automationbirthdayalert");
		buttonClick(al.getAlertnext());
		buttonClick(al.getFulladminuser());
		//Thread.sleep(3000);
		toperformkeydown(al.getTimedropdown(), 6);
		toperformenter();
		//Thread.sleep(3000);
		toperformkeydown(al.getTimezonedropdown(), 3);
		toperformenter();
		fill(al.getReminder(), "1");
		toperformkeydown(al.getReminderdrpdwn1(), 6);
		toperformenter();
		toperformkeydown(al.getReminderdrpdwn2(), 3);
		toperformenter();
		buttonClick(al.getAllemployees());
		buttonClick(al.getOnlysomeemployees());
		buttonClick(al.getEmploymentstatus());
		buttonClick(al.getFulltime());
		buttonClick(al.getSave());
		Thread.sleep(3000);
		buttonClick(al.getNext());
		fill(al.getSubjectinput(), "testing birtday");
		fill(al.getMessageinput(), "hello automation birthday best wishes");
		buttonClick(al.getPreview());
		Thread.sleep(5000);
		buttonClick(al.getClose());
		Thread.sleep(3000);
		buttonClick(al.getFinalsubmit());
		Thread.sleep(3000);
		BaseClass.TakeScreenshot("finalsubmit");
		close();
		
		
	}
	
	@Test
	public void newhirealert() throws InterruptedException
	{
		AlertPomClass al = new AlertPomClass();
		buttonClick(al.getSettings());
		buttonClick(al.getAlerts());
		buttonClick(al.getAddalert());
		Thread.sleep(3000);
		buttonClick(al.getNewhirealert());
		fill(al.getNwhireinputalname(), "NewHireAutomationAlert");
		buttonClick(al.getNwhireinptnext());
		buttonClick(al.getNwhirefulladmin());
		buttonClick(al.getNwhiremanager());
		buttonClick(al.getNwhirenxt());
		fill(al.getNwhiresubject(), "NewHireAutomationAlert");
		
		
		
		
		
		
		
		
		
		
		
	}

}
