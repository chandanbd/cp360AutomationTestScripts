package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyLinksPomClass extends BaseClass{
	
	public CompanyLinksPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") // 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Company Links')]") // 
	private WebElement companylinks;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Category']") // 
	private WebElement addcategory;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='category']") // 
	private WebElement inputcategory;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Save']") // 
	private WebElement categorysave;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Edit'])[1]") // 
	private WebElement editbutton;
	
	@CacheLookup 
	@FindBy(xpath="//input[@value='AutomationTesting']") // 
	private WebElement clearedittext;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='category']") // 
	private WebElement inputedit;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Save']") // 
	private WebElement editsave;
	
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Delete'])[1]") // 
	private WebElement deletebutton;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']") // 
	private WebElement delsave;
	

	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Link']") // 
	private WebElement addlink;
	

	@CacheLookup 
	@FindBy(xpath="//input[@name='link_name']") // 
	private WebElement linkname;
	

	@CacheLookup 
	@FindBy(xpath="//input[@name='link_url']") // 
	private WebElement linkurl;
	

	@CacheLookup 
	@FindBy(xpath="//button[@title='Open']") // 
	private WebElement categorydrpdown;
	

	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Save']") // 
	private WebElement savelink;
	
	
	
	
	
	
	
	
	
	public WebElement getAddlink() {
		return addlink;
	}

	public WebElement getLinkname() {
		return linkname;
	}

	public WebElement getLinkurl() {
		return linkurl;
	}

	public WebElement getCategorydrpdown() {
		return categorydrpdown;
	}

	public WebElement getSavelink() {
		return savelink;
	}

	public WebElement getDeletebutton() {
		return deletebutton;
	}

	public WebElement getDelsave() {
		return delsave;
	}

	public WebElement getEditbutton() {
		return editbutton;
	}

	public WebElement getClearedittext() {
		return clearedittext;
	}

	public WebElement getInputedit() {
		return inputedit;
	}

	public WebElement getEditsave() {
		return editsave;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getCompanylinks() {
		return companylinks;
	}

	public WebElement getAddcategory() {
		return addcategory;
	}

	public WebElement getInputcategory() {
		return inputcategory;
	}

	public WebElement getCategorysave() {
		return categorysave;
	}

	
	
	

}
