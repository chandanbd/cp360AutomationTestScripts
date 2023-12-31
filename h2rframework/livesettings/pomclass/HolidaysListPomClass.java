package org.livesettings.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HolidaysListPomClass extends BaseClass{
	
	public HolidaysListPomClass()
	{
		PageFactory.initElements(driver, this);  

	}
	

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Holidays']") 
	private WebElement holidays;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Holiday List']") 
	private WebElement addholidayslist;
	
	@CacheLookup 
	@FindBy(xpath="(//label[text()='Holiday List Name']/following::input)[1]") 
	private WebElement holidayinput;
	
	@CacheLookup 
	@FindBy(xpath="//button[@title='Open']") 
	private WebElement locationdrpdwn;  
	
	public WebElement getLocationinput() {
		return locationinput;
	}


	@CacheLookup 
	@FindBy(xpath=" (//label[text()='Location']/following::input)[1]") 
	private WebElement locationinput;
			
	@CacheLookup 
	@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//button[1]") 
	private WebElement fromdate;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Oct 20, 2023']") 
	private WebElement selectfromdate;
	
	@CacheLookup 
	@FindBy(xpath="//div[4]//div[1]//div[1]//div[1]//button[1]") 
	private WebElement todate;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Oct 31, 2023']") 
	private WebElement selecttodate;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Choose date'])[3]") 
	private WebElement date;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Oct 27, 2023']") 
	private WebElement selectdate;
	
	@CacheLookup 
	@FindBy(xpath="(//label[text()='To Date']/following::input)[3]") 
	private WebElement description;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Row']") 
	private WebElement addrow1;

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getHolidays() {
		return holidays;
	}

	public WebElement getAddholidayslist() {
		return addholidayslist;
	}

	public WebElement getHolidayinput() {
		return holidayinput;
	}

	public WebElement getLocationdrpdwn() {
		return locationdrpdwn;
	}

	public WebElement getFromdate() {
		return fromdate;
	}

	public WebElement getSelectfromdate() {
		return selectfromdate;
	}

	public WebElement getTodate() {
		return todate;
	}

	public WebElement getSelecttodate() {
		return selecttodate;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSelectdate() {
		return selectdate;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getAddrow1() {
		return addrow1;
	}
	
	

	

}
