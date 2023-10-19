package org.settingstest;

import java.awt.AWTException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.ProficiencyLevelPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProficiencyLevelTest extends BaseClass {
	
	@BeforeMethod 
	public void bfrmthd()
	{
		launchBrowsergoogle();
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
	public void proficiencylevel() throws InterruptedException, AWTException
	{
		ProficiencyLevelPomClass pl = new ProficiencyLevelPomClass();
		buttonClick(pl.getSettings());
		buttonClick(pl.getWorkproficiencylevel());
		buttonClick(pl.getProficiencylevel());
		Thread.sleep(3000);
		toperformkeydown(pl.getDeptmntdropdown(), 4);
		toperformenter();
		Thread.sleep(2000);
		toperformkeydown(pl.getWpl1(), 5);
		toperformenter();
		Thread.sleep(2000);
		toperformkeydown(pl.getWpl2(), 3);
		toperformenter();
		fill(pl.getTodays(), "5");
		Thread.sleep(2000);
		buttonClick(pl.getExcludeweekend());
		Thread.sleep(2000);
		buttonClick(pl.getSchedule());
		
		
		
	}

}
