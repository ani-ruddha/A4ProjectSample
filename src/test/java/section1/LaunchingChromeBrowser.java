package section1;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchingChromeBrowser {
	public static void main(String[] args) throws Exception {
		String expectedData = "demoapps";
		String exepctedTitle = "DemoApps";
		// step 1:- launching browser
		ChromeDriver driver = new ChromeDriver();
		// step 2:- access web app
		driver.get("https://demoapps.qspiders.com/");
		String actualDataUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		System.out.println(actualDataUrl);
		System.out.println(actualTitle);
		if (actualTitle.contains(exepctedTitle) && actualDataUrl.contains(expectedData)) {
			System.out.println("accessed deoapps successfully!!");
		} else {
			System.out.println("not accessed!!");
		}
		Thread.sleep(4000);
	//	driver.close();
	}
}
