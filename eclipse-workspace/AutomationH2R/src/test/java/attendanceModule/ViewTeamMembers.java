package attendanceModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ViewTeamMembers {

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
				
				driver.findElement(By.xpath("//button[text()='View Team Members']")).click();
				
				driver.findElement(By.xpath("//input[@placeholder='Search Employees']")).sendKeys("ramesh patil");
				
				driver.findElement(By.xpath("//h6[text()='Ramesh patil']")).click();
				
				driver.navigate().back();
		

	}

}
