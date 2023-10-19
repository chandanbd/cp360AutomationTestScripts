package attendanceModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectAttendance {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		//TEST Passes with all the Browsers

		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();

		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // Maximizing the window

		driver.get("https://test.o2ohrms.com/app"); // Opening the URL 

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("chandan55bd@gmail.com");// Providing the Email Address

		driver.findElement(By.name("password")).sendKeys("Amazing@12345"); // Providing the Password

		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button

		driver.findElement(By.xpath("//div[text()='Attendance']")).click();

		// Locate the dropdown element
		WebElement dropdownElement = driver.findElement(By.xpath("//button[@title='Open']"));

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

		//robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//button[@aria-label='Check In']")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//button[@aria-label='Check Out']")).click();

		driver.navigate().back();

		driver.close();

	}

}
