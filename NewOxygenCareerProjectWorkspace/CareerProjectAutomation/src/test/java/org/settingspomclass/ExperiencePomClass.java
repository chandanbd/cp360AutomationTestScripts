package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExperiencePomClass extends BaseClass{
	
	public ExperiencePomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor 

	}


	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@FindBy(xpath="//div[text()='Experience']") 
	private WebElement experience;
	
	@FindBy(xpath="//a[contains(text(),'Add New Experience')]") 
	private WebElement addnewexperience;
	
	@FindBy(xpath="//label[text()='Search:']/following::input") 
	private WebElement inputexperience;
	
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement save;
	
	@FindBy(xpath="//input[@type='search']") 
	private WebElement searchbar;
	
	@FindBy(xpath="//button[@title='Search']") 
	private WebElement searchbutton;

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getExperience() {
		return experience;
	}

	public WebElement getAddnewexperience() {
		return addnewexperience;
	}

	public WebElement getInputexperience() {
		return inputexperience;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	
	
	@FindBy(xpath="//a[@title='Edit Experience']") 
	private WebElement settings;
	
	@FindBy(xpath="//input[@value='SomeExperience']") 
	private WebElement settings;
	
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	
	
	
	

}
