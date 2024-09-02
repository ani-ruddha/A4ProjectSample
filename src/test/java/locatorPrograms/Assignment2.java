package locatorPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws Exception {
		WebElement element = null;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		element = driver.findElement(By.xpath("//h5[text()='Login']"));
		Thread.sleep(4000);
		System.out.println("login page verified : " + element.isDisplayed());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Username']"))
		.sendKeys("Admin");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Password']"))
		.sendKeys("admin123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(4000);
		element = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		System.out.println("Dashboard page is displayed : " + element.isDisplayed());

		element = driver.findElement(By.xpath("//span[text()='Admin']"));
		element.click();
		Thread.sleep(4000);
		element = driver.findElement(By.xpath("//h6[text()='Admin']"));
		System.out.println("Admin page is displayed : " + element.isDisplayed());
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"))
		.sendKeys("Aniruddha");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(4000);
		element = driver.findElement(By.xpath("//h5[text()='Login']"));
		Thread.sleep(4000);
		System.out.println("after logout again login visible : " +
		element.isDisplayed());
	}
}
