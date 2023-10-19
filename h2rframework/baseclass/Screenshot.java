package org.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static WebDriver driver;
	

	// Function to Take screenshot
    public static void TakeScreenshot(String FileName)
        throws IOException
    {
        // Creating instance of File
        File File = ((TakesScreenshot)driver)
                        .getScreenshotAs(OutputType.FILE);

 

        FileUtils.copyFile(File,
                        new File("image location"
                                    + FileName + ".jpeg"));
    }

}
