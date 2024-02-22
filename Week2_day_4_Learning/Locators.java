package Week2_day_4_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();// Load Page
		 driver.get("http://leaftaps.com/opentaps/control/main");// Maximize
			Thread.sleep(1000);//Wait
		 driver.manage().window().maximize();
			Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("DemoCSR");//Identifing element using locator
		Thread.sleep(1000);
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
			Thread.sleep(1000);
		 driver.findElement(By.className("decorativeSubmit")).click();
			Thread.sleep(1000);
		 driver.findElement(By.linkText("CRM/SFA")).click();
			Thread.sleep(1000);
		 String title = driver.getTitle(); //to verify the landingpage
		 System.out.println(title);
	}
}
