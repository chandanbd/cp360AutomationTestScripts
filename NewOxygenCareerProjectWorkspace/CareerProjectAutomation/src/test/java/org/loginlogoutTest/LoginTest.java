package org.loginlogoutTest;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.loginlogutPomClass.LoginPomclass;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {



	@Test(enabled=true,priority=1)
	public void loginFunctionality() throws InterruptedException 
	{

		//launchBrowsergoogle();
		launchBrowserfirefox();
		//launchBrowseredgedriver();
		//maxBrowser();
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
	
	@Test(enabled=true,priority=2)
	public void logoutfunctionality() throws InterruptedException, AWTException, IOException
	{
		LoginPomclass po = new LoginPomclass();
		Thread.sleep(3000);
		buttonClick(po.getLogouticon());
		Thread.sleep(3000);
		buttonClick(po.getLogout());
		Thread.sleep(3000);
		toperformenter();
		Thread.sleep(5000);
		BaseClass.TakeScreenshot("scrnsht1");
		
	}
	
	@Test(enabled=true,priority=3)
	public void loginwithwrongPassword() throws InterruptedException, IOException 
	{

		//launchBrowsergoogle();
		launchBrowserfirefox();
		//launchBrowseredgedriver();
		//maxBrowser();
		loadUrl("http://dvcareer.cp360apps.com/Admin/Account");
		implictyWait();
		LoginPomclass po = new LoginPomclass();
		fill(po.getEmail(), "chandan.bd@contactpoint360.com");
		Thread.sleep(3000);
		fill(po.getPassword(),"Rayaru@12345");
		Thread.sleep(3000);
		//buttonClick(po.getHideicon());
		buttonClick(po.getLogin());
		Thread.sleep(3000);
		BaseClass.TakeScreenshot("password");
		//toQuit();

	}
	
	@Test(enabled=true,priority=4)
	public void loginwithwrongMailid() throws InterruptedException, IOException 
	{

		//launchBrowsergoogle();
		launchBrowserfirefox();
		//launchBrowseredgedriver();
		//maxBrowser();
		loadUrl("http://dvcareer.cp360apps.com/Admin/Account");
		implictyWait();
		LoginPomclass po = new LoginPomclass();
		fill(po.getEmail(), "chandan.bd47@contactpoint360.com");
		Thread.sleep(3000);
		
		fill(po.getPassword(),"Rayaru@12345");
		Thread.sleep(3000);
		//buttonClick(po.getHideicon());
		buttonClick(po.getLogin());
		Thread.sleep(3000);
		BaseClass.TakeScreenshot("email");
		//toQuit();

	}
	
	
	
	
	

}
