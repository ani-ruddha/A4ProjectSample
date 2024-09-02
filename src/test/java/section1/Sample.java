package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
	WebElement element =driver.findElement(By.xpath("//input[@name='user_name']"));
		element.sendKeys("Admin");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		element.sendKeys("Admin");
	}
}
