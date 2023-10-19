package org.settingstest;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.TimeoffPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeoffTest extends BaseClass{

	
	@BeforeMethod 
	public void bfrmthd()
	{
		 
		
		
		
		//launchBrowseredgedriver();
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
	
	//@Test
	public void timeoffcategory() throws InterruptedException, IOException
	{
		TimeoffPomClass tf = new TimeoffPomClass();
		buttonClick(tf.getSettings());
		buttonClick(tf.getTimeoff());
		buttonClick(tf.getTimeoffnewcategory());
		fill(tf.getCategoryname(), "AutomationTesting");
		buttonClick(tf.getCategorysave());
		Thread.sleep(2000);
		BaseClass.TakeScreenshot("categorysave");
	}
	
	@Test
	public void timeoffpolicy() throws InterruptedException, IOException
	{
		TimeoffPomClass tf = new TimeoffPomClass();
		buttonClick(tf.getSettings());
		buttonClick(tf.getTimeoff());
		buttonClick(tf.getSelectallcategories());
		buttonClick(tf.getSelectactive());
		buttonClick(tf.getSelectcategory());
		buttonClick(tf.getAddpolicy());
		Thread.sleep(2000);
		buttonClick(tf.getCreatenewpolicy());
		buttonClick(tf.getPolicynext());
		buttonClick(tf.getAccruestime());
		buttonClick(tf.getAccruesnext());
		fill(tf.getEnterpolicyname(), "Automation");
		Thread.sleep(2000);
		buttonClick(tf.getNewpolicynext());
		Thread.sleep(5000);
		buttonClick(tf.getAccrualtimeoffdrpdwn());
		Thread.sleep(3000);
		buttonClick(tf.getSelectdays());
		Thread.sleep(3000);
		buttonClick(tf.getAccrualoptions());
		Thread.sleep(3000);
		fill(tf.getEmployeeaccrue1(), "1");
		Thread.sleep(3000);
		buttonClick(tf.getEmpaccruebtn());
		Thread.sleep(3000);
		buttonClick(tf.getEmployeeaccrue2());
		Thread.sleep(3000);
		buttonClick(tf.getFinalsavepolicy());
		Thread.sleep(3000);
		BaseClass.TakeScreenshot("finalsavepolicy");
		
		
		
		
		
		
		
		
		
	}
}
