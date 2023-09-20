package browser_newtab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//script to print window handle ID of current browser window
public class Window_Handle_ID_Current_Browser_Window {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Return window handle ID of current browser window
		System.out.println("Window handle ID of current browser window is: " + driver.getWindowHandle());

		driver.quit();
	}

}
