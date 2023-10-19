package attendanceModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTime {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub


		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();

		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // Maximizing the window

		driver.get("https://test.o2ohrms.com/app"); // Opening the URL 

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("chandan55bd@gmail.com");// Providing the Email Address

		driver.findElement(By.name("password")).sendKeys("Amazing@12345"); // Providing the Password

		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button

		driver.findElement(By.xpath("//div[text()='Attendance']")).click();

		driver.findElement(By.xpath("//button[text()='Add Time']")).click();

		//driver.findElement(By.xpath("(//button[@title='Open'])[2]")).click();

		// Locate the dropdown element
		WebElement dropdownElement = driver.findElement(By.xpath("(//button[@title='Open'])[2]"));

		// Click on the dropdown element to open the options
		dropdownElement.click();
		
		// Simulate keyboard actions using the Robot class
		Robot robot = new Robot();

		// Navigate down to select the desired option
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);


		//robot.keyRelease(KeyEvent.VK_DOWN);

		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//button[@aria-label='Choose date']")).click();

		driver.findElement(By.xpath("//button[text()='1']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body//div[@role='presentation']//div[@role='presentation']//div[3]//div[1]//div[1]//div[1]//div[1]//button[1]")));
		element.click();
		
		driver.findElement(By.xpath("//span[normalize-space()='PM']")).click();
		
		driver.findElement(By.xpath("//button[@title='open next view']")).click();
		
		Actions act =  new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//span[@aria-label='40 minutes']"))).click().perform();
		
		driver.findElement(By.xpath("//div[4]//div[1]//div[1]//div[1]//div[1]//button[1]")).click();
		
		
		
		try {
			driver.findElement(By.xpath("(//span[normalize-space()='PM'])[1]")).click();
			
			
			
		} catch (StaleElementReferenceException e) {
			
			e.printStackTrace();
			driver.findElement(By.xpath("(//span[normalize-space()='PM'])[1]")).click();
			
		}








	}

}
