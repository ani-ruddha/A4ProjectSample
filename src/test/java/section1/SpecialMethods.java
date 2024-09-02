package section1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SpecialMethods {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//input[@id='attended']"));
		System.out.println("element is displayed : " + element.isDisplayed());
		System.out.println("element is enabled : " + element.isEnabled());
		System.out.println("element is selected : " + element.isSelected());
		System.out.println("element size is : " + element.getSize());
		System.out.println("element location is : " + element.getLocation());
		System.out.println(element.getAttribute("id"));
		System.out.println(element.getTagName());
		driver.close();
	}
}
