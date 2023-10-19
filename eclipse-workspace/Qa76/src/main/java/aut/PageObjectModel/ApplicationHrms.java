package aut.PageObjectModel;

import org.openqa.selenium.WebDriver;

import Com.Qa.Drivers.ApplicationTestDrivers;
import Com.Qa.Drivers.Drivers;
import Com.Qa.Drivers.DriversTypes;

public class ApplicationHrms {
	
	private WebDriver webdriver;
	private Drivers drivers;
	final String Url="https://test.o2ohrms.com/app/settings/access-levels/edit";
	public ApplicationHrms() {
		this.drivers=new ApplicationTestDrivers();
		InitializeSetup(drivers);
	}

	private void InitializeSetup(Drivers drivers) {
		this.drivers.SetUpDriver(DriversTypes.Chrome);
		this.webdriver=drivers.GetDriver(DriversTypes.Chrome);
	}
	
	public void Launch() {
		this.webdriver.get(Url);
	}
	
	public void Close() {
		this.webdriver.close();
	}
	public void Quit() {
		this.webdriver.quit();
	}
	public LoginPage GetLoginPage() {
		return new LoginPage(this.webdriver);
	}
}
