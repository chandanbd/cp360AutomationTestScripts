package org.accesslevels.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeAccessLevelPomClass extends BaseClass{
	
	
	public EmployeeAccessLevelPomClass()
	{
		PageFactory.initElements(driver, this);  

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	

	@CacheLookup 
	@FindBy(xpath="//div[text()='All Access Levels']") 
	private WebElement allaccesslevel;
	

	@CacheLookup 
	@FindBy(xpath="//h6[text()='Employee Access Level']") 
	private WebElement employeeaccesslevel;
	
	
	@CacheLookup 
	@FindBy(xpath="//h6[text()='EmployeeAutomation']") 
	private WebElement employautomation;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Access Level Settings']") 
	private WebElement addaccesslevelsettings;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement next;

	public WebElement getNext() {
		return next;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getAllaccesslevel() {
		return allaccesslevel;
	}

	public WebElement getEmployeeaccesslevel() {
		return employeeaccesslevel;
	}

	public WebElement getEmployautomation() {
		return employautomation;
	}

	public WebElement getAddaccesslevelsettings() {
		return addaccesslevelsettings;
	}
	
	
	

	@CacheLookup 
	@FindBy(xpath="//span[text()='View Gender Graph']") 
	private WebElement gendergraph;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Links']") 
	private WebElement viewlinks;
	
	@CacheLookup 
	@FindBy(xpath="(//span[normalize-space()=\"View Who's Out\"])[1]") 
	private WebElement whosout;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='View Division Graph']") 
	private WebElement divisiongraph;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='View Headcount Report']") 
	private WebElement headcountreport;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='View My Team']") 
	private WebElement viewmyteam;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='Generation Graph']") 
	private WebElement generationgraph;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='View Time Off Summary']") 
	private WebElement timeoffsummary;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='View Announcements']") 
	private WebElement announcements;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='View Employees Geography']") 
	private WebElement employeesgeography;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='View Holiday List']") 
	private WebElement holidaylist;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='View New Team Members']") 
	private WebElement newteammembers;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='View Celebrations']") 
	private WebElement celebrations;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='View Employment Status Graph']") 
	private WebElement employmentstatusgraph;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='View Job Location Graph']") 
	private WebElement joblocationgraph;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='View Total Counts']") 
	private WebElement totalcounts;
	
	@CacheLookup 
	@FindBy(xpath="//span[normalize-space()='View Department Graph']") 
	private WebElement departmentgraph;

	public WebElement getGendergraph() {
		return gendergraph;
	}

	public WebElement getViewlinks() {
		return viewlinks;
	}

	public WebElement getWhosout() {
		return whosout;
	}

	public WebElement getDivisiongraph() {
		return divisiongraph;
	}

	public WebElement getHeadcountreport() {
		return headcountreport;
	}

	public WebElement getViewmyteam() {
		return viewmyteam;
	}

	public WebElement getGenerationgraph() {
		return generationgraph;
	}

	public WebElement getTimeoffsummary() {
		return timeoffsummary;
	}

	public WebElement getAnnouncements() {
		return announcements;
	}

	public WebElement getEmployeesgeography() {
		return employeesgeography;
	}

	public WebElement getHolidaylist() {
		return holidaylist;
	}

	public WebElement getNewteammembers() {
		return newteammembers;
	}

	public WebElement getCelebrations() {
		return celebrations;
	}

	public WebElement getEmploymentstatusgraph() {
		return employmentstatusgraph;
	}

	public WebElement getJoblocationgraph() {
		return joblocationgraph;
	}

	public WebElement getTotalcounts() {
		return totalcounts;
	}

	public WebElement getDepartmentgraph() {
		return departmentgraph;
	}
	
	
	@CacheLookup 
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/*[name()='svg'][1]") 
	private WebElement jobinformation;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement jobinfodrpdwn;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Save']") 
	private WebElement save;
	
	public WebElement getSave() {
		return save;
	}

	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") 
	private WebElement submit;
	
	public WebElement getJobinformation() {
		return jobinformation;
	}

	public WebElement getJobinfodrpdwn() {
		return jobinfodrpdwn;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Emergency']") 
	private WebElement emergency;
	
	@CacheLookup 
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/*[name()='svg'][1]") 
	private WebElement emergencyinfo;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement emergencydrpdwn;
	
	public WebElement getEmergency() {
		return emergency;
	}

	public WebElement getEmergencyinfo() {
		return emergencyinfo;
	}

	public WebElement getEmergencydrpdwn() {
		return emergencydrpdwn;
	}

	public WebElement getSave1() {
		return save1;
	}

	@CacheLookup 
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement save1;
	
	
	
	

	
	
	
	
	

	
	
	

}
