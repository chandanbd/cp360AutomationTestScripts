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

public class EmployeeTurnoverReport {
	
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
	
	@FindBy(xpath="//p[text()='Employee Turnover Report']") 
	private WebElement empturnoverreport;
	
	@FindBy(xpath="(//button[@aria-label='Choose date'])[1]") 
	private WebElement startmonth;
	
	@FindBy(xpath="//button[@aria-label='Aug 1, 2023']") 
	private WebElement selectstrtdate;
	
	@FindBy(xpath="(//div[contains(@class,'MuiInputAdornment-root MuiInputAdornment-positionEnd')]//button)[2]") 
	private WebElement endmonth;
	
	@FindBy(xpath="//button[@aria-label='Aug 31, 2023']") 
	private WebElement selectenddate;
	
	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement drpdwn1;
	
	@FindBy(xpath="(//div[@role='button'])[1]") 
	private WebElement drpdwn2;
	
	@FindBy(xpath="//body[1]/div[2]/div[3]/ul[1]/li[14]/span[1]/input[1]") 
	private WebElement chckbox1;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/header/div/div/div[2]/div[1]/div/div/input") 
	private WebElement searchtextbox;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[5]/button[1]/*[name()='svg'][1]") 
	private WebElement plusbutton;
	
	@FindBy(xpath="//button[@title='Open']") 
	private WebElement drpdwn3;
	
	@FindBy(xpath="(//div[@role='button'])[2]") 
	private WebElement drpdwn4;
	
	@FindBy(xpath="//body[1]/div[2]/div[3]/ul[1]/li[5]/span[1]/input[1]") 
	private WebElement chckbox2;
	
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
	public void EmployeeTurnoverReport() throws InterruptedException, AWTException
	{
		reports.click();
		Thread.sleep(3000);
		empturnoverreport.click();
		Thread.sleep(3000);
		startmonth.click();
		Thread.sleep(3000);
		selectstrtdate.click();
		Thread.sleep(3000);
		endmonth.click();
		Thread.sleep(3000);
		selectenddate.click();
		Thread.sleep(3000);
		drpdwn1.click();
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
		drpdwn2.click();
		Thread.sleep(5000);
		
		chckbox1.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
        act.doubleClick(searchtextbox).perform();
		Thread.sleep(3000);
		plusbutton.click();
		
		Thread.sleep(3000);
		drpdwn3.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN); 
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN); 
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		drpdwn4.click();
		Thread.sleep(3000);
		chckbox2.click();
		Thread.sleep(3000);
		Actions act1 = new Actions(driver);
        act1.doubleClick(searchtextbox).perform();
		Thread.sleep(3000);
		empapply.click();
		Thread.sleep(3000);
		empdwnldfile.click();
		Thread.sleep(3000);
		empcsv.click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
