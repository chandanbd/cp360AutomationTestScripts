package org.profile.test;

import java.awt.AWTException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.profile.pomclass.EmploymentStatusPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmploymentStatusTest extends BaseClass {
	
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
	
	//@Test
	public void termination() throws InterruptedException, AWTException
	{
		EmploymentStatusPomClass es = new EmploymentStatusPomClass();
		Thread.sleep(3000);
		buttonClick(es.getPeople());
		Thread.sleep(3000);
		fill(es.getSearchemployees(), "vijay devarkonda");
		Thread.sleep(3000);
		buttonClick(es.getSelectprofile());
		Thread.sleep(3000);
		buttonClick(es.getViewhistory());
		Thread.sleep(3000);
		buttonClick(es.getEdit());
		Thread.sleep(6000);
		buttonClick(es.getDatebutton());
		Thread.sleep(3000);
		buttonClick(es.getSelectdate());
		Thread.sleep(3000);
		toperformkeydown(es.getEmploymentstatusdrpdwn(), 5);
		toperformenter();
		buttonClick(es.getEditEmploymentStatushistorysave());
		
		
		}
	
	
	//@Test
	public void requesttermination() throws InterruptedException, AWTException
	{
		EmploymentStatusPomClass es = new EmploymentStatusPomClass();
		Thread.sleep(3000);
		buttonClick(es.getPeople());
		Thread.sleep(3000);
		fill(es.getSearchemployees(), "vijay devarkonda");
		Thread.sleep(3000);
		buttonClick(es.getSelectprofile());
		Thread.sleep(9000);
		buttonClick(es.getRequestchange());
		Thread.sleep(9000);
		buttonClick(es.getRequesttermination());
		Thread.sleep(3000);
		buttonClick(es.getRelievingdate());
		Thread.sleep(3000);
		buttonClick(es.getSelectrelievingdate());
		Thread.sleep(3000);
		toperformkeydown(es.getType(), 4);
		toperformenter();
		Thread.sleep(2000);
		toperformkeydown(es.getReason(), 5);
		toperformenter();
		Thread.sleep(3000);
		toperformkeydown(es.getEligibleforrehire(), 5);
		toperformenter();
		Thread.sleep(5000);
		buttonClick(es.getLastworkingday());
		Thread.sleep(3000);
		buttonClick(es.getLastworkingdaydate());
		Thread.sleep(3000);
		buttonClick(es.getTerminationsubmit());
		
		
		
	}
	
	//@Test
	public void offboardingtask() throws InterruptedException, AWTException
	{
		EmploymentStatusPomClass es = new EmploymentStatusPomClass();
		Thread.sleep(3000);
		buttonClick(es.getPeople());
		Thread.sleep(3000);
		buttonClick(es.getActive());
		Thread.sleep(3000);
		buttonClick(es.getInactive());
		Thread.sleep(3000);
		fill(es.getSearchemployees(), "vijay devarkonda");
		Thread.sleep(3000);
		buttonClick(es.getSelectprofile());
		Thread.sleep(9000);
		buttonClick(es.getDrpdwn());
		Thread.sleep(3000);
		buttonClick(es.getOffboardingtask());
		Thread.sleep(3000);
		buttonClick(es.getNewtaskbutton());
		Thread.sleep(3000);
		fill(es.getTaskname(), "sometask");
		Thread.sleep(3000);
		toperformkeydown(es.getTemplatelist(), 4);
		toperformenter();
		Thread.sleep(3000);
		buttonClick(es.getDuedate());
		Thread.sleep(3000);
		buttonClick(es.getSelectduedate());
		Thread.sleep(3000);
		buttonClick(es.getAddtask());
		
	}
	
	
	@Test
	public void rehire() throws InterruptedException
	{
		EmploymentStatusPomClass es = new EmploymentStatusPomClass();
		Thread.sleep(3000);
		buttonClick(es.getPeople());
		Thread.sleep(3000);
		buttonClick(es.getActive());
		Thread.sleep(3000);
		buttonClick(es.getInactive());
		Thread.sleep(3000);
		fill(es.getSearchemployees(), "poonam raj");
		Thread.sleep(3000);
		
		
		
	}
	
	
	
	
	
	
}
