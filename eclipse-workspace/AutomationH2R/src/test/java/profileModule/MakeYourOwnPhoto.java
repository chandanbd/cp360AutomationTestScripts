package profileModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeYourOwnPhoto {

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

		driver.findElement(By.xpath("//span[normalize-space()='Update photo']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Make your own')]")).click();
		
		//driver.findElement(By.xpath("(//*[name()='svg'][@focusable='false'])[2]")).click();
		

		WebDriverWait wait = new WebDriverWait(driver, 30); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='button'])[1]")));
		element.click();
		
		Robot robot = new Robot();

		// Navigate down to select the desired option
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		// Press Enter to select the option
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//li[normalize-space()='Circle']")).click();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//li[normalize-space()='Small']")).click();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//li[normalize-space()='Long']")).click();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//li[normalize-space()='Peace']")).click();
		
		
		
		
		//robot.keyPress(KeyEvent.VK_DOWN);
		//robot.keyRelease(KeyEvent.VK_DOWN);
		
		//robot.keyPress(KeyEvent.VK_ENTER);
		
		/*WebDriverWait wait1 = new WebDriverWait(driver, 30); 
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@role='presentation']/div[@role='presentation']/div[@role='dialog']/div/div/div/div[2]/div[1]/div[1]/div[1]//*[name()='svg']")));
		element1.click();*/
		
		
		//driver.findElement(By.xpath("//body/div[@role='presentation']/div[@role='presentation']/div[@role='dialog']/div/div/div/div[2]/div[1]/div[1]/div[1]//*[name()='svg']")).click();


	}

}
