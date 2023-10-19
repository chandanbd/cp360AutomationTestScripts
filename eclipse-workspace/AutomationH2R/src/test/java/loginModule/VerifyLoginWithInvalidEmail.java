package loginModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLoginWithInvalidEmail {

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

		driver.findElement(By.name("email")).sendKeys("chandan8555bd@gmail.combjk");// Providing the  wrong Email Address

		driver.findElement(By.name("password")).sendKeys("Set@12345"); // Providing the Password

		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button

		String actualwarningmessage = driver.findElement(By.xpath("//div[text()='User does not exist.']")).getText(); // Fetching the warning message

		System.out.println(actualwarningmessage);

		String expectedwarningmessage = "User does not exist.";

		if(actualwarningmessage.contains(expectedwarningmessage))
		{
			System.out.println("Test passed! user id doesnot exist");
		}
		else
		{
			System.out.println("Test failed!  user id exist");
		}

		driver.close(); // Closing the browser

	}

}
