package org.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// storing locators in the pom 

public class LoginPomClass extends BaseClass
{
	public LoginPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor 
		
	}
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='email']") // xpath and should make it private
	private WebElement email;
	
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwrd;
	
	@CacheLookup
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	@CacheLookup
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@CacheLookup
	@FindBy(xpath="//h4[text()='Login']")
	private WebElement logintext;
	
	@CacheLookup
	@FindBy(xpath="//div[contains(text(),'Incorrect Password!!!')]")
	private WebElement incrtctpassword;
	
	@CacheLookup
	@FindBy(xpath="//div[contains(text(),'Account with this email does not exists')]")
	private WebElement emailnotexist;
	
	
	
	

	public WebElement getIncrtctpassword() {
		return incrtctpassword;
	}

	public WebElement getEmailnotexist() {
		return emailnotexist;
	}

	public WebElement getLogintext() {
		return logintext;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswrd() {
		return passwrd;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	

	

}
