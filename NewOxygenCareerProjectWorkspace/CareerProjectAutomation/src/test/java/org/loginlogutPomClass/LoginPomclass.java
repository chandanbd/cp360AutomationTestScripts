package org.loginlogutPomClass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomclass extends BaseClass {
	
	public LoginPomclass()
	{
		PageFactory.initElements(driver, this);  //create a constructor 
		
	}
	
	
	@FindBy(xpath="//input[@type='email']") 
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']") 
	private WebElement password;
	
	@FindBy(xpath="//span[@class='show_icon']//img[1]") 
	private WebElement hideicon;
	
	@FindBy(xpath="//button[text()='Log in']") 
	private WebElement login;
	
	
	
	@FindBy(xpath="//label[text()='chandan.bd@contactpoint360.com']") 
	private WebElement logouticon;
	
	public WebElement getLogouticon() {
		return logouticon;
	}

	public WebElement getLogout() {
		return logout;
	}


	@FindBy(xpath="//a[contains(text(),'Logout')]") 
	private WebElement logout;
	
	@FindBy(xpath="//h2[text()='Admin Login']") 
	private WebElement scrnsht1;

	//div[@class='av-content']/following-sibling::div[1]

	
	//h2[text()='Admin Login']

	public WebElement getScrnsht1() {
		return scrnsht1;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getHideicon() {
		return hideicon;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	


}
