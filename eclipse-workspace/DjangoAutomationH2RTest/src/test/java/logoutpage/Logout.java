package logoutpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // Maximizing the window

		driver.get("https://h2rdv.cp360apps.com/app"); // Opening the URL 

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("admin@o2ohrms.com");// Providing the Email Address

		driver.findElement(By.name("password")).sendKeys("Super@dmin@1234"); // Providing the Password

		//driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button

		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[3]/button[1]")).click(); // Click on logout page

		Thread.sleep(3000); // Sleep for  3 seconds

		driver.findElement(By.xpath("//button[text()='Logout']")).click(); // Click on logout button

		//driver.close(); // Closing the Browser 

	}

}
