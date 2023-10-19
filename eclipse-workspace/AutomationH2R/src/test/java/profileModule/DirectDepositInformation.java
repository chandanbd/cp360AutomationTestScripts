package profileModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectDepositInformation {

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

		driver.findElement(By.xpath("//div[8]//div[1]//div[3]//button[1]")).click();

		driver.findElement(By.xpath("//input[@name='bank_name']")).sendKeys("sdf bank");

		driver.findElement(By.xpath("//button[@title='Open']")).click();

		Robot robot = new Robot();

		// Navigate down to select the desired option
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//input[@name='account_number']")).sendKeys("0123456789");

		driver.findElement(By.xpath("//input[@name='transit_number']")).sendKeys("9876543210");

		driver.findElement(By.xpath("//input[@name='percentage']")).sendKeys("56.23");

		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("56985412578");

		driver.findElement(By.xpath("//input[@name='institution_number']")).sendKeys("852741963");

		driver.findElement(By.xpath("//input[@name='branch_number']")).sendKeys("asd852");
		
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		String successmessage = driver.findElement(By.xpath("//div[contains(text(),'Added successfully')]")).getText(); // Fetching the sucess message

		String expectedsuccessmessage = "Added successfully";

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


