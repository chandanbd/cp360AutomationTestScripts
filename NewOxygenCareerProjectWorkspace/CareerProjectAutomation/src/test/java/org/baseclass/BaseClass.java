package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


	//public static WebDriver driver;
	public static RemoteWebDriver driver;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;


	public static void launchBrowsergoogle()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchBrowserfirefox()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public static void launchBrowseredgedriver()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static void loadUrl(String url)
	{
		driver.get(url);
	}

	public static void maxBrowser()
	{
		driver.manage().window().maximize();
	}

	public static void fill(WebElement element, String usertext) 
	{

		element.sendKeys(usertext);
	}

	/*public static void openfirefoxBrowser()
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}*/

	public static void buttonClick(WebElement element)
	{
		element.click();

	}

	public static void toGetAttribute(WebElement element) {
		String Attribute = element.getAttribute("value");
		System.out.println(Attribute);
	}

	public static void pageTitle() 
	{

		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void pageUrl() 
	{
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}

	public static void validationurl(String currenturl)
	{
		if(currenturl.contains("h2rdv")) // Validating the same url
		{
			System.out.println("Test passed! The present url is correct");
		}
		else
		{
			System.out.println("Test failed! The present url is  not correct");
		}
	} 

	public static void backButton() 
	{
		driver.navigate().back();
	}

	public static void getText(WebElement element )
	{
		String text = element.getText();
		System.out.println(text);
	}

	public static void toQuit() 
	{
		driver.quit();
	}

	public static void close() 
	{
		driver.close();
	}

	public static void implictyWait() 
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	public static void webdriverwait(WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("element")));

	}

	public static void webdriverwait1(WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("element")));

	}

	public static void isdisplayed(WebElement element)
	{

		boolean logintext = true;
		if(logintext == true)
		{
			System.out.println("Test passed!  Login text exists");



		}
		else
		{
			System.out.println("Test failed!  Login text does not exists");
		}
	}

	// Function to Take screenshot
	public static void TakeScreenshot(String FileName)
			throws IOException
	{
		// Creating instance of File
		File File = ((TakesScreenshot)driver)
				.getScreenshotAs(OutputType.FILE);



		FileUtils.copyFile(File, new File("image location"+ FileName + ".png"));
	}


	public static void isemaildisplayed(String text)
	{

		String expectedwarningmessage = "User does not exist.";

		if(text.contains(expectedwarningmessage))
		{
			System.out.println("Test passed! user id  exist");
		}
		else
		{
			System.out.println("Test failed!  user id doesnot exist");
		}

	}

	public static void getAttribute(WebElement element)
	{
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}


	public static void moveToElement(WebElement element)
	{
		a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public static void dragDrop(WebElement src, WebElement target)
	{
		a.dragAndDrop(src, target).perform();

	}

	public static void doubleClick(WebElement element) throws InterruptedException
	{
		Thread.sleep(5000);
		//a.doubleClick(element).perform();
		//Actions act = new Actions(driver);
		//act.doubleClick(element).build().perform();
		//Instantiating Actions class
		Actions act = new Actions(driver);



		//Locate WebElement to perform double click 
		WebElement btnElement = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/header/div/div/div[2]/div[1]/div/div/input"));



		//Double Click the button
		act.doubleClick(btnElement).build().perform();
	}

	public static void rightClick(WebElement element)
	{
		a.contextClick(element).build().perform();
	}

	public static void getScreenshotAs() throws IOException
	{
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\chand\\eclipse-workspace\\ChandanAutomationH2R\\Screenshot");
		FileUtils.copyFile(src, dest);
	}


	public static void toperformkeydown(WebElement element, int a) throws InterruptedException
	{



		for (int i = 1; i < a; i++) {
			element.sendKeys(Keys.ARROW_DOWN);


		}
	}

	public static void delete(WebElement element) 
	{
		element.sendKeys(Keys.CONTROL, "a");
		element.sendKeys(Keys.BACK_SPACE);

	}

	public static void toperformenter() throws AWTException  
	{
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER );

	}

	public static void robotkeydown()
	{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void paste()
	{
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL); 
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
	}


	public static void robotscrollup()
	{
		// Simulate pressing the Page Up key
		r.keyPress(KeyEvent.VK_PAGE_UP);

		// Simulate releasing the Page Up key
		r.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	public static void robotscrollDown()
	{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void copy()
	{
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void scrollUp()
	{
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, -250)" );
	}

	public static void scrollDown()
	{
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)" );
	}

	/*public static void click(WebElement element)
		{
			element = driver.findElement(By.xpath(""));
			js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);

		}*/

	public static void click(WebElement element) {
		// js.executeScript("arguments[0].click();", element);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
	}

	public static void windowHandles(int i)
	{
		Set <String>  handles = driver.getWindowHandles();
		ArrayList <String> list = new ArrayList<String>(handles);
		int  r = list.size();
		System.out.println("number of windows"+ r);
		driver.switchTo().window(list.get(i));
	}

	public static String excelsheet(int RowNo, int CellNo) throws IOException
	{
		File f = new File("");
		FileInputStream fin = new FileInputStream(f); //read the data
		Workbook book = new XSSFWorkbook(fin); // collections of sheets
		Sheet sh = book.getSheet("Sheet1"); // data present in the sheet
		Row r = sh.getRow(RowNo);
		Cell c = r.getCell(CellNo);
		int cellType = c.getCellType();
		String value ="";

		if(cellType == 1)
		{
			value = c.getStringCellValue();
		}

		else if(DateUtil.isCellDateFormatted(c))
		{
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyyy");
			value = sim.format(d);
		}

		else
		{
			double dd = c.getNumericCellValue();
			long l = (long)dd; 
			System.out.println(l);
			value = String.valueOf(l); 
		}

		return value;

	}

}
