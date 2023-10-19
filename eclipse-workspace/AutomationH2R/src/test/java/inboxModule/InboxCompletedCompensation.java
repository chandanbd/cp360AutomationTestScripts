package inboxModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InboxCompletedCompensation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Complication with the browsers..>>> bug

		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();

		//WebDriverManager.firefoxdriver().setup(); 
		//WebDriver driver = new FirefoxDriver();

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize(); // Maximizing the window

		driver.get("https://test.o2ohrms.com/app"); // Opening the URL 

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("chandan55bd@gmail.com");// Providing the Email Address

		driver.findElement(By.name("password")).sendKeys("Amazing@12345"); // Providing the Password

		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button


		WebDriverWait wait = new WebDriverWait(driver, 30); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body//div[@id='root']//header//div//div//div//div[2]//button[1]")));
		element.click(); // Click on Inbox

		driver.findElement(By.xpath("//button[normalize-space()='Completed']")).click(); // Click on Completed Tab

		driver.findElement(By.xpath("//button[normalize-space()='Assigned to me']")).click(); // Click on Assigned to me

		driver.findElement(By.xpath("//li[normalize-space()='Assigned to company']")).click(); // Click on Assigned to Company

		driver.findElement(By.xpath("//button[normalize-space()='Compensation(67)']")).click(); // Click on Compensation Tab

		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Approved'])[1]")).click(); // Click on Approved Tab

		String actualtitle = driver.findElement(By.xpath("//h2[text()='Compensation Update']")).getText(); //  Fetching the tittle of the Tab


		System.out.println(actualtitle);
		String expectedtitle = "Compensation Update";  // Verifying the Tittle

		if(actualtitle.contains(expectedtitle))
		{ 
			System.out.println("Test passed! Title Matched");
		}
		else
		{
			System.out.println("Test failed! Title not Matched");
		}
 
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click(); // Click on Close tab

		driver.navigate().back(); // Back to Previous Page

		driver.findElement(By.xpath("//div[text()='Home']")).click(); // Click on Home Page

		driver.close(); // Closing the Window
		



	}

}
