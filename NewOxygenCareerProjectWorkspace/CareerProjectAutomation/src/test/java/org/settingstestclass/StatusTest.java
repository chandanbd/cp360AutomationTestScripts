package org.settingstestclass;

import org.baseclass.BaseClass;
import org.loginlogutPomClass.LoginPomclass;
import org.settingspomclass.StatusPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StatusTest extends BaseClass {

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
	public void addStatus() throws InterruptedException
	{
		StatusPomClass st = new StatusPomClass();
		Thread.sleep(3000);
		buttonClick(st.getSettings());
		Thread.sleep(3000);
		buttonClick(st.getStatus());
		Thread.sleep(3000);
		buttonClick(st.getAddnewstatus());
		Thread.sleep(3000);
		fill(st.getStatusinput(), "somestatus");
		Thread.sleep(3000);
		buttonClick(st.getSave());

	}
	
	@Test
	public void editStatus() throws InterruptedException
	{
		StatusPomClass st = new StatusPomClass();
		Thread.sleep(3000);
		buttonClick(st.getSettings());
		Thread.sleep(3000);
		buttonClick(st.getStatus());
		Thread.sleep(3000);
		fill(st.getSearchinput(), "somestatus");
		Thread.sleep(3000);
		buttonClick(st.getSearchbutton());
		Thread.sleep(3000);
		buttonClick(st.getEditstatus());
		Thread.sleep(3000);
		delete(st.getClearstatus());
		Thread.sleep(3000);
		
		
		
	}
	
	
	
	
	
	

}
