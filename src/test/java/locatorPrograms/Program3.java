package locatorPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector
	("li[class='w-[100%] flex justify-between items-center py-1  cursor-pointer  "
				+ "px-2 relative ps-1 text-[14px] text-black']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Uday");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("udayShetty007@gmail.com");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.cssSelector("input[type='password']"));
		element.sendKeys("MaheshAndSuresh");
		Thread.sleep(3000);
		element.submit();
	}
}
