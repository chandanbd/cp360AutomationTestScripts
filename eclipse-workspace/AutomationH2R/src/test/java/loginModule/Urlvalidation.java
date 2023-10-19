package loginModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Urlvalidation {  // Passed with all the browsers

	public static void main(String[] args) {

		// TEST passed with all the Browsers


		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();

		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // Maximizing the window

		driver.get("https://test.o2ohrms.com/app"); // Opening the URL 

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("chandan55bd@gmail.com");// Providing the Email Address

		driver.findElement(By.name("password")).sendKeys("Set@12345"); // Providing the Password

		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button

		String url = driver.getCurrentUrl();

		System.out.println(url);  // Printing the URL

		if(url.contains("hrms")) // Validating the same url
		{
			System.out.println("Test passed! The present url is correct");
		}
		else
		{
			System.out.println("Test failed! The present url is  not correct");
		}


		if(!url.contains("hrms")) //  Validating the same url 
		{
			System.out.println("Test passed! The present url is correct");
		}
		else
		{
			System.out.println("Test failed! The present url is  not correct");
		}

		if(url.contains("h2r")) // Checking with negative input
		{
			System.out.println("Test passed! The present url is correct");
		}
		else
		{
			System.out.println("Test failed!  The present url is  not correct");
		}

		driver.close();

	}

}
