package locatorPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws Exception {
		String expectedData = "search";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("i phone 14");
		element.submit();

		String actualUrl = driver.getCurrentUrl();

		if (actualUrl.contains(expectedData)) {
			System.out.println("successfull!!");
		} else {
			System.out.println("un successfull!!");
		}
		Thread.sleep(3000);
		driver.close();

	}
}
