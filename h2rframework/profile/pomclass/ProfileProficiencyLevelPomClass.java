package org.profile.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pomclass.LoginPomClass;
import org.testng.annotations.BeforeMethod;

public class ProfileProficiencyLevelPomClass extends BaseClass{
	
	public ProfileProficiencyLevelPomClass()
	{
		PageFactory.initElements(driver, this);  

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement Settings;
	
	@CacheLookup 
	@FindBy(xpath="/div[text()='Profile']") 
	private WebElement profile;
	
	@CacheLookup 
	@FindBy(xpath="(//button[text()='View History'])[3]") 
	private WebElement viewhistory;
	
	@CacheLookup 
	@FindBy(xpath="//div[5]//div[1]//div[1]//div[3]//button[2]") 
	private WebElement editbutton;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Open']") 
	private WebElement drpdwn;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Choose date']") //training date 
	private WebElement trainingdate;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Sep 29, 2023']") 
	private WebElement Selectdate;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Open'])[2]") 
	private WebElement drpdwn1;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Choose date'])[3]") //nesting date
	private WebElement nestingdate;

}
