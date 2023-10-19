/**
 * 
 */
package Com.Qa.Drivers;

import org.openqa.selenium.WebDriver;

/**
 * @author user
 *
 */
public interface Drivers {
	
	public void SetUpDriver(DriversTypes typeEnum);
	
	public WebDriver GetDriver(DriversTypes typeEnum);

}
