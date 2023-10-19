package attendanceModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PreviousandNextWeekFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
				
				driver.findElement(By.xpath("//button[@aria-label='Previous Week']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='Previous Week']")).click();
				
				driver.findElement(By.xpath("//button[@aria-label='Previous Week']")).click();
				
				driver.findElement(By.xpath("//tbody//tr//td//button[@type='button']")).click();
				
				String actualtittle = driver.findElement(By.xpath("//th[text()='Check IN/OUT']")).getText(); // Fetching the warning message

				String expectedtittle = "Check IN/OUT";

				if(actualtittle.contains(expectedtittle))
				{
					System.out.println("Test passed! ");
				}
				else
				{
					System.out.println("Test failed! ");
				}
				
				driver.findElement(By.xpath("//button[text()='Close']")).click();

	}

}
