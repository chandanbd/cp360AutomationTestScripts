package org.settingstest;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.EmployeeGroupsPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class EmployeeGroupsTest extends BaseClass{
	
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
	
	@Test
	public void employeegrp() throws InterruptedException, IOException
	{
		EmployeeGroupsPomClass eg = new EmployeeGroupsPomClass();
		buttonClick(eg.getSettings());
		buttonClick(eg.getEmployeegrp());
		buttonClick(eg.getAddemployeegrp());
		fill(eg.getInputgrpname(), "AAA");
		buttonClick(eg.getNewemployeesave());
		Thread.sleep(4000);
		BaseClass.TakeScreenshot("newemployeesave");
	}

}
