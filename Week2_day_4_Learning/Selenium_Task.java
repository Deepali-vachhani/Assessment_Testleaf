package Week2_day_4_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Task {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		 //load the application in the browser
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 //maximize the application
//		 driver.manage().window().maximize();
		 //identifying the elements
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 //NoSuchelement
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
//		 String title = driver.getTitle(); //to verify the landingpage
//		 System.out.println(title);
	}
}
