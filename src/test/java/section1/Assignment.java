package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(4000);
		String text = driver.findElement
		(By.xpath("//div[@class='DayPicker-Months']/div[@class='DayPicker-Month']"
				+ "/div[@class='DayPicker-Body']" + "/div/div[@aria-disabled='false' and @aria-selected='true']"
				+ "/div/p[@class=' todayPrice']")).getText();

		System.out.println(text);
	}
}
