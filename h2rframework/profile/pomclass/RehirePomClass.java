package org.profile.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RehirePomClass extends BaseClass{
	
	public RehirePomClass()
	{
		PageFactory.initElements(driver, this);  

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='People']") 
	private WebElement people;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Active']") 
	private WebElement active;
	
	@CacheLookup 
	@FindBy(xpath="//li[text()='Inactive']") 
	private WebElement inactive;
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Search employees']") 
	private WebElement Searchemployees;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='10095']") 
	private WebElement personid;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Request Change']/following-sibling::button") 
	private WebElement drpdwnbutton;

	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Rehire']") 
	private WebElement Selectrehire;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Confirm']") 
	private WebElement confirm;

	public WebElement getPeople() {
		return people;
	}

	public WebElement getActive() {
		return active;
	}

	public WebElement getInactive() {
		return inactive;
	}

	public WebElement getSearchemployees() {
		return Searchemployees;
	}

	public WebElement getPersonid() {
		return personid;
	}

	public WebElement getDrpdwnbutton() {
		return drpdwnbutton;
	}

	public WebElement getSelectrehire() {
		return Selectrehire;
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
	
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[1]") 
	private WebElement joblocation;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[2]") 
	private WebElement division;
	
	@CacheLookup 
	@FindBy(xpath="//div[4]//div[1]//div[1]//div[1]//div[1]//button[1]") 
	private WebElement department;
	
	@CacheLookup 
	@FindBy(xpath="//div[5]//div[1]//div[1]//div[1]//div[1]//button[1]") 
	private WebElement jobtitle;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[6]") 
	private WebElement employmentstatus;
	
	@CacheLookup 
	@FindBy(xpath="//div[7]//div[1]//div[1]//div[1]//div[1]//button[1]") 
	private WebElement worktype;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Choose date']") 
	private WebElement hiredate;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Oct 9, 2023']") 
	private WebElement selecthiredate;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[10]") 
	private WebElement reportsto;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement next;

	public WebElement getJoblocation() {
		return joblocation;
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

	public WebElement getHiredate() {
		return hiredate;
	}

	public WebElement getSelecthiredate() {
		return selecthiredate;
	}

	public WebElement getReportsto() {
		return reportsto;
	}

	public WebElement getNext() {
		return next;
	}
	
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='Allow Access']") 
	private WebElement inputallowaccess;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[5]") 
	private WebElement accessdrpdwn;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement accessdrpdwnnext;
	

	public WebElement getInputallowaccess() {
		return inputallowaccess;
	}

	public WebElement getAccessdrpdwn() {
		return accessdrpdwn;
	}

	public WebElement getAccessdrpdwnnext() {
		return accessdrpdwnnext;
	}
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='automation2515']") 
	private WebElement onboardingtask1;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='New onboarding']") 
	private WebElement onboardingtask2;

	public WebElement getOnboardingtask1() {
		return onboardingtask1;
	}

	public WebElement getOnboardingtask2() {
		return onboardingtask2;
	}
	
	@CacheLookup 
	@FindBy(xpath="//button[@type='submit']") 
	private WebElement finalsubmit;

	public WebElement getFinalsubmit() {
		return finalsubmit;
	}
	
	


	
	

}
