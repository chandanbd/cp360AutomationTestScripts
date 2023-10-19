package org.settingstest;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.TimeoffChanges1PomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeoffChanges1Test extends BaseClass {
	
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
	
	//@Test(enabled=true, priority=0)
	public void timeoffchanges() throws InterruptedException, IOException
	{
		TimeoffChanges1PomClass tf = new TimeoffChanges1PomClass();
		Thread.sleep(3000);
		buttonClick(tf.getSettings());
		Thread.sleep(3000);
		buttonClick(tf.getTimeoff());
		Thread.sleep(3000);
		buttonClick(tf.getTimeoffnewcategory());
		Thread.sleep(3000);
		fill(tf.getCategoryname(), "AutoTest1");
		buttonClick(tf.getCategorysave());
		Thread.sleep(2000);
		BaseClass.TakeScreenshot("categorysave");
		
	}
	
	//@Test(enabled=true, priority=1)
	public void timeoffchanges1() throws InterruptedException
	{
		
		TimeoffChanges1PomClass tf = new TimeoffChanges1PomClass();
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
		Thread.sleep(2000);
		fill(tf.getEnterpolicyname(), "chanauto");
		Thread.sleep(2000);
		buttonClick(tf.getNewpolicynext());
		Thread.sleep(5000);
		buttonClick(tf.getAccrualtimeoffdrpdwn());
		Thread.sleep(3000);
		buttonClick(tf.getSelectdays());
		Thread.sleep(3000);
		buttonClick(tf.getAccrualoptions());
		Thread.sleep(3000);
		fill(tf.getEmployeeaccruedrpdwn1(), "1");
		Thread.sleep(3000);
		buttonClick(tf.getEmployeeaccruedrpdwn2());
		Thread.sleep(3000);
		buttonClick(tf.getEmployeeaccruedrpdwn3());
		Thread.sleep(3000);
		buttonClick(tf.getEmployeeaccruedrpdwn4());
		Thread.sleep(3000);
		buttonClick(tf.getEmployeeaccruedrpdwn5());
		Thread.sleep(3000);
		buttonClick(tf.getFinalsavepolicy());
		
		
		
	}
	
	//@Test(enabled=true, priority=1)
	public void timeoffchanges2() throws InterruptedException
	{
		
		TimeoffChanges1PomClass tf = new TimeoffChanges1PomClass();
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
		Thread.sleep(2000);
		fill(tf.getEnterpolicyname(), "autotest1");
		Thread.sleep(2000);
		buttonClick(tf.getNewpolicynext());
		Thread.sleep(5000);
		buttonClick(tf.getAccrualtimeoffdrpdwn());
		Thread.sleep(3000);
		buttonClick(tf.getSelectdays());
		Thread.sleep(3000);
		buttonClick(tf.getAccrualoptions());
		Thread.sleep(3000);
		fill(tf.getEmployeeaccruedrpdwn1(), "1");
		Thread.sleep(3000);
		buttonClick(tf.getEmployeeaccruedrpdwn2());
		Thread.sleep(3000);
		buttonClick(tf.getEmployeeaccruedrpdwn3());
		Thread.sleep(3000);
		buttonClick(tf.getEmployeeaccruedrpdwn4());
		Thread.sleep(3000);
		buttonClick(tf.getEmployeeaccruedrpdwn5());
		Thread.sleep(3000);
		buttonClick(tf.getFinalsavepolicy());
		
		
		
	}
	
	//@Test
	public void timeoffchangestwicemonthday() throws InterruptedException
	{
		TimeoffChanges1PomClass tf = new TimeoffChanges1PomClass();
		buttonClick(tf.getSettings());
		Thread.sleep(2000);
		buttonClick(tf.getTimeoff());
		buttonClick(tf.getSelectallcategories());
		Thread.sleep(2000);
		buttonClick(tf.getSelectactive());
		Thread.sleep(2000);
		buttonClick(tf.getSelectcategory());
		Thread.sleep(2000);
		buttonClick(tf.getAddpolicy());
		Thread.sleep(2000);
		buttonClick(tf.getCreatenewpolicy());
		buttonClick(tf.getPolicynext());
		buttonClick(tf.getAccruestime());
		buttonClick(tf.getAccruesnext());
		Thread.sleep(2000);
		fill(tf.getEnterpolicyname(), "someautomationpolicy123");
		Thread.sleep(2000);
		buttonClick(tf.getNewpolicynext());
		Thread.sleep(5000);
		buttonClick(tf.getAccrualtimeoffdrpdwn());
		Thread.sleep(3000);
		buttonClick(tf.getSelectdays());
		Thread.sleep(3000);
		buttonClick(tf.getAccrualoptions());
		Thread.sleep(3000);
		fill(tf.getEmployeeaccruedrpdwn1(), "1");
		Thread.sleep(3000);
		//buttonClick(tf.getEmployeeaccruedrpdwn2());
		//Thread.sleep(3000);
		buttonClick(tf.getDropdwn1());
		Thread.sleep(3000);
		buttonClick(tf.getDrpdwn2());
		Thread.sleep(3000);
		buttonClick(tf.getDrpdwn3());
		Thread.sleep(3000);
		buttonClick(tf.getDrpdwn4());
		Thread.sleep(3000);
		buttonClick(tf.getFinalsavepolicy());
		
	}
	
	//@Test
	public void addtime() throws InterruptedException
	{
		TimeoffChanges1PomClass tf = new TimeoffChanges1PomClass();
		buttonClick(tf.getSettings());
		Thread.sleep(2000);
		buttonClick(tf.getPeople());
		Thread.sleep(2000);
		fill(tf.getSearchemployee(), "chandan b d");
		Thread.sleep(2000);
		buttonClick(tf.getSelectprofile());
		Thread.sleep(2000);
		buttonClick(tf.getSelecttimeoffsummary());
		Thread.sleep(2000);
		buttonClick(tf.getPolicyeditbutton());
		Thread.sleep(2000);
		fill(tf.getInputdays(), "2");
		Thread.sleep(2000);
		fill(tf.getNote(), "some note");
		Thread.sleep(2000);
		buttonClick(tf.getEditpolicysave());
		
	}
	
	//@Test
	public void subtracttime() throws InterruptedException, AWTException
	{

		TimeoffChanges1PomClass tf = new TimeoffChanges1PomClass();
		buttonClick(tf.getSettings());
		Thread.sleep(2000);
		buttonClick(tf.getPeople());
		Thread.sleep(2000);
		fill(tf.getSearchemployee(), "chandan b d");
		Thread.sleep(2000);
		buttonClick(tf.getSelectprofile());
		Thread.sleep(2000);
		buttonClick(tf.getSelecttimeoffsummary());
		Thread.sleep(2000);
		buttonClick(tf.getPolicyeditbutton());
		Thread.sleep(2000);
		toperformkeydown(tf.getAmountbutton(), 4);
		toperformenter();
		Thread.sleep(2000);
		fill(tf.getInputdays(), "2");
		Thread.sleep(2000);
		fill(tf.getNote(), "some note");
		Thread.sleep(2000);
		buttonClick(tf.getEditpolicysave());
		
		
		
	}
	
	@Test
	public void timeoffchangestwicemonthhrs() throws InterruptedException
	{
		TimeoffChanges1PomClass tf = new TimeoffChanges1PomClass();
		buttonClick(tf.getSettings());
		Thread.sleep(2000);
		buttonClick(tf.getTimeoff());
		buttonClick(tf.getSelectallcategories());
		Thread.sleep(2000);
		buttonClick(tf.getSelectactive());
		Thread.sleep(2000);
		buttonClick(tf.getSelectcategory());
		Thread.sleep(2000);
		buttonClick(tf.getAddpolicy());
		Thread.sleep(2000);
		buttonClick(tf.getCreatenewpolicy());
		buttonClick(tf.getPolicynext());
		buttonClick(tf.getAccruestime());
		buttonClick(tf.getAccruesnext());
		Thread.sleep(2000);
		fill(tf.getEnterpolicyname(), "twiceinmonthhrs");
		Thread.sleep(2000);
		buttonClick(tf.getNewpolicynext());
		Thread.sleep(5000);
		buttonClick(tf.getAccrualtimeoffdrpdwn());
		Thread.sleep(3000);
		buttonClick(tf.getSelecthrs());
		Thread.sleep(3000);
		buttonClick(tf.getAccrualoptions());
		Thread.sleep(3000);
		buttonClick(tf.getCapemployeecanaccrue());
		Thread.sleep(3000);
		fill(tf.getInputenteraccrualcap(), "8");
		Thread.sleep(3000);
		fill(tf.getEmployeeaccruedrpdwn1(), "1");
		Thread.sleep(3000);
		buttonClick(tf.getFinalsavepolicy());
		
		
	}
	
	

}
