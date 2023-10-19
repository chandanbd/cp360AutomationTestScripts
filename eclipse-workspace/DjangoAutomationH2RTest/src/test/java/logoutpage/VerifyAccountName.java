package logoutpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyAccountName {

	public static void main(String[] args) {

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

		//driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button

		driver.findElement(By.xpath("//button[@type='button']//img[@alt='Admin']")).click(); // Click on logout page

		String actualAccountname = driver.findElement(By.xpath("//h6[contains(text(),'Admin')]")).getText(); //Fetching the account  name
		
		System.out.println(actualAccountname);

		String expectedAccountname = "Admin  Test";

		if(actualAccountname.contains(expectedAccountname))
		{
			System.out.println("Test passed! Account name matched");
		}
		else
		{
			System.out.println("Test failed!  Account name not matched");
		}

		//driver.findElement(By.xpath("//button[text()='Logout']")).click(); // Click on logout button

		//driver.close(); // Closing the Browser 

	}

}
