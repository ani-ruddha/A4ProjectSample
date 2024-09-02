package section1;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationOperations {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().
		to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Navigation nav = driver.navigate();
		Thread.sleep(3000);
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		nav.refresh();
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();

	}
}
