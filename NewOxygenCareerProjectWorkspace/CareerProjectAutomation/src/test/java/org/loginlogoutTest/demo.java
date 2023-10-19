package org.loginlogoutTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class demo {

	public static void main(String[] args) {
        // Set Chrome browser version you are using (116 in your case)
        String chromeVersion = " 116.0.5845.180"; // Update with your actual Chrome version

 

        // Use WebDriver Manager to set up ChromeDriver
        WebDriverManager.chromedriver().browserVersion(chromeVersion).setup();

 

        // Specify additional ChromeOptions if needed
        ChromeOptions options = new ChromeOptions();

 

        // Create the WebDriver with the desired capabilities
        WebDriver driver = new ChromeDriver(options);

 

        // Now, you can use the 'driver' object for your automation tasks
        driver.get("https://www.google.com");

 

        // Don't forget to close the WebDriver when you're done
        driver.quit();
    }
		
		
		

	

}
