package org.test;

import org.baseclass.BaseClass;
import org.pomclass.HomePomClass;
import org.pomclass.LoginPomClass;
import org.testng.annotations.Test;

public class HomeTest extends BaseClass {
	
	
	@Test(enabled=true)
	public void managingWidgets() 
	{
		
        
		launchBrowsergoogle();
		maxBrowser();
		loadUrl("https://h2rdv.cp360apps.com/app");
		implictyWait();
		LoginPomClass po = new LoginPomClass(); 
		HomePomClass ho = new HomePomClass();
		fill(po.getEmail(), "admin@o2ohrms.com");
		fill(po.getPasswrd(), "Super@dmin@1234");
		buttonClick(po.getCheckbox());
		buttonClick(po.getSubmit());
		buttonClick(ho.getMwdg());
        buttonClick(ho.getAncmnts());
        buttonClick(ho.getVwlnks()); 
		buttonClick(ho.getSave());
		


	}
	//@Test(enabled=false, priority=1)
	public void newteammembers()
	{
		launchBrowsergoogle();
		maxBrowser();
		loadUrl("https://h2rdv.cp360apps.com/app");
		implictyWait();
		LoginPomClass po = new LoginPomClass();
		HomePomClass ho = new HomePomClass();
		fill(po.getEmail(), "admin@o2ohrms.com");
		fill(po.getPasswrd(), "Super@dmin@1234");
		buttonClick(po.getCheckbox());
		buttonClick(po.getSubmit());
		buttonClick(ho.getNewtm());
		buttonClick(ho.getClose());
		
		
	}
	
	
	
	
	
	
	
	
	

}
