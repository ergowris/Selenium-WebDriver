package browser_window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//script to close browser window using webdriver interface methods
public class Close_Browser_Window {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// driver.close();

		driver.quit();
	}

}
