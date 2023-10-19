package peopleModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TeamMembersPagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();  
		WebDriver driver = new ChromeDriver();

		//WebDriverManager.firefoxdriver().setup(); 
		//WebDriver driver = new FirefoxDriver();

		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize(); // Maximizing the window

		driver.get("https://test.o2ohrms.com/app"); // Opening the URL 

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("chandan55bd@gmail.com");// Providing the Email Address

		driver.findElement(By.name("password")).sendKeys("Amazing@12345"); // Providing the Password

		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox

		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button

		driver.findElement(By.xpath("//div[contains(text(),'People')]")).click(); // click on people

		driver.findElement(By.xpath("//button[normalize-space()='View Team Members']")).click(); // click on view team members

		//driver.findElement(By.xpath("(//*[name()='svg'][@focusable='false'])[10]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div)[118]")));
		element.click();

		driver.findElement(By.xpath("//li[text()='40']")).click();

		driver.findElement(By.xpath("//li[normalize-space()='80']")).click();

		driver.navigate().back();

		driver.findElement(By.xpath("//div[text()='Home']")).click();

		driver.close();













	}

}
