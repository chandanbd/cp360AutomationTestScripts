package homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTeamMembers {

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

				driver.findElement(By.name("email")).sendKeys("gayu222510@gmail.com");// Providing the Email Address

				driver.findElement(By.name("password")).sendKeys("Contactpoint360!"); // Providing the Password

				//driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

				driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button

	}

}
