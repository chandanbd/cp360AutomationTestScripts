package org.people;

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

public class OnboardingEmployee {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		//WebDriverManager.edgedriver().setup();
				//WebDriver driver = new EdgeDriver();

				//WebDriverManager.firefoxdriver().setup();
				//WebDriver driver = new FirefoxDriver();

				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize(); // Maximizing the window

				driver.get("https://h2rdv.cp360apps.com/app"); // Opening the URL 

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				driver.findElement(By.name("email")).sendKeys("admin@o2ohrms.com");// Providing the Email Address

				driver.findElement(By.name("password")).sendKeys("Super@dmin@1234"); // Providing the Password

				driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

				driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button
				
				driver.findElement(By.xpath("//div[text()='People']")).click();
				
				driver.findElement(By.xpath("//a[text()='Onboarding Employees']")).click();
				
				driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("puneeth");
				
				driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("g s");
				
				driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("puneethgse@yopmail.com");
				
				WebDriverWait wait = new WebDriverWait(driver, 40); 
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']")));
				element.click();

				//driver.findElement(By.xpath("//*[text()='Next']")).click();
				
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("(//button[@title='Open'])[1]")).click();
				
				Robot robot = new Robot();

				// Navigate down to select the desired option
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				// Press Enter to select the option
				robot.keyPress(KeyEvent.VK_ENTER);
				
				

	}

}
