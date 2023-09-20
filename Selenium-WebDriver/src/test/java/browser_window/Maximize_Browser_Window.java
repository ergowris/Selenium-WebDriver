package browser_window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//script to maximize the current browser window using window(i) methods
public class Maximize_Browser_Window {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.quit();
	}

}
