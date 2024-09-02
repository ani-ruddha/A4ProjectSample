package locatorPrograms;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
	public static void main(String[] args) throws Exception {
		int count = 0;
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("i phone 14");
		element.submit();
		String expectedPname = driver.findElement
			(By.xpath("//div[text()='Apple iPhone 14 (Blue, 128 GB)']")).getText();
		List<WebElement> allProds = 
			driver.findElements(By.xpath("//div[@class='KzDlHZ']"));	
		Iterator<WebElement> itr = allProds.iterator();	
		while(itr.hasNext())
		{
		String actualPnames =	itr.next().getText();
		if(actualPnames.equalsIgnoreCase(expectedPname))
		{
			count++;		
		}
		}
		if(count>=1)
		{
			System.out.println("product is present " + count + " times ");
		}
		else
		{
			System.out.println("product is not present");
		}
	}
}
