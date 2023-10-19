package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyTimeOffPomClass extends BaseClass{
	
	
	public ApplyTimeOffPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Profile']") // 
	private WebElement profile;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Time Off']") // 
	private WebElement timeoff;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Apply Time Off']") // 
	private WebElement applytimeoff;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@type='button'])[5]") // 
	private WebElement timeoffpolicydd;
	
	@CacheLookup 
	@FindBy(xpath="(//label[text()='Time Off Policy']/following::input)[1]") // 
	private WebElement inputtofp;
	
	public WebElement getInputtofp() {
		return inputtofp;
	}
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='Half Day']") // 
	private WebElement halfday;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='Hourly']") // 
	private WebElement hourly;
	
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Choose date']") // 
	private WebElement halfdaydate;
	
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Sep 21, 2023']") // 
	private WebElement selecthalfdaydate;
	
	
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Choose date']") // 
	private WebElement hourlydate;
	

	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Sep 21, 2023']") // 
	private WebElement selecthourlydate;
	

	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Choose time']") // 
	private WebElement selectfromtime;
	

	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='PM']") // 
	private WebElement selectpm;
	

	@CacheLookup 
	@FindBy(xpath="(//span[@class=' css-1mktmz5']/following-sibling::span)[1]") // 
	private WebElement select5hrs;
	

	@CacheLookup 
	@FindBy(xpath="//span[@aria-label='30 minutes']") // 
	private WebElement select30min;
	

	@CacheLookup 
	@FindBy(xpath="//div[@role='button']") // 
	private WebElement selecttotimedrdwn;
	

	@CacheLookup 
	@FindBy(xpath="//li[text()='09:30 pm']") // 
	private WebElement selecttotime;
	
	
	
	
	

	public WebElement getHourlydate() {
		return hourlydate;
	}

	public WebElement getSelecthourlydate() {
		return selecthourlydate;
	}

	public WebElement getSelectfromtime() {
		return selectfromtime;
	}

	public WebElement getSelectpm() {
		return selectpm;
	}

	public WebElement getSelect5hrs() {
		return select5hrs;
	}

	public WebElement getSelect30min() {
		return select30min;
	}

	public WebElement getSelecttotimedrdwn() {
		return selecttotimedrdwn;
	}

	public WebElement getSelecttotime() {
		return selecttotime;
	}

	public WebElement getHalfdaydate() {
		return halfdaydate;
	}

	public WebElement getSelecthalfdaydate() {
		return selecthalfdaydate;
	}

	public WebElement getHalfday() {
		return halfday;
	}

	public WebElement getHourly() {
		return hourly;
	}

	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Choose date'])[1]") // 
	private WebElement fromdate;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Sep 21, 2023']") // 
	private WebElement selectfromdate;
	
	@CacheLookup 
	@FindBy(xpath="//div[3]//div[1]//div[1]//button[1]") // 
	private WebElement todate;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Sep 21, 2023']") // 
	private WebElement selecttodate;
	
	@CacheLookup 
	@FindBy(xpath="//textarea[@name='reason']") // 
	private WebElement reason;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Save']") // 
	private WebElement applytimeoffsave;
	
	
	
	
	

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getTimeoff() {
		return timeoff;
	}

	public WebElement getApplytimeoff() {
		return applytimeoff;
	}

	public WebElement getTimeoffpolicydd() {
		return timeoffpolicydd;
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

	public WebElement getReason() {
		return reason;
	}

	public WebElement getApplytimeoffsave() {
		return applytimeoffsave;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
