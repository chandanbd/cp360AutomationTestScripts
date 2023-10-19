package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPomClass extends BaseClass {
	
	
	public AlertPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") // xpath and should make it private
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Alerts')]") // xpath and should make it private
	private WebElement alerts;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Alert']") // xpath and should make it private
	private WebElement addalert;
	
	@CacheLookup 
	@FindBy(xpath="//li[normalize-space()='Birthdays']") // xpath and should make it private
	private WebElement birthdays;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='alertName']") // xpath and should make it private
	private WebElement inputalertname;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Next']") // xpath and should make it private
	private WebElement alertnext;
	
	
	@CacheLookup 
	@FindBy(xpath="(//input[@aria-label='secondary checkbox'])[1]") // xpath and should make it private
	private WebElement fulladminuser;
	
	
	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[1]") // xpath and should make it private
	private WebElement timedropdown;
	
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[2]") // xpath and should make it private
	private WebElement timezonedropdown;
	
	@CacheLookup 
	@FindBy(xpath="//input[@type='number']") // xpath and should make it private
	private WebElement reminder;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[4]") // xpath and should make it private
	private WebElement reminderdrpdwn1;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[5]") // xpath and should make it private
	private WebElement reminderdrpdwn2;
	
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='All Employees']") // xpath and should make it private
	private WebElement allemployees;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='Only Some Employees']") // xpath and should make it private
	private WebElement onlysomeemployees;
	
	@CacheLookup 
	@FindBy(xpath="//div[normalize-space()='Employee Status (14)']//div") // xpath and should make it private
	private WebElement employmentstatus;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='Full time']") // xpath and should make it private
	private WebElement fulltime;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Save']") // xpath and should make it private
	private WebElement save;
	

	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Next']") // xpath and should make it private
	private WebElement next;
	
	@CacheLookup 
	@FindBy(xpath="//li[text()='New Hire']") // xpath and should make it private
	private WebElement newhirealert;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='alertName']") // xpath and should make it private
	private WebElement nwhireinputalname;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Next']") // xpath and should make it private
	private WebElement nwhireinptnext;
	
	@CacheLookup 
	@FindBy(xpath="(//input[@type='checkbox'])[1]") // xpath and should make it private
	private WebElement nwhirefulladmin;
	
	@CacheLookup 
	@FindBy(xpath="(//input[@type='checkbox'])[2]") // xpath and should make it private
	private WebElement nwhiremanager;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") // xpath and should make it private
	private WebElement nwhirenxt;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='subject']") // xpath and should make it private
	private WebElement nwhiresubject;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Preview']") // xpath and should make it private
	private WebElement nwhirepreview;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // xpath and should make it private
	private WebElement nwhiresubmit;
	
	
	
	
	
	
	public WebElement getNewhirealert() {
		return newhirealert;
	}

	public WebElement getNwhireinputalname() {
		return nwhireinputalname;
	}

	public WebElement getNwhireinptnext() {
		return nwhireinptnext;
	}

	public WebElement getNwhirefulladmin() {
		return nwhirefulladmin;
	}

	
	public WebElement getNwhiremanager() {
		return nwhiremanager;
	}

	public WebElement getNwhirenxt() {
		return nwhirenxt;
	}

	public WebElement getNwhiresubject() {
		return nwhiresubject;
	}

	public WebElement getNwhirepreview() {
		return nwhirepreview;
	}

	public WebElement getNwhiresubmit() {
		return nwhiresubmit;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getNext() {
		return next;
	}

	@CacheLookup 
	@FindBy(xpath="//input[@name='subject']") // xpath and should make it private
	private WebElement subjectinput;
	
	@CacheLookup 
	@FindBy(xpath="//div[@data-gramm='false']//p") // xpath and should make it private
	private WebElement messageinput;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Preview']") // xpath and should make it private
	private WebElement preview;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Close']") // xpath and should make it private
	private WebElement close;
	
	//button[normalize-space()='Close']
	
	public WebElement getClose() {
		return close;
	}

	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // xpath and should make it private
	private WebElement finalsubmit;

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getAlerts() {
		return alerts;
	}

	public WebElement getAddalert() {
		return addalert;
	}

	public WebElement getBirthdays() {
		return birthdays;
	}

	public WebElement getInputalertname() {
		return inputalertname;
	}

	public WebElement getAlertnext() {
		return alertnext;
	}

	public WebElement getFulladminuser() {
		return fulladminuser;
	}

	public WebElement getTimedropdown() {
		return timedropdown;
	}

	public WebElement getTimezonedropdown() {
		return timezonedropdown;
	}

	public WebElement getReminder() {
		return reminder;
	}

	public WebElement getReminderdrpdwn1() {
		return reminderdrpdwn1;
	}

	public WebElement getReminderdrpdwn2() {
		return reminderdrpdwn2;
	}

	public WebElement getAllemployees() {
		return allemployees;
	}

	public WebElement getOnlysomeemployees() {
		return onlysomeemployees;
	}

	public WebElement getEmploymentstatus() {
		return employmentstatus;
	}

	public WebElement getFulltime() {
		return fulltime;
	}

	

	public WebElement getSubjectinput() {
		return subjectinput;
	}

	public WebElement getMessageinput() {
		return messageinput;
	}

	public WebElement getPreview() {
		return preview;
	}

	public WebElement getFinalsubmit() {
		return finalsubmit;
	}
	
	
	
	//button[normalize-space()='Next']
	
	

}
