package org.settingstestclass;

import org.baseclass.BaseClass;
import org.loginlogutPomClass.LoginPomclass;
import org.settingspomclass.ExperiencePomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExperienceTest extends BaseClass{
	
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
	
	//@Test
	public void experience() throws InterruptedException
	{
		ExperiencePomClass ep = new ExperiencePomClass();
		Thread.sleep(3000);
		buttonClick(ep.getSettings());
		Thread.sleep(3000);
		buttonClick(ep.getExperience());
		Thread.sleep(3000);
		buttonClick(ep.getAddnewexperience());
		Thread.sleep(3000);
		fill(ep.getInputexperience(), "someExperience");
		Thread.sleep(3000);
		buttonClick(ep.getSave());
		
	}
	
	@Test
	public void experienceedit() throws InterruptedException
	{
		ExperiencePomClass ep = new ExperiencePomClass();
		Thread.sleep(3000);
		buttonClick(ep.getSettings());
		Thread.sleep(3000);
		buttonClick(ep.getExperience());
		Thread.sleep(3000);
		fill(ep.getSearchbar(), "someExperience");
		Thread.sleep(3000);
		buttonClick(ep.getSearchbutton());
		
		
		
	}

}
