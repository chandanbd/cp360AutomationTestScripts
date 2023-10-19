package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomReport {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public static Actions a;
	public static Robot r;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;


	@FindBy(xpath="//div[text()='Reports']") 
	private WebElement reports;
	
	@FindBy(xpath="//button[text()='Create Report']") 
	private WebElement createreport;
	
	@FindBy(xpath="(//label[text()='Report Name']/following::input)[1]") 
	private WebElement createinput;
	
	@FindBy(xpath="//p[text()='Personal']") 
	private WebElement personal;
	
	@FindBy(xpath="//p[text()='First Name']") 
	private WebElement fnm;
	
	@FindBy(xpath="//p[text()='Work Email']") 
	private WebElement wrkmail;
	
	@FindBy(xpath="//p[text()='Job']") 
	private WebElement job;
	
	@FindBy(xpath="//p[text()='Job Location']") 
	private WebElement jblcnt;
	
	@FindBy(xpath="//p[text()='Job Division']") 
	private WebElement jbdivisn;
	
	@FindBy(xpath="//p[text()='Time Off']") 
	private WebElement timeoff;
	
	@FindBy(xpath="//p[text()='Time Off Policy']") 
	private WebElement top;
	
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement save;
	
	
	
	
	
	
	@BeforeTest(enabled = true)
	public void openBrowser() 
	{

		WebDriverManager.firefoxdriver().setup();  // open Browser and enter Url 
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://h2rdv.cp360apps.com/app");
		PageFactory.initElements(driver, this);

	}

	@Test(enabled = true, priority = 0)
	public void login()
	{


		username.sendKeys("admin@o2ohrms.com");

		password.sendKeys("Super@dmin@1234");

		login.click();

	}
	
	@Test(enabled = true, priority = 1)
	public void EmployeeTurnoverReport() throws InterruptedException, AWTException
	{
		reports.click();
		Thread.sleep(3000);
		createreport.click();
		Thread.sleep(3000);
		createinput.sendKeys("chandanreport1");
		Thread.sleep(3000);
		personal.click();
		Thread.sleep(3000);
		fnm.click();
		Thread.sleep(3000);
		wrkmail.click();
		Thread.sleep(3000);
		job.click();
		Thread.sleep(3000);
		jblcnt.click();
		Thread.sleep(3000);
		jbdivisn.click();
		Thread.sleep(3000);
		timeoff.click();
		Thread.sleep(3000);
		top.click();
		Thread.sleep(3000);
		save.click();
		Thread.sleep(3000);
	
	}
	
	
	

}
