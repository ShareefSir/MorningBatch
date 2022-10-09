package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingletonClass {

	protected static WebDriver driver;

	protected WebDriver getDriver() {

		if (driver == null) {
			driver = new ChromeDriver();
		}

		return driver;

	}

}
