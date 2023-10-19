package Com.Qa.Drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplicationTestDrivers implements Drivers{

	public WebDriver GetDriver(DriversTypes typeEnum) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		switch (typeEnum) {
		case Chrome:
			driver=new ChromeDriver();
			break;
		case Edge:
			driver=new EdgeDriver();
			break;
		case FireFox:
			driver=new FirefoxDriver();
			break;
		default:  
			break;
		}
		return driver;
	}

	public void SetUpDriver(DriversTypes typeEnum) {
		// TODO Auto-generated method stub
		switch (typeEnum) {
		case Chrome:
			WebDriverManager.chromedriver().setup();
			break;
		case Edge:
			WebDriverManager.edgedriver().setup();
			break;
		case FireFox:
			WebDriverManager.firefoxdriver().setup();
			break;
		default:
			break;
		}
		
	}

}
