package loginPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTitle {

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

				boolean text = driver.findElement(By.xpath("//h4[normalize-space()='Login']")).isDisplayed(); // Checking the Login text is Displayed or not

				if(text == true)
				{
					System.out.println("Test passed!  Login text exists");
				}
				else
				{
					System.out.println("Test failed!  Login text does not exists");
				}

				//driver.close(); //Closing the Browser


	}

}
