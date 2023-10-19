package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeoffChanges1PomClass extends BaseClass{
	
	public TimeoffChanges1PomClass()
	{
		PageFactory.initElements(driver, this);  

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement Settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Time Off']") 
	private WebElement timeoff;
	
	@CacheLookup 
	@FindBy(xpath="//p[normalize-space()='New Category']") 
	private WebElement timeoffnewcategory;
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Enter Category Name']") 
	private WebElement categoryname;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Save']") 
	private WebElement categorysave;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='All Categories']") // 
	private WebElement Selectallcategories;
	
	public WebElement getSelectallcategories() {
		return Selectallcategories;
	}

	public WebElement getSelectactive() {
		return Selectactive;
	}

	public WebElement getSelectcategory() {
		return Selectcategory;
	}

	@CacheLookup 
	@FindBy(xpath="//li[normalize-space()='Active']") // 
	private WebElement Selectactive;
	
	@CacheLookup 
	@FindBy(xpath="//p[text()='Chanautotesting']") // 
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
	@FindBy(xpath="//input[@name='scheduleDuration']") 
	private WebElement employeeaccruedrpdwn1;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Twice a month']") 
	private WebElement employeeaccruedrpdwn2;
	
	@CacheLookup 
	@FindBy(xpath="//li[text()='Monthly']") 
	private WebElement employeeaccruedrpdwn3;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='1st']") 
	private WebElement employeeaccruedrpdwn4;
	
	public WebElement getDropdwn1() {
		return dropdwn1;
	}

	public WebElement getDrpdwn2() {
		return drpdwn2;
	}

	public WebElement getDrpdwn3() {
		return drpdwn3;
	}

	public WebElement getDrpdwn4() {
		return drpdwn4;
	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='1st']") 
	private WebElement dropdwn1;
	
	@CacheLookup 
	@FindBy(xpath="//li[text()='2nd']") 
	private WebElement drpdwn2;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='15th']") 
	private WebElement drpdwn3;
	
	@CacheLookup 
	@FindBy(xpath="//li[text()='16th']") 
	private WebElement drpdwn4;
	
	
	
	public WebElement getEmployeeaccruedrpdwn1() {
		return employeeaccruedrpdwn1;
	}

	public WebElement getEmployeeaccruedrpdwn2() {
		return employeeaccruedrpdwn2;
	}

	public WebElement getEmployeeaccruedrpdwn3() {
		return employeeaccruedrpdwn3;
	}

	public WebElement getEmployeeaccruedrpdwn4() {
		return employeeaccruedrpdwn4;
	}

	public WebElement getEmployeeaccruedrpdwn5() {
		return employeeaccruedrpdwn5;
	}

	@CacheLookup 
	@FindBy(xpath="//li[text()='5th']") ////li[text()='3rd']////li[text()='5th']
	private WebElement employeeaccruedrpdwn5;
	
	@FindBy(xpath="//button[text()='Save Policy']") // 
	private WebElement finalsavepolicy;
	
	
	

	public WebElement getFinalsavepolicy() {
		return finalsavepolicy;
	}

	public WebElement getAccrualoptions() {
		return accrualoptions;
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

	public WebElement getNewpolicynext() {
		return newpolicynext;
	}

	public WebElement getAccrualtimeoffdrpdwn() {
		return accrualtimeoffdrpdwn;
	}

	public WebElement getSelectdays() {
		return Selectdays;
	}
	
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='People']") 
	private WebElement people;
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Search employees']") 
	private WebElement searchemployee;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='10081']") 
	private WebElement selectprofile;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Time off summary']") 
	private WebElement selecttimeoffsummary;
	
	@CacheLookup 
	@FindBy(xpath="//div[8]//div[1]//div[1]//button[1]") 
	private WebElement policyeditbutton;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement amountbutton;
	
	
	
	public WebElement getAmountbutton() {
		return amountbutton;
	}

	@CacheLookup 
	@FindBy(xpath="//input[@name='days']") 
	private WebElement inputdays;
	
	@CacheLookup 
	@FindBy(xpath="//textarea[@name='note']") 
	private WebElement note;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement editpolicysave;

	public WebElement getPeople() {
		return people;
	}

	public WebElement getSearchemployee() {
		return searchemployee;
	}

	public WebElement getSelectprofile() {
		return selectprofile;
	}

	public WebElement getSelecttimeoffsummary() {
		return selecttimeoffsummary;
	}

	public WebElement getPolicyeditbutton() {
		return policyeditbutton;
	}

	public WebElement getInputdays() {
		return inputdays;
	}

	public WebElement getNote() {
		return note;
	}

	public WebElement getEditpolicysave() {
		return editpolicysave;
	}
	
	
	@CacheLookup 
	@FindBy(xpath="//li[text()='Hours']") 
	private WebElement Selecthrs;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='employeeCanAccrue']") 
	private WebElement capemployeecanaccrue;
	
	public WebElement getSelecthrs() {
		return Selecthrs;
	}

	public WebElement getCapemployeecanaccrue() {
		return capemployeecanaccrue;
	}

	public WebElement getInputenteraccrualcap() {
		return inputenteraccrualcap;
	}

	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Enter Accrual Cap']") 
	private WebElement inputenteraccrualcap;
	
	
	
	
	
	
	
	
	
	
	
	

}
