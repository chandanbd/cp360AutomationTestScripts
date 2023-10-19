package loginModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvalidLoginBlankUsername {

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

		driver.findElement(By.name("email")).sendKeys("");// Providing the Email Address

		driver.findElement(By.name("password")).sendKeys("Amazing@12345"); // Providing the Password

		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button


		String actualwarningmessage = driver.findElement(By.xpath("//p[text()='Email is required']")).getText(); // Fetching the warning message

		String expectedwarningmessage = "Email is required";

		if(actualwarningmessage.contains(expectedwarningmessage))
		{
			System.out.println("Test passed! Error message is displayed for blank username");
		}
		else
		{
			System.out.println("Test failed! Error message is not displayed for blank username");
		}

		driver.close(); // Closing the Browser

	}

}
