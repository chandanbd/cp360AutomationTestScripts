package org.profile.test;

import java.awt.AWTException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.profile.pomclass.RehirePomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RehireTest extends BaseClass{

	@BeforeMethod 
	public void bfrmthd()
	{
		//launchBrowsergoogle();
		launchBrowserfirefox();
		//launchBrowseredgedriver();
		//maxBrowser();
		loadUrl("https://h2rtest.cp360apps.com/app/");
		implictyWait();
		LoginPomClass po = new LoginPomClass();
		fill(po.getEmail(), "admin@o2ohrms.com");
		fill(po.getPasswrd(), "Super@dmin@1234");
		buttonClick(po.getCheckbox());
		buttonClick(po.getSubmit());

	}

	@Test
	public void rehire() throws InterruptedException, AWTException
	{
		RehirePomClass rh = new RehirePomClass();
		Thread.sleep(3000);
		buttonClick(rh.getPeople());
		Thread.sleep(3000);
		buttonClick(rh.getActive());
		Thread.sleep(3000);
		buttonClick(rh.getInactive());
		Thread.sleep(3000);
		fill(rh.getSearchemployees(), "andrew");
		Thread.sleep(3000);
		buttonClick(rh.getPersonid());
		Thread.sleep(3000);
		buttonClick(rh.getDrpdwnbutton());
		Thread.sleep(3000);
		buttonClick(rh.getSelectrehire());
		Thread.sleep(3000);
		buttonClick(rh.getConfirm());
		Thread.sleep(6000);
		toperformkeydown(rh.getJoblocation(), 5);
		toperformenter();
		Thread.sleep(3000);
		toperformkeydown(rh.getDivision(), 8);
		toperformenter();
		Thread.sleep(3000);
		toperformkeydown(rh.getDepartment(), 6);
		toperformenter();
		Thread.sleep(3000);
		toperformkeydown(rh.getJobtitle(), 5);
		toperformenter();
		Thread.sleep(3000);
		toperformkeydown(rh.getEmploymentstatus(), 6);
		toperformenter();
		Thread.sleep(3000);
		toperformkeydown(rh.getWorktype(), 5);
		toperformenter();
		Thread.sleep(3000);
		buttonClick(rh.getHiredate());
		Thread.sleep(3000);
		buttonClick(rh.getSelecthiredate());
		Thread.sleep(3000);
		toperformkeydown(rh.getReportsto(), 5);
		toperformenter();
		Thread.sleep(3000);
		buttonClick(rh.getNext());
		Thread.sleep(3000);
		buttonClick(rh.getInputallowaccess());
		Thread.sleep(3000);
		toperformkeydown(rh.getAccessdrpdwn(), 6);
		toperformenter();
		Thread.sleep(3000);
		buttonClick(rh.getAccessdrpdwnnext());
		Thread.sleep(3000);
		buttonClick(rh.getOnboardingtask1());
		Thread.sleep(3000);
		buttonClick(rh.getOnboardingtask2());
		Thread.sleep(3000);
		buttonClick(rh.getFinalsubmit());














	}

}
