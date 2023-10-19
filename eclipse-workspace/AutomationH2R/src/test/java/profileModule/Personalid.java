package profileModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Personalid {

	public static void main(String[] args) throws AWTException {
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

		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Edit'])[1]")).click();

		//WebElement element = driver.findElement(By.name("firstName"));
		//element.clear();

		//driver.findElement(By.xpath("//input[@name='lastName']")).clear();

		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Bahalli");

		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Devaraj");

		driver.findElement(By.xpath("//input[@name='preferredName']")).sendKeys("chintu");

		driver.findElement(By.xpath("(//*[name()='svg'][@focusable='false'])[2]")).click();

		driver.findElement(By.xpath("//button[normalize-space()='15']")).click();

		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("India");

		Robot robot = new Robot();

		// Navigate down to select the desired option
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//input[@name='workPhone']")).sendKeys("7411489302");
		
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("India");
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//input[@name='personalPhone']")).sendKeys("8618682990");
		
		//driver.findElement(By.xpath("(//*[name()='svg'][@focusable='false'])[7]")).click();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		//driver.findElement(By.xpath("//body/div[@role='presentation']/div[@role='presentation']/div[@role='dialog']/div/div/div[14]/div[1]/div[1]//*[name()='svg']")).click();
		
		driver.findElement(By.xpath("//div[normalize-space()='Male']")).click();
		
		driver.findElement(By.xpath("//li[normalize-space()='Prefer not to say']")).click();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		driver.findElement(By.xpath("//div[normalize-space()='Married']")).click();
		
		driver.findElement(By.xpath("//li[normalize-space()='Single']")).click();
		
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
