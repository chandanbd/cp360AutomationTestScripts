package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruiterHRPomClass extends BaseClass{

	public RecruiterHRPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor 

	}


	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;

	@FindBy(xpath="//div[text()='Recruiter / HR']") 
	private WebElement recruiter;

	@FindBy(xpath="//a[contains(text(),'Add New User')]") 
	private WebElement addnewuser;

	@FindBy(xpath="//input[@id='FName']") 
	private WebElement firstname;

	@FindBy(xpath="//input[@id='LName']") 
	private WebElement lastname;

	@FindBy(xpath="//input[@id='Email']") //chandanautomation@yopmail.com
	private WebElement email;

	@FindBy(xpath="(//div[@class='custom_drpdwn'])[1]") 
	private WebElement role;
	

	@FindBy(xpath="//li[text()='Recruiter']") 
	private WebElement selectrole;
	
	

	@FindBy(xpath="(//div[@class='custom_drpdwn'])[2]") 
	private WebElement country;
	

	@FindBy(xpath="//li[text()='India']") 
	private WebElement selectcountry;

	@FindBy(xpath="(//div[@class='custom_drpdwn'])[3]") 
	private WebElement status;
	

	@FindBy(xpath="//li[text()='Active']") 
	private WebElement selectstatus;

	@FindBy(xpath="//button[text()='Add User']") 
	private WebElement adduser;
	
	@FindBy(xpath="//input[@type='search']") 
	private WebElement searchbar;
	
	
	
	
	
	

	@FindBy(xpath="//button[@title='Search']") 
	private WebElement searchbutton;
	
	
	@FindBy(xpath="//button[@title='Reset Password']") 
	private WebElement resetpassword;
	
	@FindBy(xpath="//button[text()='Send Reset Password!']") 
	private WebElement sendresetpassword;
	
	@FindBy(xpath="//button[@title='Delete User']") 
	private WebElement deleteuser;
	
	
	@FindBy(xpath="//button[text()='Yes, delete it !']") 
	private WebElement yesdeleteit;
	
	
	
	@FindBy(xpath="//a[@title='Edit User']") 
	private WebElement editbutton;
	
	@FindBy(xpath="//input[@value='automation']") 
	private WebElement cleardata;
	
	
	@FindBy(xpath="//button[text()='Update User']") 
	private WebElement updateuser;
	
	@FindBy(xpath="(//button[text()='Ok'])[3]") 
	private WebElement clickok;
	
	
	
	
	
	
	
	
	


	public WebElement getEditbutton() {
		return editbutton;
	}

	public WebElement getCleardata() {
		return cleardata;
	}

	public WebElement getUpdateuser() {
		return updateuser;
	}

	public WebElement getClickok() {
		return clickok;
	}

	public WebElement getDeleteuser() {
		return deleteuser;
	}

	public WebElement getYesdeleteit() {
		return yesdeleteit;
	}

	public WebElement getResetpassword() {
		return resetpassword;
	}

	public WebElement getSendresetpassword() {
		return sendresetpassword;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	

	


	public WebElement getSettings() {
		return settings;
	}

	public WebElement getRecruiter() {
		return recruiter;
	}

	public WebElement getAddnewuser() {
		return addnewuser;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getRole() {
		return role;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getAdduser() {
		return adduser;
	}

	public WebElement getSelectrole() {
		return selectrole;
	}

	public WebElement getSelectcountry() {
		return selectcountry;
	}

	public WebElement getSelectstatus() {
		return selectstatus;
	}
	
	




}
