package Week_2_day_5_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Training {
	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.leafground.com/select.xhtml");
		 driver.manage().window().maximize();	 
		 WebElement dropdown=driver.findElement(By.className("ui-selectonemenu"));		 
		 Select dd=new Select(dropdown);		
//		 dd.selectByIndex(1);
//		 dd.selectByValue(null);
		 
//		 dd.selectByVisibleText("Playwright");
		 dd.selectByIndex(4);
		 Thread.sleep(2000);		 
	}
}
