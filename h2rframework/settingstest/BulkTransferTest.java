package org.settingstest;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.pomclass.LoginPomClass;
import org.settingspomclass.BulkTransferPomClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BulkTransferTest extends BaseClass{
	
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
	public void bulktransfer() throws InterruptedException, AWTException, IOException
	{
		BulkTransferPomClass bt = new BulkTransferPomClass();
		buttonClick(bt.getSettings());
		buttonClick(bt.getBulktransfer());
		fill(bt.getSearchemployee(), "dfff");
		Thread.sleep(3000);
		buttonClick(bt.getCheckbox());
		buttonClick(bt.getTransferemployees());
		Thread.sleep(3000);
		buttonClick(bt.getSelectcalendar());
		Thread.sleep(2000);
		buttonClick(bt.getSelectdate());
		toperformkeydown(bt.getTransferBy(), 6); // can change here
		toperformenter();
		Thread.sleep(2000);
		toperformkeydown(bt.getTransferTo(), 9); // can change here too
		toperformenter();
		buttonClick(bt.getTransfersave());
		Thread.sleep(3000);
		buttonClick(bt.getYestransfer());
		Thread.sleep(3000);
		BaseClass.TakeScreenshot("yestransfer");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
