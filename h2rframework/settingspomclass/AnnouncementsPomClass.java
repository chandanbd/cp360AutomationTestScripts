package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnnouncementsPomClass extends BaseClass{
	
	public AnnouncementsPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Announcements')]") 
	private WebElement announcements;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Announcement']") 
	private WebElement addannouncement;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='title']") 
	private WebElement title;
	
	@CacheLookup 
	@FindBy(xpath="//div[normalize-space()='All Employees']") 
	private WebElement announcementchoice;
	
	@CacheLookup 
	@FindBy(xpath="//li[normalize-space()='Only Some Employees']") 
	private WebElement selectingchoice;
	
	public WebElement getAnnouncementchoice() {
		return announcementchoice;
	}

	public WebElement getSelectingchoice() {
		return selectingchoice;
	}

	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[1]") 
	private WebElement jobtitle;
	
	@CacheLookup 
	@FindBy(xpath="//div[@role='presentation']//div[4]//div[1]//div[1]//div[1]//div[1]//button[1]") 
	private WebElement department;
	
	
	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[3]") 
	private WebElement country;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[4]") 
	private WebElement employgrp;
	
	@CacheLookup 
	@FindBy(xpath="//div[@data-placeholder='Write something awesome...']//p[1]") 
	private WebElement contentinput;
	
	
	
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='send_mail']") 
	private WebElement sendmail;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Post']") 
	private WebElement postancmnt;
	
	
	
	
	//div[normalize-space()='All Employees']
	
	//li[normalize-space()='Only Some Employees']
	
	
	
	
	

	public WebElement getContentinput() {
		return contentinput;
	}

	public WebElement getSendmail() {
		return sendmail;
	}

	public WebElement getPostancmnt() {
		return postancmnt;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getEmploygrp() {
		return employgrp;
	}

	public WebElement getJobtitle() {
		return jobtitle;
	}

	public WebElement getDepartment() {
		return department;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getAnnouncements() {
		return announcements;
	}

	public WebElement getAddannouncement() {
		return addannouncement;
	}

	public WebElement getTitle() {
		return title;
	}

	

}
