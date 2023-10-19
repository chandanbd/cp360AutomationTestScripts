package org.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPomClass extends BaseClass{

	public  ReportsPomClass()
	{
		PageFactory.initElements(driver, this);  

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Reports']") 
	private WebElement reports;

	@CacheLookup 
	@FindBy(xpath="//p[text()='Employee Birthday Report']") 
	private WebElement bdayreport;

	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Choose date']") 
	private WebElement selctbdaymonth;

	@CacheLookup 
	@FindBy(xpath="//button[text()='Aug']") 
	private WebElement selctaug;

	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement bdaydrpdwn;

	@CacheLookup 
	@FindBy(xpath="//button[text()='Apply']") 
	private WebElement bdayapply;

	@CacheLookup 
	@FindBy(xpath="//button[text()='Download File']") 
	private WebElement bdaydwnldfile;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='CSV']") 
	private WebElement bdaycsv;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='XLS']") 
	private WebElement bdayxls;
	
	public WebElement getBdaycsv() {
		return bdaycsv;
	}

	public WebElement getBdayxls() {
		return bdayxls;
	}

	@CacheLookup 
	@FindBy(xpath="(//div[@role='button'])[1]") // drpdwn
	private WebElement bdaydrpdwn1;
	
	@CacheLookup 
	@FindBy(xpath="//li[7]//span[1]//input[1]") 
	private WebElement slctbdaychckbox;
	
	@CacheLookup 
	@FindBy(xpath="(//div[@aria-expanded='false'])[2]") 
	private WebElement slctagaindrpdwn1;
    
	
	@CacheLookup 
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/header/div/div/div[2]/div[1]/div/div/input") 
	private WebElement searchtextbox;

	

	public WebElement getSlctagaindrpdwn1() {
		return slctagaindrpdwn1;
	}

	public WebElement getBdaydrpdwn1() {
		return bdaydrpdwn1;
	}

	public WebElement getSlctbdaychckbox() {
		return slctbdaychckbox;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getBdayreport() {
		return bdayreport;
	}

	public WebElement getSelctbdaymonth() {
		return selctbdaymonth;
	}

	public WebElement getSelctaug() {
		return selctaug;
	}

	public WebElement getBdaydrpdwn() {
		return bdaydrpdwn;
	}

	public WebElement getBdayapply() {
		return bdayapply;
	}

	public WebElement getBdaydwnldfile() {
		return bdaydwnldfile;
	}

	
	public WebElement getsearchtextbox() {
		return searchtextbox;
	}
	/*public void searchtextbox() throws InterruptedException
	{
		
		Thread.sleep(5000);
		searchtextbox.sendKeys("a");
		
		Thread.sleep(5000);
		
		searchtextbox.clear();
	}*/
	
	
	
	
	public  void doubleClick() throws InterruptedException
	{
		Thread.sleep(5000);
		//a.doubleClick(element).perform();
		//Actions act = new Actions(driver);
		//act.doubleClick(element).build().perform();
		//Instantiating Actions class
		Actions act = new Actions(driver);

		 

		//Locate WebElement to perform double click 
		WebElement btnElement = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/header/div/div/div[2]/div[1]/div/div/input"));

		 

		//Double Click the button
		act.doubleClick(btnElement).perform();
	}

}
