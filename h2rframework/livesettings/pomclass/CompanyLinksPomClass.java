package org.livesettings.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyLinksPomClass extends BaseClass{
	
	public CompanyLinksPomClass()
	{
		PageFactory.initElements(driver, this);  

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Company Links']") 
	private WebElement companylinks;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Category']") 
	private WebElement addcategory;
	
	@CacheLookup 
	@FindBy(xpath="//label[text()='Category']/following::input") 
	private WebElement categoryinput;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement categorysave;

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getCompanylinks() {
		return companylinks;
	}

	public WebElement getAddcategory() {
		return addcategory;
	}

	public WebElement getCategoryinput() {
		return categoryinput;
	}

	public WebElement getCategorysave() {
		return categorysave;
	}
	
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Link']") 
	private WebElement addlink;
	
	@CacheLookup 
	@FindBy(xpath="(//label[text()='Link Name']/following::input)[1]") 
	private WebElement linkname;
	
	@CacheLookup 
	@FindBy(xpath="(//label[text()='URL']/following::input)[1]") 
	private WebElement url;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[1]") 
	private WebElement categorydrpdwn;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement linksave;

	
	
	

	public WebElement getCategorydrpdwn() {
		return categorydrpdwn;
	}

	public WebElement getAddlink() {
		return addlink;
	}

	public WebElement getLinkname() {
		return linkname;
	}

	public WebElement getUrl() {
		return url;
	}

	

	public WebElement getLinksave() {
		return linksave;
	}
	
	
	
	
	
	
	

}
