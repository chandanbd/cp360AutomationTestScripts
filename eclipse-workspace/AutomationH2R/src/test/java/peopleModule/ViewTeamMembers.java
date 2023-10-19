package peopleModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ViewTeamMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriverManager.chromedriver().setup();  
		//WebDriver driver = new ChromeDriver();

		//WebDriverManager.firefoxdriver().setup(); 
		// driver = new FirefoxDriver();

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize(); // Maximizing the window

		driver.get("https://test.o2ohrms.com/app"); // Opening the URL 

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("chandan55bd@gmail.com");// Providing the Email Address

		driver.findElement(By.name("password")).sendKeys("Amazing@12345"); // Providing the Password

		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button

		driver.findElement(By.xpath("//div[contains(text(),'People')]")).click(); // click on people

		driver.findElement(By.xpath("//button[normalize-space()='View Team Members']")).click(); // click on view team members button

		String actualtitle = driver.findElement(By.xpath("//h4[normalize-space()='Team Members']")).getText(); // Fetching the warning message

		String expectedtitle = "Team Members";

		if(actualtitle.contains(expectedtitle))
		{
			System.out.println("Test passed! Title is correct");
		}
		else
		{ 
			System.out.println("Test failed! Title is not correct");
		}

		driver.navigate().back();

		//driver.findElement(By.xpath("//div[text()='Home']")).click();







	}

}
