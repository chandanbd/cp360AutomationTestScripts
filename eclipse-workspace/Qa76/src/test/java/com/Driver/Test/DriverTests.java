package com.Driver.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Com.Qa.Drivers.ApplicationTestDrivers;
import Com.Qa.Drivers.Drivers;
import Com.Qa.Drivers.DriversTypes;
import assertion.Tests.TestAssertions;
import aut.PageObjectModel.ApplicationHrms;
import aut.PageObjectModel.LoginPage;

public class DriverTests {

	private int value;
	private ApplicationHrms applicationHrms;
	private TestAssertions testAssertions;
	
	public DriverTests() {
		this.value=10;
		applicationHrms=new ApplicationHrms();
		testAssertions=new TestAssertions();
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		applicationHrms.Launch();
	}

	@After
	public void tearDown() throws Exception {
		applicationHrms.Close();
		applicationHrms.Quit();
	}

	@Test
	public void test_Plane_Driver() {
		
		Drivers drivers=new ApplicationTestDrivers();
		drivers.SetUpDriver(DriversTypes.Edge);
		WebDriver driver=drivers.GetDriver(DriversTypes.Edge);
		driver.get("https://test.o2ohrms.com/app/settings/access-levels/edit");
		driver.close();
		driver.quit();
	}
	@Test
	public void test_Login_Application() throws InterruptedException {
		
		applicationHrms.GetLoginPage().Login("chandan55bd@gmail.com", "Test@123");
		
	}
	@Test
	public void test_Loginbutton_exist() throws InterruptedException {
		
		LoginPage loginPage=applicationHrms.GetLoginPage();
		boolean isButtonExist=loginPage.IsLoginButtonExist();
		//boolean isButtonExist=applicationHrms.GetLoginPage().IsLoginButtonExist();
		// String ExpectedName="hello";
		// String ActualValue=x.gettext();
		// boolean nameMatching=ExpectedName==ActualValue;
		testAssertions.IsTrue(isButtonExist, "Login button does not exist hence faield");

	}

}
