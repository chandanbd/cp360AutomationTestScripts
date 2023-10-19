package homePageModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTeamMembers1 {

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
				
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.findElement(By.name("email")).sendKeys("chandan55bd@gmail.com");// Providing the Email Address
				
				driver.findElement(By.name("password")).sendKeys("Amazing@12345"); // Providing the Password
				
				driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox
				
				driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button
				
				

				WebDriverWait wait = new WebDriverWait(driver, 20); 
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='J']")));
				element.click();

				//driver.findElement(By.xpath("//div[normalize-space()='J']")).click();// this is a bug

	}

}
