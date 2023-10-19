package org.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PeoplePomClass extends BaseClass {


	public PeoplePomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='People']") // xpath and should make it private
	private WebElement people;

	@CacheLookup 
	@FindBy(xpath="//a[text()='Onboarding Employees']") // xpath and should make it private
	private WebElement obrdngemployee;

	@CacheLookup 
	@FindBy(xpath="//input[@name='firstName']") // xpath and should make it private
	private WebElement frstname;

	@CacheLookup 
	@FindBy(xpath="//input[@name='lastName']") // xpath and should make it private
	private WebElement lstname;

	@CacheLookup 
	@FindBy(xpath="(//input[@type='text'])[7]") // xpath and should make it private
	private WebElement personalemail;



	@CacheLookup 
	@FindBy(xpath="//*[text()='Next']") // xpath and should make it private
	private WebElement next;

	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[1]") // xpath and should make it private
	private WebElement joblocation;

	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[2]") // xpath and should make it private
	private WebElement division;

	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[4]") // xpath and should make it private
	private WebElement department;

	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[5]") // xpath and should make it private
	private WebElement jobtitle;

	@CacheLookup 
	@FindBy(xpath="//form[@autocomplete='off']//div//div//div//div//div//div//div[@role='combobox']//div//div//div//button[@title='Open']") // xpath and should make it private
	private WebElement employmentstatus;

	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[7]") // xpath and should make it private
	private WebElement worktype;

	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Choose date, selected date is Sep 20, 2023'])[1]") // xpath and should make it private
	private WebElement hiredate; 

	//button[tex()='28']

	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Sep 25, 2023']") // xpath and should make it private
	private WebElement selectdate;

	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[10]") // xpath and should make it private
	private WebElement reportsto;
	
	
	
	@FindBy(xpath="//input[@name='Assign By Category']") // xpath and should make it private
	private WebElement assignbycategory;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]") // xpath and should make it private
	private WebElement timeoffcategory;
	
	@FindBy(xpath="(//button[@title='Open'])[13]") // xpath and should make it private
	private WebElement holidays; 
	
	
	
	



	public WebElement getAssignbycategory() {
		return assignbycategory;
	}


	public WebElement getTimeoffcategory() {
		return timeoffcategory;
	}


	public WebElement getHolidays() {
		return holidays;
	}

	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") // xpath and should make it private
	private WebElement jobnext;



	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[5]") // xpath and should make it private
	private WebElement employeeacess;   
	

	@CacheLookup 
	@FindBy(xpath="(//button[normalize-space()='Next'])[1]") // xpath and should make it private
	private WebElement compensationnext;  
	

	@CacheLookup 
	@FindBy(xpath="(//input[@name='Contact point 360 india1'])[1]") // xpath and should make it private
	private WebElement onboardingtask;  
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // xpath and should make it private
	private WebElement submit; 
	
	//input[@placeholder='Search employees']
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Search employees']") // xpath and should make it private
	private WebElement searchemployees;
	
	@CacheLookup 
	@FindBy(xpath="//span[contains(text(),'Pankaj')]") // xpath and should make it private
	private WebElement particularprofile;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@type='button'])[9]") // xpath and should make it private
	private WebElement settingsdropdown;
	
	
	@CacheLookup 
	@FindBy(xpath="//div[normalize-space()='Offboarding']") // xpath and should make it private
	private WebElement offboarding;
	
	
	
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Choose date'])[1]") // xpath and should make it private
	private WebElement relievingdate;
	
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='31']") // xpath and should make it private
	private WebElement selectrelievingdate;
	

	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[2]") // xpath and should make it private
	private WebElement typedropdown;
	

	@CacheLookup 
	@FindBy(xpath="//li[@value='Resignation (Voluntary)']") // xpath and should make it private
	private WebElement resignationvoluntary;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[1]") // xpath and should make it private
	private WebElement reasonbutton;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[3]") // xpath and should make it private
	private WebElement eligiblerehire;
	
	@CacheLookup 
	@FindBy(xpath="//textarea[@name='reason']") // xpath and should make it private
	private WebElement comment;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Choose date'])[2]") // xpath and should make it private
	private WebElement lastwrkngday;
	
	//button[@title='Next month']
	
	//button[text()='1']
	
	@CacheLookup 
	@FindBy(xpath="//button[@title='Next month']") // xpath and should make it private
	private WebElement nextmonth;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='1']") // xpath and should make it private
	private WebElement selectnextmonthdate;
	
	//button[normalize-space()='Add Offboarding Task(s)']
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Offboarding Task(s)']") // xpath and should make it private
	private WebElement addoffboardingtasks;
	

	

	public WebElement getAddoffboardingtasks() {
		return addoffboardingtasks;
	}

	@CacheLookup 
	@FindBy(xpath="//input[@name='Test']") // xpath and should make it private
	private WebElement offboardinglist;
	

	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Selected Task']") // xpath and should make it private
	private WebElement addselectedtasks;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // xpath and should make it private
	private WebElement submitoffboardingtask;
	
	
	//button[normalize-space()='Submit']




	


	public WebElement getOffboardinglist() {
		return offboardinglist;
	}


	public WebElement getAddselectedtasks() {
		return addselectedtasks;
	}


	public WebElement getSubmitoffboardingtask() {
		return submitoffboardingtask;
	}


	public WebElement getReasonbutton() {
		return reasonbutton;
	}


	public WebElement getEligiblerehire() {
		return eligiblerehire;
	}


	public WebElement getComment() {
		return comment;
	}


	public WebElement getLastwrkngday() {
		return lastwrkngday;
	}


	public WebElement getNextmonth() {
		return nextmonth;
	}


	public WebElement getSelectnextmonthdate() {
		return selectnextmonthdate;
	}


	public WebElement getTypedropdown() {
		return typedropdown;
	}


	public WebElement getResignationvoluntary() {
		return resignationvoluntary;
	}


	public WebElement getSelectrelievingdate() {
		return selectrelievingdate;
	}


	public WebElement getRelievingdate() {
		return relievingdate;
	}


	public WebElement getOffboarding() {
		return offboarding;
	}

	public WebElement getSettingsdropdown() {
		return settingsdropdown;
	}

	public WebElement getParticularprofile() {
		return particularprofile;
	}

	public WebElement getSearchemployees() {
		return searchemployees;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getOnboardingtask() {
		return onboardingtask;
	}

	public WebElement getCompensationnext() {
		return compensationnext;
	}

	public WebElement getEmployeeacess() {
		return employeeacess;
	}

	public WebElement getJobnext() {
		return jobnext;
	}

	public WebElement getReportsto() {
		return reportsto;
	}

	public WebElement getSelectdate() {
		return selectdate;
	}

	public WebElement getHiredate() {
		return hiredate;
	}

	public WebElement getDivision() {
		return division;
	}

	public WebElement getDepartment() {
		return department;
	}

	public WebElement getJobtitle() {
		return jobtitle;
	}

	public WebElement getEmploymentstatus() {
		return employmentstatus;
	}

	public WebElement getWorktype() {
		return worktype;
	}

	public WebElement getJoblocation() {
		return joblocation;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getPeople() {
		return people;
	}

	public WebElement getObrdngemployee() {
		return obrdngemployee;
	}

	public WebElement getFrstname() {
		return frstname;
	}

	public WebElement getLstname() {
		return lstname;
	}

	public WebElement getPersonalemail() {
		return personalemail;
	}


}
