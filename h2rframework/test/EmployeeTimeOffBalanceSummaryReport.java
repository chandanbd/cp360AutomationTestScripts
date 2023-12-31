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

public class EmployeeTimeOffBalanceSummaryReport {

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
	
	
	@FindBy(xpath="//p[text()='Employee Time Off Balance Summary']") 
	private WebElement empltimeoffbalsummary;
	
	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement empltimeoffbalsummarydrpdwn1;
	
	@FindBy(xpath="(//div[@role='button'])[1]") 
	private WebElement empltimeoffbalsummarydrpdwn2;
	
	@FindBy(xpath="//li[6]//span[1]//input[1]") 
	private WebElement slctchckbox;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/header/div/div/div[2]/div[1]/div/div/input") 
	private WebElement searchtextbox;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]") 
	private WebElement empltimeoffbalsummarydrpdwn3;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]") 
	private WebElement empltimeoffbalsummarydrpdwn4;
	
	@FindBy(xpath="(//div[@role='button'])[2]") 
	private WebElement empltimeoffbalsummarydrpdwn5;
	
	@FindBy(xpath="//li[4]//span[1]//input[1]") 
	private WebElement slctcountrychckbox;
	
	
	@FindBy(xpath="//button[text()='Apply']") 
	private WebElement emplytimeoffapply;
	
	@FindBy(xpath="//button[text()='Download CSV file']") 
	private WebElement emplytimeoffdwnldcsvfile;
	
	
	
	
	
	
	
	
	
	
	
	

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
	public void EmployeeTimeOffBalanceSummaryReport() throws InterruptedException, AWTException
	{
		reports.click();
		Thread.sleep(3000);
		empltimeoffbalsummary.click();
		Thread.sleep(3000);
		empltimeoffbalsummarydrpdwn1.click();
		Thread.sleep(3000);
		
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN); 
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_ENTER); 
		
		Thread.sleep(3000);
		empltimeoffbalsummarydrpdwn2.click();
		Thread.sleep(3000);
		slctchckbox.click();
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
        act.doubleClick(searchtextbox).perform();
        
        Thread.sleep(3000);
        empltimeoffbalsummarydrpdwn3.click();
        Thread.sleep(3000);
        empltimeoffbalsummarydrpdwn4.click();
        
        robot.keyPress(KeyEvent.VK_DOWN); 
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN); 
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN); 
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(3000);
		empltimeoffbalsummarydrpdwn5.click();
		Thread.sleep(3000);
		slctcountrychckbox.click();
		Thread.sleep(3000);
		Actions act1 = new Actions(driver);
        act.doubleClick(searchtextbox).perform();
        Thread.sleep(3000);
		emplytimeoffapply.click();
        Thread.sleep(3000);
        emplytimeoffdwnldcsvfile.click();
       
        
	}

}
