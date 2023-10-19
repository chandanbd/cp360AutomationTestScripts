package homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompanyLinksFunctionality {

	public static void main(String[] args) throws InterruptedException {
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

		//Thread.sleep(5000); 

		driver.findElement(By.xpath("//body//div//div[@data-simplebar='init']//div//div//div//div//div//div//div//div//div//div//div[3]//div[1]//div[1]//div[2]//*[name()='svg']")).click();

		driver.findElement(By.xpath("//button[text()='Add Category']")).click();

		driver.findElement(By.xpath("//input[@name='category']")).sendKeys("AutomationH2R");

		driver.findElement(By.xpath("//button[text()='Save']")).click();

		String successfulmessage = driver.findElement(By.xpath("//div[@id='notistack-snackbar']")).getText();

		System.out.println(successfulmessage);

		String expectedsuccessfulmessage = "Category Added successfully";

		if(successfulmessage.contains(expectedsuccessfulmessage))
		{
			System.out.println("Test passed! Category Added successfully");
		}
		else
		{
			System.out.println("Test failed! Category not Added successfully");
		}

		//driver.close();

	}

}
