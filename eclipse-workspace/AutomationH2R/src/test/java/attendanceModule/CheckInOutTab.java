package attendanceModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckInOutTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // Maximizing the window

		driver.get("https://test.o2ohrms.com/app"); // Opening the URL 

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("chandan55bd@gmail.com");// Providing the Email Address

		driver.findElement(By.name("password")).sendKeys("Amazing@12345"); // Providing the Password

		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button

		driver.findElement(By.xpath("//div[text()='Attendance']")).click();

		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/button[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Close']")).click();

		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/button[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		driver.navigate().back();
		
		driver.close();

	}

}
