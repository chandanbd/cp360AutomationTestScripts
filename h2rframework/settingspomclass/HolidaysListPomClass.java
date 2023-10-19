package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HolidaysListPomClass extends BaseClass {

	public HolidaysListPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") // xpath and should make it private
	private WebElement settings;

	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Holidays')]") // xpath and should make it private
	private WebElement holidays;

	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Holiday List']") // xpath and should make it private
	private WebElement addholidayslist;

	@CacheLookup 
	@FindBy(xpath="//input[@name='name']") // xpath and should make it private
	private WebElement inputholidaylistname;

	@CacheLookup 
	@FindBy(xpath="//button[@title='Open']") // xpath and should make it private
	private WebElement locationdropdown;

	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Choose date'])[1]") // xpath and should make it private
	private WebElement fromdate;

	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Aug 16, 2023']") // xpath and should make it private
	private WebElement selectfromdate;



	@CacheLookup 
	@FindBy(xpath="//div[4]//div[1]//div[1]//div[1]//button[1]") // xpath and should make it private
	private WebElement todate;


	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Aug 17, 2023']") // xpath and should make it private
	private WebElement selecttodate;
	
	@CacheLookup 
	@FindBy(xpath="//*[text()='Save']") // xpath and should make it private
	private WebElement saveholiday;
	
	@CacheLookup 
	@FindBy(xpath="//th[@scope='row']//div//div//div//input[@type='text']") // xpath and should make it private
	private WebElement description1;
	
	@CacheLookup 
	@FindBy(xpath="(//input[@type='text'])[5]") // xpath and should make it private
	private WebElement description2;
	
	
	
	
	public WebElement getDescription1() {
		return description1;
	}



	public WebElement getDescription2() {
		return description2;
	}

	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Choose date'])[1]") // xpath and should make it private
	private WebElement choosedate1;

	
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Aug 16, 2023']") // xpath and should make it private
	private WebElement selectfromdatedown;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Row']") // xpath and should make it private
	private WebElement addrow;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Choose date'])[1]") // xpath and should make it private
	private WebElement choosedate2;

	
	public WebElement getSaveholiday() {
		return saveholiday;
	}



	public WebElement getChoosedate1() {
		return choosedate1;
	}



	public WebElement getSelectfromdatedown() {
		return selectfromdatedown;
	}



	public WebElement getAddrow() {
		return addrow;
	}



	public WebElement getChoosedate2() {
		return choosedate2;
	}



	public WebElement getSelecttodatedown() {
		return selecttodatedown;
	}

	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Aug 17, 2023']") // xpath and should make it private
	private WebElement selecttodatedown;
	




	//button[normalize-space()='Save']

	public WebElement getHolidays() {
		return holidays;
	}



	public WebElement getAddholidayslist() {
		return addholidayslist;
	}





	public WebElement getInputholidaylistname() {
		return inputholidaylistname;
	}




	public WebElement getLocationdropdown() {
		return locationdropdown;
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



	public WebElement getSettings() {
		return settings;
	}

}
