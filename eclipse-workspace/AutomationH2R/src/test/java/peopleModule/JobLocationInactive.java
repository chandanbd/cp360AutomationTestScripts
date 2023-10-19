package peopleModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JobLocationInactive {

	public static void main(String[] args) {
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

		driver.findElement(By.xpath("//div[contains(text(),'People')]")).click();

		driver.findElement(By.xpath("//div[@data-simplebar='init']//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div[@role='button']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).sendKeys("Bengaluru");

		driver.findElement(By.xpath("//span[normalize-space()='Bengaluru']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='root']/div/div[@data-simplebar='init']/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]//*[name()='svg']")));
		element.click();

		//driver.findElement(By.xpath("//body/div[@id='root']/div/div[@data-simplebar='init']/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]//*[name()='svg']")).click();

		//driver.findElement(By.xpath("//div[normalize-space()='Active']")).click();

		//WebDriverWait wait = new WebDriverWait(driver, 30); 
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='Active']")));
		//element.click();
		//
		//driver.findElement(By.xpath("//li[normalize-space()='Inactive']")).click();


	}

}
