package aut.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver webdriver;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement UserNameField;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement PasswordField;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LoginButton;
	
	public boolean IsLoginButtonExist() throws InterruptedException {
		return this.LoginButton.isDisplayed();
	}
	public LoginPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}
	
	public void Login(String userName,String password) throws InterruptedException {
		UserNameField.sendKeys(userName);
		PasswordField.sendKeys(password);
		LoginButton.click();
		Thread.sleep(10000);
	}
	
	public boolean ValidateControls() {
		return false;
	}
}
