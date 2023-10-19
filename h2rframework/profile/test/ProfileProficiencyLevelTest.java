package org.profile.test;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.ProficiencyLevelPomClass;
import org.testng.annotations.BeforeMethod;

public class ProfileProficiencyLevelTest extends BaseClass{
	
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
	
	public void proficiencylevel() throws InterruptedException
	{
		ProficiencyLevelPomClass pl = new ProficiencyLevelPomClass();
		Thread.sleep(3000);
		
		
		
		
		
	}

}
