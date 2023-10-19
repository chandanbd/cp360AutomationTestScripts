package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BulkTransferPomClass extends BaseClass{
	
	public  BulkTransferPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Bulk Transfer')]") 
	private WebElement bulktransfer;
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Search employees']") 
	private WebElement searchemployee;
	
	@CacheLookup 
	@FindBy(xpath="//td[@scope='row']//input[@aria-label='secondary checkbox']") 
	private WebElement checkbox;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Transfer Employees']") 
	private WebElement transferemployees;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Choose date, selected date is Aug 14, 2023']") 
	private WebElement selectcalendar;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Aug 16, 2023']") 
	private WebElement selectdate;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement transferBy;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[2]") 
	private WebElement transferTo;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Save']") 
	private WebElement transfersave;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Yes, Transfer']") 
	private WebElement yestransfer;
	
	
	
	//button[normalize-space()='Yes, Transfer']
	
	//button[normalize-space()='Save']

	public WebElement getYestransfer() {
		return yestransfer;
	}

	public WebElement getTransfersave() {
		return transfersave;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getBulktransfer() {
		return bulktransfer;
	}

	public WebElement getSearchemployee() {
		return searchemployee;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getTransferemployees() {
		return transferemployees;
	}

	public WebElement getSelectcalendar() {
		return selectcalendar;
	}

	public WebElement getSelectdate() {
		return selectdate;
	}

	public WebElement getTransferBy() {
		return transferBy;
	}

	public WebElement getTransferTo() {
		return transferTo;
	}

}
