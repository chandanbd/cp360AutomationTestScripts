package loginModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RememberMeCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();

		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // Maximizing the window

		driver.get("https://test.o2ohrms.com/app"); // Opening the URL 

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Find the username and password input fields, remember me checkbox, and submit button
		WebElement usernameInput = driver.findElement(By.name("email"));
		WebElement passwordInput = driver.findElement(By.name("password"));
		// WebElement rememberMeCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

		// Enter valid username and password
		usernameInput.sendKeys("chandan55bd@gmail.com");
		passwordInput.sendKeys("Amazing@12345"); 

		// Check the "Remember Me" checkbox
		//rememberMeCheckbox.click();

		// Click the submit button
		submitButton.click();

		// Close the browser
		// driver.close();

		// Reopen the browser and navigate back to the login page
		driver = new ChromeDriver();
		driver.get("https://test.o2ohrms.com/app");

		// Verify that the login credentials are pre-filled
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.attributeToBeNotEmpty(usernameInput, "value"));
		wait.until(ExpectedConditions.attributeToBeNotEmpty(passwordInput, "value"));

		String rememberedUsername = usernameInput.getAttribute("value");
		String rememberedPassword = passwordInput.getAttribute("value");

		if (rememberedUsername.equals("chandan55bd@gmail.com") && rememberedPassword.equals("Amazing@12345")) {
			System.out.println("Test passed! Login credentials are pre-filled.");
		} else {
			System.out.println("Test failed! Login credentials are not pre-filled.");
		}

		// Close the browser
		driver.quit(); 

	}

}
