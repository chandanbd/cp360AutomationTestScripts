package profileModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EducationAddNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();  
		WebDriver driver = new ChromeDriver();

		//WebDriverManager.firefoxdriver().setup(); 
		//WebDriver driver = new FirefoxDriver();

		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize(); // Maximizing the window

		driver.get("https://test.o2ohrms.com/app"); // Opening the URL 

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("chandan55bd@gmail.com");// Providing the Email Address

		driver.findElement(By.name("password")).sendKeys("Amazing@12345"); // Providing the Password

		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button

		driver.findElement(By.xpath("//div[text()='Profile']")).click();

		driver.findElement(By.xpath("//div[7]//div[1]//div[3]//button[1]")).click();

		driver.findElement(By.xpath("//input[@name='school_univ']")).sendKeys("rnr school");

		driver.findElement(By.xpath("//input[@name='qualification']")).sendKeys("engineering");

		driver.findElement(By.xpath("//input[@name='maj_opt_subj']")).sendKeys("mechanical");

		driver.findElement(By.xpath("//input[@name='class_per']")).sendKeys("A+");

		driver.findElement(By.xpath("//div[5]//div[1]//div[1]//div[1]//button[1]")).click();

		//driver.findElement(By.xpath("(//button[@aria-label='calendar view is open, switch to year view'])[1]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-label='calendar view is open, switch to year view'])[1]")));
		element.click();

		driver.findElement(By.xpath("//button[normalize-space()='2019']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='Aug']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='4']")).click();

		driver.findElement(By.xpath("//div[6]//div[1]//div[1]//div[1]//button[1]")).click();

		//driver.findElement(By.xpath("//button[@aria-label='calendar view is open, switch to year view']")).click();

		//driver.findElement(By.xpath("//button[@title='Previous month']")).click();

		try {
			
			driver.findElement(By.xpath("//button[@title='Previous month']")).click();



		} catch (StaleElementReferenceException e) {

			e.printStackTrace();

		}
		
		//driver.findElement(By.xpath("//button[@title='Previous month']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='1']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
		String successmessage = driver.findElement(By.xpath("//div[contains(text(),'Update success')]")).getText(); // Fetching the sucess message

		String expectedsuccessmessage = "Update success";

		if(successmessage.contains(expectedsuccessmessage))
		{
			System.out.println("Test passed! ");
		}
		else
		{
			System.out.println("Test failed! ");
		}

	}

}
