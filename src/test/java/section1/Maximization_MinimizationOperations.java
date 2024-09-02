package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Maximization_MinimizationOperations {
	public static void main(String[] args) throws Exception {
		String expectedTitle = "Orange";
		String expectedUrl = "orangehrmlive";
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		Thread.sleep(3000);
		if (actualTitle.contains(expectedTitle) && actualUrl.contains(expectedUrl)) {
			System.out.println("orange hrm home page dispalyed successfullY!!");
		} else {
			System.out.println("not displayed!!");
		}
		driver.close();
	}
}
