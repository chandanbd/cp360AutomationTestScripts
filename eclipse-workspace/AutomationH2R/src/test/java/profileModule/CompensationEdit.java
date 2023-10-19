package profileModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompensationEdit {

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

		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Edit'])[4]")).click();

		driver.findElement(By.xpath("//button[@aria-label='Choose date, selected date is Jul 10, 2023']//*[name()='svg']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='11']")).click();
		
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("861852296");

		driver.findElement(By.xpath("(//button[@title='Open'])[1]")).click();

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Indian");

		Robot robot = new Robot();

		// Navigate down to select the desired option
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//button[@title='Open'])[2]")).click();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//button[@title='Open'])[3]")).click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("(//button[@title='Open'])[4]")).click();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("(//button[@title='Open'])[5]")).click();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("khsdb khbdjkd kjqdnljqdn");
		
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
		String successmessage = driver.findElement(By.xpath("//div[contains(text(),'Compensation details updated successfully')]")).getText(); // Fetching the sucess message

		String expectedsuccessmessage = "Compensation details updated successfully";

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
