package locatorPrograms;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		String expectedfname = "Aniruddha";
		String expectedlname = "Das";
		for(int i = 1 ; i<=2 ; i++)
		{
			Random r = new Random();
			int num = r.nextInt(1000);
		String expectedemail = "ani" + num + "@gmail.com";
		String expectedPass = "sample" + num;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/books");

		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	driver.findElement(By.xpath("//input[@id='FirstName']")).
	sendKeys(expectedfname + num);
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(expectedlname);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(expectedemail);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(expectedPass);
		WebElement element = driver.findElement(
				By.xpath("//input[@id='ConfirmPassword']"));
		element.sendKeys(expectedPass);
		element.submit();
		String actualMail = 
		driver.findElement(By.xpath("//a[contains(text(),'gmail.com')]")).getText();
		if(actualMail.equalsIgnoreCase(expectedemail))
		{
			System.out.println("it is pass!!"+num);
		}
		else
		{
			System.out.println("it is fail!!"+num);
		}		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(actualMail);
		driver.findElement(By.xpath("//input[@id='Password']"))
		.sendKeys(expectedPass);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();		
		driver.quit();
		}
	}
}
