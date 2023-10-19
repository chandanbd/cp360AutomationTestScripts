package org.settingstest;

import java.awt.AWTException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.ProjectsPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectsTest extends BaseClass
{
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
	
	//@Test
	public void projects()
	{
		ProjectsPomClass pt = new ProjectsPomClass();
		buttonClick(pt.getSettings());
		buttonClick(pt.getProjects());
		buttonClick(pt.getAddproject());
		fill(pt.getProjectinput(), "Automation");
		buttonClick(pt.getProjectsubmit());
	}
	
	
	@Test
	public void projectsAdd() throws InterruptedException, AWTException
	{
		ProjectsPomClass pt = new ProjectsPomClass();
		buttonClick(pt.getSettings());
		buttonClick(pt.getProjects());
		buttonClick(pt.getAddemployeesbutton());
		fill(pt.getAddemployeesbuttondrpdwn(),"Admin admin");
		toperformkeydown(pt.getAddemployeesbuttondrpdwn(), 2);
		toperformenter();
		
	}

}
