package profileModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Address {

	public static void main(String[] args) throws AWTException, InterruptedException {
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

		driver.findElement(By.xpath("(//*[name()='svg'][@role='img'])[15]")).click();

		driver.findElement(By.xpath("//body//div[@role='presentation']//div[@role='dialog']//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//button[2]")).click();

		Robot robot = new Robot();

		// Navigate down to select the desired option
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN); 

		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);


		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("India");

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("Bangalore");

		driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("560032");

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/div/div/input")).sendKeys("India");
		
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//input[@name='streetLane']")).sendKeys("balaji aptmnt");
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div[6]/div/div/div/input")).sendKeys("Karnataka");
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		String successmessage = driver.findElement(By.xpath("//div[contains(text(),'Address added succesfully')]")).getText(); // Fetching the sucess message

		String expectedsuccessmessage = "Address added succesfully";

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
