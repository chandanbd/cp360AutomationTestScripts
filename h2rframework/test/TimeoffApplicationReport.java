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

public class TimeoffApplicationReport {

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

	@FindBy(xpath="//p[text()='Time Off Application Report']") 
	private WebElement timeoffreport;

	@FindBy(xpath="(//button[@aria-label='Choose date'])[1]") 
	private WebElement startdate;

	@FindBy(xpath="//button[@aria-label='Aug 23, 2023']") 
	private WebElement slctstartdate;

	@FindBy(xpath="(//div[contains(@class,'MuiInputAdornment-root MuiInputAdornment-positionEnd')]//button)[2]") 
	private WebElement enddate;

	@FindBy(xpath="//button[@aria-label='Aug 23, 2023']") 
	private WebElement slctstenddate;

	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement timeoffdrpdwn;
	
	@FindBy(xpath="(//div[@role='button'])[1]") 
	private WebElement timeoffdrpdwn1;
	
	@FindBy(xpath="//body[1]/div[2]/div[3]/ul[1]/li[6]/span[1]/input[1]") 
	private WebElement slctchckbox;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/header/div/div/div[2]/div[1]/div/div/input") 
	private WebElement searchtextbox;
	
	@FindBy(xpath="//button[text()='Apply']") 
	private WebElement timeoffapply;
	
	@FindBy(xpath="//button[text()='Download File']") 
	private WebElement timeoffdwnldfile;
	
	@FindBy(xpath="//span[text()='CSV']") 
	private WebElement timeoffcsv;
	
	@FindBy(xpath="//span[text()='XLS']") 
	private WebElement timeoffxls;




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
	public void Timeoffapplicationreport() throws InterruptedException, AWTException
	{
		reports.click();
		timeoffreport.click();
		startdate.click();
		Thread.sleep(3000);
		slctstartdate.click();
		Thread.sleep(3000);
		enddate.click();
		Thread.sleep(3000);
		slctstenddate.click();
		Thread.sleep(3000);
		timeoffdrpdwn.click();

		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN); // Navigate down to select the desired option
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_ENTER); // Press Enter to select the option
		
		Thread.sleep(3000);
		timeoffdrpdwn1.click();
		Thread.sleep(3000);
		slctchckbox.click();
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
        act.doubleClick(searchtextbox).perform();
        
        Thread.sleep(3000);
        timeoffapply.click();
        Thread.sleep(3000);
        timeoffdwnldfile.click();
        Thread.sleep(3000);
        timeoffcsv.click();
        
        
		
		
		
		
		
		






	}

}
