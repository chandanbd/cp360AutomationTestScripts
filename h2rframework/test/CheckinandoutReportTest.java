package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class CheckinandoutReportTest {
	
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
	
	@FindBy(xpath="//p[text()='Check In | Out Report']") 
	private WebElement checkinoutreport;
	
	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement drpdwn1;
	
	@FindBy(xpath="(//div[@role='button'])[1]") 
	private WebElement drpdwn2;
	
	@FindBy(xpath="//input[@placeholder='Type to search...']") 
	private WebElement searchoption;
	
	@FindBy(xpath="//input[@type='checkbox']") 
	private WebElement slctchkbox;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/header/div/div/div[2]/div[1]/div/div/input") 
	private WebElement searchtextbox;
	
	@FindBy(xpath="//button[text()='Apply']") 
	private WebElement empapply;


	@FindBy(xpath="//button[text()='Download File']") 
	private WebElement empdwnldfile;


	@FindBy(xpath="//span[text()='CSV']") 
	private WebElement empcsv;


	@FindBy(xpath="//span[text()='XLS']") 
	private WebElement empxls;
	
	
	
	
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
	public void CheckinandoutReportTest() throws InterruptedException, AWTException
	{
		reports.click();
		Thread.sleep(3000);
		checkinoutreport.click();
		Thread.sleep(3000);
		drpdwn1.click();
		Thread.sleep(3000);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN); 
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		drpdwn2.click();
		Thread.sleep(3000);
		searchoption.sendKeys("stephy");
		Thread.sleep(5000);
		slctchkbox.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
        act.doubleClick(searchtextbox).perform();
		Thread.sleep(3000);
		empapply.click();
		Thread.sleep(3000);
		empdwnldfile.click();
		Thread.sleep(3000);
		empcsv.click();
	}

}
