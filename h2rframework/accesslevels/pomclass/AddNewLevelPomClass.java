package org.accesslevels.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewLevelPomClass extends BaseClass{
	
	public AddNewLevelPomClass()
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
	@FindBy(xpath="(//h6[text()='Employee Access Level'])[2]") 
	private WebElement selectemploylevel;
	

	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement employnxt;
	

	@CacheLookup 
	@FindBy(xpath="//label[text()='Access Level Name']/following::input") 
	private WebElement employinput;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement employnxt1;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Announcements']") 
	private WebElement va;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Celebrations']") 
	private WebElement vc;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View New Team Members']") 
	private WebElement vntm;
	
	@CacheLookup 
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/*[name()='svg'][1]") 
	private WebElement basicinfo;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement basicinfodrpdwn;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement drpdwnsave;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement emplysubmit;
	
	@CacheLookup 
	@FindBy(xpath="//h6[text()='Employee Access Level']") 
	private WebElement employeeaccesslevel;
	
	
	@CacheLookup 
	@FindBy(xpath="//h6[text()='EmployeeAutomation']") 
	private WebElement employautomation;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Employees']") 
	private WebElement addemployees;
	
	
	@CacheLookup 
	@FindBy(xpath="//td[4]//*[name()='svg']") 
	private WebElement privewbutton;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Alakananda. alaika5 Marakkar.']") 
	private WebElement previewash2r;
	
	

	public WebElement getPrivewbutton() {
		return privewbutton;
	}


	public WebElement getPreviewash2r() {
		return previewash2r;
	}

	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement addemployeesdrpdwn;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement addemploysubmit;
	
	

	@CacheLookup 
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]") 
	private WebElement addemployeesinput;
	
	
	
	
	
	
	
	public WebElement getAddemploysubmit() {
		return addemploysubmit;
	}

	
	public WebElement getAddemployeesdrpdwn() {
		return addemployeesdrpdwn;
	}
	public WebElement getAddemployees() {
		return addemployees;
	}

	public WebElement getAddemployeesinput() {
		return addemployeesinput;
	}

	public WebElement getEmployeeaccesslevel() {
		return employeeaccesslevel;
	}

	public WebElement getEmployautomation() {
		return employautomation;
	}

	

	public WebElement getVa() {
		return va;
	}

	public WebElement getVc() {
		return vc;
	}

	public WebElement getVntm() {
		return vntm;
	}

	public WebElement getBasicinfo() {
		return basicinfo;
	}

	public WebElement getBasicinfodrpdwn() {
		return basicinfodrpdwn;
	}

	public WebElement getDrpdwnsave() {
		return drpdwnsave;
	}

	public WebElement getEmplysubmit() {
		return emplysubmit;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getAllaccesslevel() {
		return allaccesslevel;
	}

	public WebElement getAddnewlevel() {
		return addnewlevel;
	}

	public WebElement getSelectemploylevel() {
		return selectemploylevel;
	}

	public WebElement getEmploynxt() {
		return employnxt;
	}

	public WebElement getEmployinput() {
		return employinput;
	}

	public WebElement getEmploynxt1() {
		return employnxt1;
	}
	
	
	

	@CacheLookup 
	@FindBy(xpath="(//h6[text()='Manager Access Level'])[2]") 
	private WebElement slctmanageraccesslevel;
	
	
	
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement accessnxt;
	

	@CacheLookup 
	@FindBy(xpath="//label[text()='Access Level Name']/following::input") 
	private WebElement accessinput;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement accessnxt1;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement accesssubmit;
	

	@CacheLookup 
	@FindBy(xpath="//h6[text()='Manager Access Level']") 
	private WebElement manageraccesslevel;
	
	@CacheLookup 
	@FindBy(xpath="//h6[text()='ManagerAutomation']") 
	private WebElement managerautomation;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Access Level Settings']") 
	private WebElement accesslevelsettings;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Next']") 
	private WebElement accessnext3;
	
	
	@CacheLookup 
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[5]/div[1]/*[name()='svg'][1]") 
	private WebElement  managaccesslevelbasicinfo;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[3]") 
	private WebElement managaccesslevelbasicinfodrpdwn;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement manghaccleveldrpdwnsave;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement mangacceslvlsubmit;
	
	
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Employees']") 
	private WebElement addmanageremployees;
	
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement addmanageremployeesdrpdwn;
	
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement addmangeremployeesubmit;
	
	@CacheLookup 
	@FindBy(xpath="(//td[text()='1']/following-sibling::td)[3]") 
	private WebElement mangaccesslevelprivewbutton;
	
	@CacheLookup 
	@FindBy(xpath="(//li[@role='menuitem']//div)[1]") 
	private WebElement mangaccesslevelpreviewash2r;
	



	public WebElement getMangaccesslevelprivewbutton() {
		return mangaccesslevelprivewbutton;
	}


	public WebElement getMangaccesslevelpreviewash2r() {
		return mangaccesslevelpreviewash2r;
	}


	public WebElement getMangacceslvlsubmit() {
		return mangacceslvlsubmit;
	}


	public WebElement getManghaccleveldrpdwnsave() {
		return manghaccleveldrpdwnsave;
	}


	public WebElement getAddmanageremployees() {
		return addmanageremployees;
	}


	public WebElement getAddmanageremployeesdrpdwn() {
		return addmanageremployeesdrpdwn;
	}


	public WebElement getAddmangeremployeesubmit() {
		return addmangeremployeesubmit;
	}


	public WebElement getManagaccesslevelbasicinfo() {
		return managaccesslevelbasicinfo;
	}


	public WebElement getManagaccesslevelbasicinfodrpdwn() {
		return managaccesslevelbasicinfodrpdwn;
	}


	public WebElement getManageraccesslevel() {
		return manageraccesslevel;
	}


	public WebElement getManagerautomation() {
		return managerautomation;
	}


	public WebElement getAccesslevelsettings() {
		return accesslevelsettings;
	}


	public WebElement getAccessnext3() {
		return accessnext3;
	}


	public WebElement getSlctmanageraccesslevel() {
		return slctmanageraccesslevel;
	}


	public WebElement getAccessnxt() {
		return accessnxt;
	}


	public WebElement getAccessinput() {
		return accessinput;
	}


	public WebElement getAccessnxt1() {
		return accessnxt1;
	}


	public WebElement getAccesssubmit() {
		return accesssubmit;
	}
	
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Announcements']") 
	private WebElement Mangviewannouncements;
	
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Employees Geography']") 
	private WebElement Mangviewemploygegrphy;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Holiday List']") 
	private WebElement Mangviewholidayslist;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View New Team Members']") 
	private WebElement Mangviewnewteammemb;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Celebrations']") 
	private WebElement Mangviewcelebrations;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Employment Status Graph']") 
	private WebElement Mangviewemploystatusgraph;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Job Location Graph']") 
	private WebElement Mangviewjoblocation;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Total Counts']") 
	private WebElement Mangviewtotalcounts;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Gender Graph']") 
	private WebElement Mangviewgendergraph;
	
	
	public WebElement getMangviewgendergraph() {
		return Mangviewgendergraph;
	}

	@CacheLookup 
	@FindBy(xpath="//input[@name='View Department Graph']") 
	private WebElement Mangviewdepartmntgraph;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Links']") 
	private WebElement Mangviewlinks;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name=\"View Who's Out\"]") 
	private WebElement Mangviewwhosout;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Division Graph']") 
	private WebElement Mangview;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Headcount Report']") 
	private WebElement Mangviewheadcountreport;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View My Team']") 
	private WebElement Mangviewmyteam;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='Generation Graph']") 
	private WebElement Mangviewgenerationgraph;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='View Time Off Summary']") 
	private WebElement Mangviewtimeoffsummary;



	public WebElement getMangviewannouncements() {
		return Mangviewannouncements;
	}


	public WebElement getMangviewemploygegrphy() {
		return Mangviewemploygegrphy;
	}


	public WebElement getMangviewholidayslist() {
		return Mangviewholidayslist;
	}


	public WebElement getMangviewnewteammemb() {
		return Mangviewnewteammemb;
	}


	public WebElement getMangviewcelebrations() {
		return Mangviewcelebrations;
	}


	public WebElement getMangviewemploystatusgraph() {
		return Mangviewemploystatusgraph;
	}


	public WebElement getMangviewjoblocation() {
		return Mangviewjoblocation;
	}


	public WebElement getMangviewtotalcounts() {
		return Mangviewtotalcounts;
	}


	public WebElement getMangviewdepartmntgraph() {
		return Mangviewdepartmntgraph;
	}


	public WebElement getMangviewlinks() {
		return Mangviewlinks;
	}


	public WebElement getMangviewwhosout() {
		return Mangviewwhosout;
	}


	public WebElement getMangview() {
		return Mangview;
	}


	public WebElement getMangviewheadcountreport() {
		return Mangviewheadcountreport;
	}


	public WebElement getMangviewmyteam() {
		return Mangviewmyteam;
	}


	public WebElement getMangviewgenerationgraph() {
		return Mangviewgenerationgraph;
	}


	public WebElement getMangviewtimeoffsummary() {
		return Mangviewtimeoffsummary;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
