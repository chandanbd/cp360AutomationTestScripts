package org.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClass;
import org.baseclass.Screenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseClass
{
	
	//@Test(enabled=true,priority=1)

		public void loginFunctionality() 
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
			toQuit();


		}

		//@Test(enabled=true)
		public void logintext() throws IOException, InterruptedException 
		{

			launchBrowsergoogle();
			maxBrowser();
			loadUrl("https://h2rdv.cp360apps.com/app");
			implictyWait();
			LoginPomClass po = new LoginPomClass();
			isdisplayed(po.getLogintext());
			Thread.sleep(3000);
			BaseClass.TakeScreenshot("logintext");
			Thread.sleep(3000);
			toQuit();
			


		}
		//@Test(enabled=true,priority=3)
		public void urlvalidation()
		{
			launchBrowsergoogle();
			maxBrowser();
			loadUrl("https://h2rdv.cp360apps.com/app");
			validationurl("currenturl");
			implictyWait();
			LoginPomClass po = new LoginPomClass();
			fill(po.getEmail(), "admin@o2ohrms.com");
			fill(po.getPasswrd(), "Super@dmin@1234");
			buttonClick(po.getCheckbox());
			buttonClick(po.getSubmit());
			pageUrl();
			toQuit();
			
			
			//validationurl("currenturl");
			
	}
		//@Test(enabled=true)
		public void verifyingemail()
		{
			launchBrowsergoogle();
			maxBrowser();
			loadUrl("https://h2rdv.cp360apps.com/app");
			validationurl("currenturl");
			implictyWait();
			LoginPomClass po = new LoginPomClass();
			fill(po.getEmail(), "admin@o2oheerms.com"); // wrong email
			fill(po.getPasswrd(), "Super@dmin@1234");
			buttonClick(po.getCheckbox());
			buttonClick(po.getSubmit());
			getText(po.getEmailnotexist());
			isemaildisplayed("text");
			
		}
		

	
}


