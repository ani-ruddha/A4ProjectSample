package com.Ecom.Falcon;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
public class ResizeAndRelocationOfWindow {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// resize
		// driver.manage().window().setSize(new Dimension(300, 400));
		Dimension d = new Dimension(300, 400);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		// relocate
		// driver.manage().window().setPosition(new Point(100, 200));
		Point p = new Point(100, 200);
		driver.manage().window().setPosition(p);
		
		driver.close();
	}
}
