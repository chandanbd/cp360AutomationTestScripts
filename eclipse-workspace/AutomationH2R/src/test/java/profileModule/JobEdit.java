package profileModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JobEdit {

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

		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[13]/button[2]")).click();

		driver.findElement(By.xpath("//button[@aria-label='Choose date, selected date is Jul 7, 2023']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='5']")).click();

		driver.findElement(By.xpath("//input[@value='QA Tester']")).click();

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
		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//button[@title='Open'])[3]")).click();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//button[@title='Open'])[4]")).click();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//button[@title='Open'])[5]")).click();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//button[@aria-label='Choose date, selected date is Apr 11, 2023']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='13']")).click();

		driver.findElement(By.xpath("(//button[@title='Open'])[7]")).click();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//button[@title='Open'])[8]")).click();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//button[@title='Open'])[9]")).click();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//button[@title='Open'])[10]")).click();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//button[@title='Open'])[11]")).click();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		String successmessage = driver.findElement(By.xpath("//div[contains(text(),'Job details updated successfully')]")).getText(); // Fetching the sucess message

		String expectedsuccessmessage = "Job details updated successfully";

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
