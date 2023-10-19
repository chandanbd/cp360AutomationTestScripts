package org.settingstest;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.ApplyTimeOffPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ApplyTimeOffTest extends BaseClass{
	
	
	@BeforeMethod 
	public void bfrmthd()
	{
		 
		
		
		
		//launchBrowseredgedriver();
		//launchBrowsergoogle();
		launchBrowserfirefox();
		//maxBrowser();
		loadUrl("https://h2rdv.cp360apps.com/app");
		implictyWait();
		LoginPomClass po = new LoginPomClass();
		fill(po.getEmail(), "admin@o2ohrms.com"); //admin@o2ohrms.com
		fill(po.getPasswrd(), "Super@dmin@1234"); //Super@dmin@1234
		buttonClick(po.getCheckbox());
		buttonClick(po.getSubmit());

	}
	
	@Test(enabled=true,priority=1)
	public void applytimeoffFullDay() throws InterruptedException, AWTException, IOException //Tested with Admin Credentials
	{
		ApplyTimeOffPomClass at = new ApplyTimeOffPomClass();
		buttonClick(at.getProfile());
		buttonClick(at.getTimeoff());
		buttonClick(at.getApplytimeoff());
		Thread.sleep(5000);
		toperformkeydown(at.getTimeoffpolicydd(), 5);
		//fill(at.getInputtofp(), "casual");
		Thread.sleep(3000);
		toperformenter();
		Thread.sleep(3000);
		buttonClick(at.getFromdate());
		Thread.sleep(3000);
		buttonClick(at.getSelectfromdate());
		Thread.sleep(3000);
		buttonClick(at.getTodate());
		Thread.sleep(3000);
		buttonClick(at.getSelecttodate());
		Thread.sleep(3000);
		fill(at.getReason(), "some reason");
		Thread.sleep(3000);
		buttonClick(at.getApplytimeoffsave());
		Thread.sleep(3000);
		BaseClass.TakeScreenshot("applytimeoffsave");
		
		
	}
	
	
	@Test(enabled=true,priority=2)
	public void applytimeoffHalfDay() throws InterruptedException, AWTException, IOException
	{
		ApplyTimeOffPomClass at = new ApplyTimeOffPomClass();
		buttonClick(at.getProfile());
		buttonClick(at.getTimeoff());
		buttonClick(at.getApplytimeoff());
		Thread.sleep(5000);
		toperformkeydown(at.getTimeoffpolicydd(), 4);
		Thread.sleep(3000);
		toperformenter();
		Thread.sleep(3000);
		buttonClick(at.getHalfday());
		Thread.sleep(3000);
		buttonClick(at.getHalfdaydate());
		Thread.sleep(3000);
		buttonClick(at.getSelecthalfdaydate());
		Thread.sleep(3000);
		fill(at.getReason(), "some reason");
		Thread.sleep(3000);
		buttonClick(at.getApplytimeoffsave());
		Thread.sleep(3000);
		BaseClass.TakeScreenshot("applytimeoffsave");
		
		
		
		
		
		
		
	}
	
	
	
	
	@Test(enabled=true,priority=3)
	public void applyHourlyLeave() throws InterruptedException, AWTException, IOException
	{
		ApplyTimeOffPomClass at = new ApplyTimeOffPomClass();
		buttonClick(at.getProfile());
		buttonClick(at.getTimeoff());
		buttonClick(at.getApplytimeoff());
		Thread.sleep(5000);
		toperformkeydown(at.getTimeoffpolicydd(), 4);
		Thread.sleep(3000);
		toperformenter();
		Thread.sleep(3000);
		buttonClick(at.getHourly());
		Thread.sleep(3000);
		buttonClick(at.getHourlydate());
		Thread.sleep(3000);
		buttonClick(at.getSelecthourlydate());
		Thread.sleep(3000);
		/*buttonClick(at.getSelectfromtime());
		Thread.sleep(3000);
		buttonClick(at.getSelectpm());
		Thread.sleep(10000);
		//webdriverwait1(at.getSelect5hrs());
		buttonClick(at.getSelect5hrs());
		Thread.sleep(9000);
		buttonClick(at.getSelect30min());
		Thread.sleep(3000);
		buttonClick(at.getSelecttotimedrdwn());
		Thread.sleep(3000);
		buttonClick(at.getSelecttotime());
		Thread.sleep(3000);*/
		fill(at.getReason(), "some reason");
		Thread.sleep(3000);
		buttonClick(at.getApplytimeoffsave());
		Thread.sleep(3000);
		BaseClass.TakeScreenshot("applytimeoffsave");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
