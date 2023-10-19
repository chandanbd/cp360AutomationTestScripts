package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeoffPomClass extends BaseClass {

	
	public TimeoffPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") // 
	private WebElement Settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Time off')]") // 
	private WebElement timeoff;
	
	@CacheLookup 
	@FindBy(xpath="//p[normalize-space()='New Category']") // 
	private WebElement timeoffnewcategory;
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Enter Category Name']") // 
	private WebElement categoryname;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Save']") // 
	private WebElement categorysave;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='All Categories']") // 
	private WebElement Selectallcategories;
	
	@CacheLookup 
	@FindBy(xpath="//li[normalize-space()='Active']") // 
	private WebElement Selectactive;
	
	@CacheLookup 
	@FindBy(xpath="//p[normalize-space()='AutomationTesting']") // 
	private WebElement Selectcategory;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Policy']") // 
	private WebElement addpolicy;
	
	@CacheLookup 
	@FindBy(xpath="//h6[normalize-space()='Create New Policy']") // 
	private WebElement createnewpolicy;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Next']") // 
	private WebElement policynext;
	
	@CacheLookup 
	@FindBy(xpath="//h6[normalize-space()='Accrues Time']") // 
	private WebElement accruestime;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Next']") // 
	private WebElement accruesnext;
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Please enter policy name']") // 
	private WebElement enterpolicyname;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Next']") // 
	private WebElement newpolicynext;
	
	@CacheLookup 
	@FindBy(xpath="(//div[@role='button'])[1]") // 
	private WebElement accrualtimeoffdrpdwn;
	
	@CacheLookup 
	@FindBy(xpath="//li[text()='Days']") // 
	private WebElement Selectdays;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='isLeaveAccrual']") // 
	private WebElement accrualoptions;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='scheduleDuration']") // 
	private WebElement employeeaccrue1;
	
	@CacheLookup 
	@FindBy(xpath="(//div[@role='button'])[2]") // 
	private WebElement empaccruebtn;
	
	@CacheLookup 
	@FindBy(xpath="//li[normalize-space()='Monthly']") // 
	private WebElement employeeaccrue2;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Save Policy']") // 
	private WebElement finalsavepolicy;
	
	
	
	
	

	public WebElement getNewpolicynext() {
		return newpolicynext;
	}

	public WebElement getAccrualtimeoffdrpdwn() {
		return accrualtimeoffdrpdwn;
	}

	public WebElement getSelectdays() {
		return Selectdays;
	}

	public WebElement getAccrualoptions() {
		return accrualoptions;
	}

	public WebElement getEmployeeaccrue1() {
		return employeeaccrue1;
	}

	public WebElement getEmpaccruebtn() {
		return empaccruebtn;
	}

	public WebElement getEmployeeaccrue2() {
		return employeeaccrue2;
	}

	public WebElement getFinalsavepolicy() {
		return finalsavepolicy;
	}

	public WebElement getSelectallcategories() {
		return Selectallcategories;
	}

	public WebElement getSelectactive() {
		return Selectactive;
	}

	public WebElement getSelectcategory() {
		return Selectcategory;
	}

	public WebElement getAddpolicy() {
		return addpolicy;
	}

	public WebElement getCreatenewpolicy() {
		return createnewpolicy;
	}

	public WebElement getPolicynext() {
		return policynext;
	}

	public WebElement getAccruestime() {
		return accruestime;
	}

	public WebElement getAccruesnext() {
		return accruesnext;
	}

	public WebElement getEnterpolicyname() {
		return enterpolicyname;
	}

	public WebElement getSettings() {
		return Settings;
	}

	public WebElement getTimeoff() {
		return timeoff;
	}

	public WebElement getTimeoffnewcategory() {
		return timeoffnewcategory;
	}

	public WebElement getCategoryname() {
		return categoryname;
	}

	public WebElement getCategorysave() {
		return categorysave;
	}
}
