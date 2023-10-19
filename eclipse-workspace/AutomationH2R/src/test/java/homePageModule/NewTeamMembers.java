package homePageModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTeamMembers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		// Passed with all the browsers
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize(); // Maximizing the window
		
		driver.get("https://test.o2ohrms.com/app"); // Opening the URL 
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("email")).sendKeys("chandan55bd@gmail.com");// Providing the Email Address
		
		driver.findElement(By.name("password")).sendKeys("Amazing@12345"); // Providing the Password
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); // Unchecking the Rememberme Checkbox
		
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // Click on Login Button
		
		driver.findElement(By.xpath("(//*[name()='svg'][@role='img'])[29]")).click();
		
		driver.findElement(By.xpath("//h6[text()='Gytyutrhe rt']")).click();
		
		Thread.sleep(6000);
		
		driver.navigate().back();
		
		
		//driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		//driver.close(); // closing the Browser 

	}

}
