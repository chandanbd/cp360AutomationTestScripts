package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProficiencyLevelPomClass extends BaseClass{
	
	public  ProficiencyLevelPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Work Proficiency Level')]") 
	private WebElement workproficiencylevel;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Proficiency Level']") 
	private WebElement proficiencylevel;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[1]") 
	private WebElement deptmntdropdown;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[2]") 
	private WebElement wpl1;
	
	@CacheLookup 
	@FindBy(xpath="//input[@type='number']") 
	private WebElement todays;
	
	@CacheLookup 
	@FindBy(xpath="//input[@aria-label='secondary checkbox']") 
	private WebElement excludeweekend;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[3]") 
	private WebElement wpl2;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Schedule']") 
	private WebElement schedule;

	
	public WebElement getSettings() {
		return settings;
	}

	public WebElement getWorkproficiencylevel() {
		return workproficiencylevel;
	}

	public WebElement getProficiencylevel() {
		return proficiencylevel;
	}

	public WebElement getDeptmntdropdown() {
		return deptmntdropdown;
	}

	public WebElement getWpl1() {
		return wpl1;
	}

	public WebElement getTodays() {
		return todays;
	}

	public WebElement getExcludeweekend() {
		return excludeweekend;
	}

	public WebElement getWpl2() {
		return wpl2;
	}

	public WebElement getSchedule() {
		return schedule;
	}

	
}
