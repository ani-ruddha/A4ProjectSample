package locatorPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws Exception {
		WebElement element = null;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//div[text()='Contact Us']"));
		Thread.sleep(3000);
		System.out.println("contact us is displyed : "+element.isDisplayed());
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Payments']")).click();
		Thread.sleep(3000);
		element =driver.findElement(By.xpath("//div[text()='Payments']"));
		Thread.sleep(3000);
		System.out.println("payments is displyed : "+element.isDisplayed());
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Return Policy']")).click();
		Thread.sleep(3000);
		element =driver.findElement(By.xpath("//div[text()='Return Policy']"));
		Thread.sleep(3000);
		System.out.println("Return Policy is displyed : "+element.isDisplayed());
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Youtube']")).click();
		Thread.sleep(3000);
		element =driver.findElement(By.xpath("//div[text()='Youtube']"));
		Thread.sleep(3000);
		System.out.println("Youtube is displyed : "+element.isDisplayed());
		Thread.sleep(3000);
		driver.quit();
		
	}
}
