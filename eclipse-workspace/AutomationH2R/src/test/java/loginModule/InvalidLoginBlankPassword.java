package loginModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvalidLoginBlankPassword {

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

		driver.findElement(By.name("password")).sendKeys(""); // Providing the Password

		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button

		String actualwarningpwdmessage = driver.findElement(By.xpath("//p[text()='Password is required']")).getText(); //  Fetching the warning message

		String expectedwarningpwdmessage = "Password is required";

		if(actualwarningpwdmessage.contains(expectedwarningpwdmessage))
		{
			System.out.println("Test passed! Error message is displayed for blank password");
		}
		else
		{
			System.out.println("Test failed! Error message is not displayed for blank password");
		}



		driver.close(); // Closing the Browser 

	}

}
