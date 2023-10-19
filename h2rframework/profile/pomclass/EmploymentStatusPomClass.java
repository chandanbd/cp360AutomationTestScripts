package org.profile.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmploymentStatusPomClass extends BaseClass{
	
	public EmploymentStatusPomClass()
	{
		PageFactory.initElements(driver, this);  

	}
	
	
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='People']") 
	private WebElement people;
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Search employees']") 
	private WebElement searchemployees;
	
	@CacheLookup 
	@FindBy(xpath="//div[@class='MuiBox-root css-0']/following-sibling::span[1]") 
	private WebElement selectprofile;
	
	@CacheLookup 
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/button[1]") 
	private WebElement viewhistory;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Edit'])[1]") 
	private WebElement edit;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Choose date, selected date is Sep 18, 2023']") 
	private WebElement datebutton;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Sep 21, 2023']") 
	private WebElement selectdate;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement employmentstatusdrpdwn;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement EditEmploymentStatushistorysave;
	
	
	@FindBy(xpath="//button[@id='request-cheange-button']") 
	private WebElement requestchange;
	
	public WebElement getRequestchange() {
		return requestchange;
	}

	public WebElement getRequesttermination() {
		return requesttermination;
	}



	@FindBy(xpath="//li[text()='Request Termination']") 
	private WebElement requesttermination;
	
	
	
	
	//button[text()='Request Change']

	//li[text()='Request Termination']

	public WebElement getPeople() {
		return people;
	}

	public WebElement getSearchemployees() {
		return searchemployees;
	}

	public WebElement getSelectprofile() {
		return selectprofile;
	}

	public WebElement getViewhistory() {
		return viewhistory;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getDatebutton() {
		return datebutton;
	}

	public WebElement getSelectdate() {
		return selectdate;
	}

	public WebElement getEmploymentstatusdrpdwn() {
		return employmentstatusdrpdwn;
	}

	public WebElement getEditEmploymentStatushistorysave() {
		return EditEmploymentStatushistorysave;
	}
	
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Choose date'])[1]") 
	private WebElement relievingdate;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Sep 26, 2023']") 
	private WebElement selectrelievingdate;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[2]") 
	private WebElement type;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[1]") 
	private WebElement reason;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[3]") 
	private WebElement eligibleforrehire;
	
	@CacheLookup 
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/button[1]") 
	private WebElement lastworkingday;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Sep 25, 2023']") 
	private WebElement lastworkingdaydate;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement terminationsubmit;

	public WebElement getRelievingdate() {
		return relievingdate;
	}

	public WebElement getSelectrelievingdate() {
		return selectrelievingdate;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getReason() {
		return reason;
	}

	public WebElement getEligibleforrehire() {
		return eligibleforrehire;
	}

	public WebElement getLastworkingday() {
		return lastworkingday;
	}

	public WebElement getLastworkingdaydate() {
		return lastworkingdaydate;
	}

	public WebElement getTerminationsubmit() {
		return terminationsubmit;
	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Offboarding Tasks']") 
	private WebElement offboardingtask;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Request Change']/following-sibling::button") 
	private WebElement drpdwn;
	
	public WebElement getDrpdwn() {
		return drpdwn;
	}



	@CacheLookup 
	@FindBy(xpath="//button[text()='New Task']") 
	private WebElement newtaskbutton;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='taskName']") 
	private WebElement taskname;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[2] ") 
	private WebElement templatelist;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Choose date']") 
	private WebElement duedate;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Sep 29, 2023']") 
	private WebElement selectduedate;
	
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Task']") 
	private WebElement addtask;
	
	

	public WebElement getAddtask() {
		return addtask;
	}

	public WebElement getSelectduedate() {
		return selectduedate;
	}

	public WebElement getOffboardingtask() {
		return offboardingtask;
	}

	public WebElement getNewtaskbutton() {
		return newtaskbutton;
	}

	public WebElement getTaskname() {
		return taskname;
	}

	public WebElement getTemplatelist() {
		return templatelist;
	}

	public WebElement getDuedate() {
		return duedate;
	}
	
	
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Active']") 
	private WebElement active;
	
	@CacheLookup 
	@FindBy(xpath="//li[text()='Inactive']") 
	private WebElement inactive;

	public WebElement getActive() {
		return active;
	}

	public WebElement getInactive() {
		return inactive;
	}
	
	
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Rehire']") 
	private WebElement rehire;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Confirm']") 
	private WebElement confirm;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Choose date'])[2]") 
	private WebElement effectivedate;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Sep 29, 2023']") 
	private WebElement selecteffectivedate;
	
	//button[@aria-label='Sep 29, 2023']
	
	
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Choose date'])[3]") 
	private WebElement hiredate;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Sep 25, 2023']") 
	private WebElement selecthiredate;
	
	@CacheLookup 
	@FindBy(xpath="/html[1]/body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[1]/div[1]/button[1]") 
	private WebElement employmentstatusdrpdwnrehire;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement hiresave;

	public WebElement getRehire() {
		return rehire;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getEffectivedate() {
		return effectivedate;
	}

	public WebElement getSelecteffectivedate() {
		return selecteffectivedate;
	}

	public WebElement getHiredate() {
		return hiredate;
	}

	public WebElement getSelecthiredate() {
		return selecthiredate;
	}

	public WebElement getEmploymentstatusdrpdwnrehire() {
		return employmentstatusdrpdwnrehire;
	}

	public WebElement getHiresave() {
		return hiresave;
	}
	
	
	

}
