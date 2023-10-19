package org.accesslevels.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomaccesslevelOnlySomeEmployees {
	
	//public WebDriver driver;
	public static RemoteWebDriver driver;
	public WebDriverWait wait;
	public static Actions a;
	public static Robot r;
	
	
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	
	
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	

	
	@FindBy(xpath="//div[text()='All Access Levels']") 
	private WebElement allaccesslevel;
	
	
	@FindBy(xpath="//h6[text()='Custom Access Level']") 
	private WebElement clickcustomaccesslevel;
	
	
	@FindBy(xpath="//h6[text()='CustomAutomation']") 
	private WebElement selectcustomautomation;
	
	
	@FindBy(xpath="//button[text()='Access Level Settings']") 
	private WebElement addaccesslevelsettings;
	
	 
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement accesslvlsettingsnext;
	
	
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement customnxt2;
	
	
	@FindBy(xpath="(//button[@aria-label='Open'])[2]") 
	private WebElement maindrpdwn;
	
	
	@FindBy(xpath="(//div[contains(@class,'MuiSelect-select MuiSelect-outlined')])[1]") 
	private WebElement deptdrpdwn;
	
	@FindBy(xpath="(//li[@data-value='57']//span)[1]") 
	private WebElement selectdept;
	
	 
	@FindBy(xpath="(//div[@role='button'])[2]") 
	private WebElement divisiondrpdwn;
	
	@FindBy(xpath="(//li[@data-value='24']//span)[1]") 
	private WebElement selectdivision;
	
	 
	@FindBy(xpath="(//div[@role='button'])[3]") 
	private WebElement emplystatusdrpdwn;
	
	@FindBy(xpath="(//li[@data-value='23']//span)[1]") 
	private WebElement selectemplystatus;
	
	 
	@FindBy(xpath="(//div[@role='button'])[4]") 
	private WebElement jobtitledrpdwn;
	
	@FindBy(xpath="(//li[@data-value='59']//span)[1]") 
	private WebElement selectjobtitle;
	
	 
	@FindBy(xpath="(//div[@role='button'])[5]") 
	private WebElement locationdrpdwn;
	
	@FindBy(xpath="(//label[text()='Location']/following::input)[3]") 
	private WebElement selectlocation;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/header/div/div/div[2]/div[1]/div/div/input") 
	private WebElement searchtextbox;
	
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement submit;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Custom Report']") 
	private WebElement customreport;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Standard Reports']") 
	private WebElement standardreport;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Employee Report']") 
	private WebElement employeereport;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Employee Turnover Report']") 
	private WebElement employeeturnoverreport;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Employee Birthday Report']") 
	private WebElement employeebirthdayreport;
	
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Job History Report']") 
	private WebElement jobhistoryreport;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Announcements']") 
	private WebElement viewannouncements;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Employees Geography']") 
	private WebElement viewemployeesgeography;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Holiday List']") 
	private WebElement viewholidaylist;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Celebrations']") 
	private WebElement viewcelebrations;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Employment Status Graph']") 
	private WebElement viewemploymentstatusgraph;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Job Location Graph']") 
	private WebElement viewjoblocationgraph;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Total Counts']") 
	private WebElement viewtotalcounts;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Department Graph']") 
	private WebElement viewdepartment;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Gender Graph']") 
	private WebElement viewgendergraph;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Links']") 
	private WebElement viewlinks;

	
	
	

	@BeforeTest(enabled = true)
	public void openBrowser() 
	{

		WebDriverManager.firefoxdriver().setup();  
		driver = new FirefoxDriver();
		//WebDriverManager.edgedriver().setup();  
		//driver = new EdgeDriver();
		
		//driver.manage().window().maximize();
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
	public void onlysomeemployees() throws InterruptedException, AWTException
	{
		
		settings.click();
		Thread.sleep(3000);
		allaccesslevel.click();
		Thread.sleep(3000);
		clickcustomaccesslevel.click();
		Thread.sleep(3000);
		selectcustomautomation.click();
		Thread.sleep(3000);
		addaccesslevelsettings.click();
		Thread.sleep(3000);
		customnxt2.click();
		Thread.sleep(3000);
		customreport.click();
		Thread.sleep(3000);
		employeereport.click();
		Thread.sleep(3000);
		employeeturnoverreport.click();
		Thread.sleep(3000);
		employeebirthdayreport.click();
		Thread.sleep(3000);
		jobhistoryreport.click();
		Thread.sleep(3000);
		customnxt2.click();
		Thread.sleep(3000);
		viewannouncements.click();
		Thread.sleep(3000);
		viewemployeesgeography.click();
		Thread.sleep(3000);
		viewholidaylist.click();
		Thread.sleep(3000);
		viewcelebrations.click();
		Thread.sleep(3000);
		viewemploymentstatusgraph.click();
		Thread.sleep(3000);
		viewjoblocationgraph.click();
		Thread.sleep(3000);
		viewtotalcounts.click();
		Thread.sleep(3000);
		maindrpdwn.click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN); 
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN); 
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		deptdrpdwn.click();
		Thread.sleep(3000);
		selectdept.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
        act.doubleClick(searchtextbox).perform();
		Thread.sleep(3000);
		divisiondrpdwn.click();
		Thread.sleep(3000);
		selectdivision.click();
		Thread.sleep(3000);
		Actions act2 = new Actions(driver);
        act.doubleClick(searchtextbox).perform();
		Thread.sleep(3000);
		emplystatusdrpdwn.click();
		Thread.sleep(3000);
		selectemplystatus.click();
		Thread.sleep(3000);
		Actions act3 = new Actions(driver);
        act.doubleClick(searchtextbox).perform();
        Thread.sleep(3000);
        jobtitledrpdwn.click();
        Thread.sleep(3000);
        selectjobtitle.click();
        Thread.sleep(3000);
        Actions act4 = new Actions(driver);
        act.doubleClick(searchtextbox).perform();
        Thread.sleep(3000);
        locationdrpdwn.click();
        Thread.sleep(3000);
        selectlocation.click();
        Thread.sleep(3000);
        Actions act5 = new Actions(driver);
        act.doubleClick(searchtextbox).perform();
        Thread.sleep(3000);
        submit.click();
        driver.navigate().back();
        //Thread.sleep(3000);
        
        
        
		
		
		
		
		
		
	}
	

}
