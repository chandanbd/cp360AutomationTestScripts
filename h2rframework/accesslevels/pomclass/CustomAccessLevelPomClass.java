package org.accesslevels.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomAccessLevelPomClass extends BaseClass{
	
	public CustomAccessLevelPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	

	@CacheLookup 
	@FindBy(xpath="//div[text()='All Access Levels']") 
	private WebElement allaccesslevel;
	

	@CacheLookup 
	@FindBy(xpath="//button[text()='Add new level']") 
	private WebElement addnewlevel;
	
	@CacheLookup 
	@FindBy(xpath="(//h6[text()='Custom Access Level'])[2]") 
	private WebElement selectcustomlevel;
	

	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement customnxt;
	

	@CacheLookup 
	@FindBy(xpath="//label[text()='Access Level Name']/following::input") 
	private WebElement custominput;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement customnxt1;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement customnxt2;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement customsubmit;

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getAllaccesslevel() {
		return allaccesslevel;
	}

	public WebElement getAddnewlevel() {
		return addnewlevel;
	}

	public WebElement getSelectcustomlevel() {
		return selectcustomlevel;
	}

	public WebElement getCustomnxt() {
		return customnxt;
	}

	public WebElement getCustominput() {
		return custominput;
	}

	public WebElement getCustomnxt1() {
		return customnxt1;
	}

	public WebElement getCustomnxt2() {
		return customnxt2;
	}

	public WebElement getCustomsubmit() {
		return customsubmit;
	}
	
	
	
	@CacheLookup 
	@FindBy(xpath="//h6[text()='Custom Access Level']") 
	private WebElement clickcustomaccesslevel;
	
	@CacheLookup 
	@FindBy(xpath="//h6[text()='CustomAutomation']") 
	private WebElement selectcustomautomation;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Access Level Settings']") 
	private WebElement addaccesslevelsettings;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement accesslvlsettingsnext;

	public WebElement getClickcustomaccesslevel() {
		return clickcustomaccesslevel;
	}

	public WebElement getSelectcustomautomation() {
		return selectcustomautomation;
	}

	public WebElement getAddaccesslevelsettings() {
		return addaccesslevelsettings;
	}

	public WebElement getAccesslvlsettingsnext() {
		return accesslvlsettingsnext;
	}
	
	

	@CacheLookup 
	@FindBy(xpath="//span[text()='Announcement']") 
	private WebElement announcements;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Compensation Change Reason']") 
	private WebElement compensationchangereason;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Department']") 
	private WebElement department;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Job Title']") 
	private WebElement jobtitle;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Division']") 
	private WebElement division;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Employee Groups']") 
	private WebElement employeegroups;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Holidays']") 
	private WebElement holidays;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Projects']") 
	private WebElement projects;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Access Roles']") 
	private WebElement accessroles;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Company Link']") 
	private WebElement companylink;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Job Location']") 
	private WebElement joblocation;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Onboarding Task']") 
	private WebElement onboardingtask;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Approval']") 
	private WebElement approval;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Termination Reason']") 
	private WebElement terminationreason;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Proficiency Level']") 
	private WebElement proficiencylevel;
	
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Bulk Transfer']") 
	private WebElement bulktransfer;
	
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Custom Theme']") 
	private WebElement customtheme;
	
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Reason Of Hire']") 
	private WebElement reasonofhire;
	
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Job Type']") 
	private WebElement jobtype;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Client']") 
	private WebElement client;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Offboarding Task']") 
	private WebElement offboardingtask;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Alerts']") 
	private WebElement alerts;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Billing Page']") 
	private WebElement billingpage;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='GL Code Details']") 
	private WebElement glcode;
	
	
	
	
	
	
	
	public WebElement getAnnouncements() {
		return announcements;
	}

	public WebElement getCompensationchangereason() {
		return compensationchangereason;
	}

	public WebElement getDepartment() {
		return department;
	}

	public WebElement getJobtitle() {
		return jobtitle;
	}

	public WebElement getDivision() {
		return division;
	}

	public WebElement getEmployeegroups() {
		return employeegroups;
	}

	public WebElement getHolidays() {
		return holidays;
	}

	public WebElement getProjects() {
		return projects;
	}

	public WebElement getAccessroles() {
		return accessroles;
	}

	public WebElement getCompanylink() {
		return companylink;
	}

	public WebElement getJoblocation() {
		return joblocation;
	}

	public WebElement getOnboardingtask() {
		return onboardingtask;
	}

	public WebElement getApproval() {
		return approval;
	}

	public WebElement getTerminationreason() {
		return terminationreason;
	}

	public WebElement getProficiencylevel() {
		return proficiencylevel;
	}

	public WebElement getBulktransfer() {
		return bulktransfer;
	}

	public WebElement getCustomtheme() {
		return customtheme;
	}

	public WebElement getReasonofhire() {
		return reasonofhire;
	}

	public WebElement getJobtype() {
		return jobtype;
	}

	public WebElement getClient() {
		return client;
	}

	public WebElement getOffboardingtask() {
		return offboardingtask;
	}

	public WebElement getAlerts() {
		return alerts;
	}

	public WebElement getBillingpage() {
		return billingpage;
	}

	public WebElement getGlcode() {
		return glcode;
	}

	@CacheLookup 
	@FindBy(xpath="//span[text()='Custom Report']") 
	private WebElement customreport;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Standard Reports']") 
	private WebElement standardreport;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Employee Report']") 
	private WebElement employeereport;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Employee Turnover Report']") 
	private WebElement employeeturnoverreport;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Employee Birthday Report']") 
	private WebElement employeebirthdayreport;
	
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Job History Report']") 
	private WebElement jobhistoryreport;
	
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Attrition Report']") 
	private WebElement attritionreport;
	
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Project Summary Report']") 
	private WebElement projectsummaryreport;
	
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Additions & Terminations Report']") 
	private WebElement additionsterminationsreport;
	
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Check In/Out Report']") 
	private WebElement checkinoutreport;
	

	@CacheLookup 
	@FindBy(xpath="//span[text()='Time Off Application Report']") 
	private WebElement timeoffapplicationreport;
	
	

	@CacheLookup 
	@FindBy(xpath="//span[text()='Employee Time Off Balance Summary Report']") 
	private WebElement employeetimeoffbalancesummaryreport;
	
	

	@CacheLookup 
	@FindBy(xpath="//span[text()='Time Off Accruals and Balance Report']") 
	private WebElement timeoffaccrualsbalancereport;
	
	

	public WebElement getCustomreport() {
		return customreport;
	}

	public WebElement getStandardreport() {
		return standardreport;
	}

	public WebElement getEmployeereport() {
		return employeereport;
	}

	public WebElement getEmployeeturnoverreport() {
		return employeeturnoverreport;
	}

	public WebElement getEmployeebirthdayreport() {
		return employeebirthdayreport;
	}

	public WebElement getJobhistoryreport() {
		return jobhistoryreport;
	}

	public WebElement getAttritionreport() {
		return attritionreport;
	}

	public WebElement getProjectsummaryreport() {
		return projectsummaryreport;
	}

	public WebElement getAdditionsterminationsreport() {
		return additionsterminationsreport;
	}

	public WebElement getCheckinoutreport() {
		return checkinoutreport;
	}

	public WebElement getTimeoffapplicationreport() {
		return timeoffapplicationreport;
	}

	public WebElement getEmployeetimeoffbalancesummaryreport() {
		return employeetimeoffbalancesummaryreport;
	}

	public WebElement getTimeoffaccrualsbalancereport() {
		return timeoffaccrualsbalancereport;
	}
	
	
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Select All (select all the below settings)']") 
	private WebElement selectall;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Announcements']") 
	private WebElement viewannouncements;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Employees Geography']") 
	private WebElement viewemployeesgeography;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Holiday List']") 
	private WebElement viewholidaylist;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Celebrations']") 
	private WebElement viewcelebrations;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Employment Status Graph']") 
	private WebElement viewemploymentstatusgraph;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Job Location Graph']") 
	private WebElement viewjoblocationgraph;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Total Counts']") 
	private WebElement viewtotalcounts;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Department Graph']") 
	private WebElement viewdepartment;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Gender Graph']") 
	private WebElement viewgendergraph;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Links']") 
	private WebElement viewlinks;
	
	@CacheLookup 
	@FindBy(xpath="(//span[normalize-space()=\"View Who's Out\"])[1]") 
	private WebElement viewwhosout;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Division Graph']") 
	private WebElement viewdivisiongraph;
	
	@CacheLookup 
	@FindBy(xpath="/span[text()='View My Team']") 
	private WebElement viewmyteam;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Headcount Report']") 
	private WebElement viewheadcountreport;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='Generation Graph']") 
	private WebElement generationgraph;
	
	@CacheLookup 
	@FindBy(xpath="//span[text()='View Time Off Summary']") 
	private WebElement viewtimeoffsummary;

	public WebElement getSelectall() {
		return selectall;
	}

	public WebElement getViewannouncements() {
		return viewannouncements;
	}

	public WebElement getViewemployeesgeography() {
		return viewemployeesgeography;
	}

	public WebElement getViewholidaylist() {
		return viewholidaylist;
	}

	public WebElement getViewcelebrations() {
		return viewcelebrations;
	}

	public WebElement getViewemploymentstatusgraph() {
		return viewemploymentstatusgraph;
	}

	public WebElement getViewjoblocationgraph() {
		return viewjoblocationgraph;
	}

	public WebElement getViewtotalcounts() {
		return viewtotalcounts;
	}

	public WebElement getViewdepartment() {
		return viewdepartment;
	}

	public WebElement getViewgendergraph() {
		return viewgendergraph;
	}

	public WebElement getViewlinks() {
		return viewlinks;
	}

	public WebElement getViewwhosout() {
		return viewwhosout;
	}

	public WebElement getViewdivisiongraph() {
		return viewdivisiongraph;
	}

	public WebElement getViewmyteam() {
		return viewmyteam;
	}

	public WebElement getViewheadcountreport() {
		return viewheadcountreport;
	}

	public WebElement getGenerationgraph() {
		return generationgraph;
	}

	public WebElement getViewtimeoffsummary() {
		return viewtimeoffsummary;
	}
	
	
	////////////////////////////////////////////////////////////////////////

	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[2]") 
	private WebElement maindrpdwn;
	
	@CacheLookup 
	@FindBy(xpath="(//div[@role='button'])[1]") 
	private WebElement deptdrpdwn;
	
	@CacheLookup 
	@FindBy(xpath="(//div[@role='button'])[2]") 
	private WebElement divisiondrpdwn;
	
	@CacheLookup 
	@FindBy(xpath="(//div[@role='button'])[3]") 
	private WebElement emplystatusdrpdwn;
	
	@CacheLookup 
	@FindBy(xpath="(//div[@role='button'])[4]") 
	private WebElement jobtitledrpdwn;
	
	@CacheLookup 
	@FindBy(xpath="(//div[@role='button'])[5]") 
	private WebElement locationdrpdwn;

	public WebElement getMaindrpdwn() {
		return maindrpdwn;
	}

	public WebElement getDeptdrpdwn() {
		return deptdrpdwn;
	}

	public WebElement getDivisiondrpdwn() {
		return divisiondrpdwn;
	}

	public WebElement getEmplystatusdrpdwn() {
		return emplystatusdrpdwn;
	}

	public WebElement getJobtitledrpdwn() {
		return jobtitledrpdwn;
	}

	public WebElement getLocationdrpdwn() {
		return locationdrpdwn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
