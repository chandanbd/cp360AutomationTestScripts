package homePageModule;

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

public class MyTeam {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//TEST Passed with all the browsers

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
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='R']")));
		element.click();

		Thread.sleep(2000);

		driver.navigate().back();

		//driver.close();

	}

}
