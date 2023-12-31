package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClass;
import org.baseclass.Screenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pomclass.LoginPomClass;
import org.pomclass.ReportsPomClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BirthdayReportsTest 
{

	public WebDriver driver;
	public WebDriverWait wait;
	public static Actions a;
	public static Robot r;
	//public WebDriverWait wait;

	@FindBy(xpath="//input[@name='email']")
	private WebElement username;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;


	@FindBy(xpath="//div[text()='Reports']") 
	private WebElement reports;


	@FindBy(xpath="//p[text()='Employee Birthday Report']") 
	private WebElement bdayreport;


	@FindBy(xpath="//button[@aria-label='Choose date']") 
	private WebElement selctbdaymonth;


	@FindBy(xpath="//button[text()='Aug']") 
	private WebElement selctaug;


	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement bdaydrpdwn;


	@FindBy(xpath="//button[text()='Apply']") 
	private WebElement bdayapply;


	@FindBy(xpath="//button[text()='Download File']") 
	private WebElement bdaydwnldfile;


	@FindBy(xpath="//span[text()='CSV']") 
	private WebElement bdaycsv;


	@FindBy(xpath="//span[text()='XLS']") 
	private WebElement bdayxls;

	@FindBy(xpath="(//div[@role='button'])[1]") // drpdwn
	private WebElement bdaydrpdwn1;

	@CacheLookup 
	@FindBy(xpath="//li[7]//span[1]//input[1]") 
	private WebElement slctbdaychckbox;

	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Accounts')]") 
	private WebElement slctagaindrpdwn1;

	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/header/div/div/div[2]/div[1]/div/div/input") 
	private WebElement searchtextbox;



	@BeforeTest(enabled = true)
	public void openBrowser() {


		// open Browser and enter Url
		WebDriverManager.firefoxdriver().setup();
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
	public void Birthdayreports() throws InterruptedException, AWTException
	{
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//Thread.sleep(5000);
		//wait.until(ExpectedConditions.visibilityOf(settings));
		//settings.click();

		reports.click();
		bdayreport.click();
		selctbdaymonth.click();
		selctaug.click();
		Thread.sleep(3000);
		bdaydrpdwn.click();
		Robot robot = new Robot();


		robot.keyPress(KeyEvent.VK_DOWN); // Navigate down to select the desired option
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_ENTER); // Press Enter to select the option

		Thread.sleep(3000);

		bdaydrpdwn1.click();
		Thread.sleep(3000);
		slctbdaychckbox.click();
		Thread.sleep(3000);


		//doubleClick();

		/*ReportsPomClass rp = new ReportsPomClass();
		rp.doubleClick();*/

		Actions act = new Actions(driver);

		//doubleClick(searchtextbox);
		act.doubleClick(searchtextbox).perform();

		Thread.sleep(3000);

		bdayapply.click();
		Thread.sleep(3000);
		bdaydwnldfile.click();
		Thread.sleep(3000);
		bdaycsv.click();
		
		

	}
	
	



}


