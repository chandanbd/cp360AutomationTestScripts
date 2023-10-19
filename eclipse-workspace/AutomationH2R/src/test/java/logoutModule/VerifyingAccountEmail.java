package logoutModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyingAccountEmail {

	public static void main(String[] args) {


		// TEST passed with all the Browsers

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

		driver.findElement(By.xpath("//button[@type='button']//img[@alt='Chandan B D']")).click(); // Click on logout page

		String actualAccountEmailname = driver.findElement(By.xpath("//p[text()='chandan55bd@gmail.com']")).getText(); //Fetching the account Email name

		String expectedAccountEmailname = "chandan55bd@gmail.com";

		if(actualAccountEmailname.contains(expectedAccountEmailname))
		{
			System.out.println("Test passed! Account Email name matched");
		}
		else
		{
			System.out.println("Test failed!  Account Email name not matched");
		}


		driver.findElement(By.xpath("//button[text()='Logout']")).click(); // Click on logout button

		driver.close(); // Closing the Browser 

	}

}
