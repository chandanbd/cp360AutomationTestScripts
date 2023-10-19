package loginPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLoginWithInvalidPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TEST passed with all the Browsers

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

		String actualwarningmessage = driver.findElement(By.xpath("//div[text()='Incorrect Password.']")).getText(); // Fetching the warning message

		String expectedwarningmessage = "Incorrect Password.";

		if(actualwarningmessage.contains(expectedwarningmessage))
		{
			System.out.println("Test passed! given invalid password");
		}
		else
		{ 
			System.out.println("Test failed! not a invalid password");
		}

		driver.close(); // Closing the browser

	}

}
