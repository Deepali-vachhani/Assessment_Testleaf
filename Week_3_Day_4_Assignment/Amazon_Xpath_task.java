package Week_3_Day_4_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Xpath_task {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();
		   driver.manage().window().maximize();
		   driver.get("https://www.amazon.in/");
//		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   WebElement a = driver.findElement(By.id("twotabsearchtextbox"));
		   a.sendKeys("Bags for boys");
		   a.submit();
		    driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		    WebElement b = driver.findElement(By.xpath("//span[@class='a-section a-spacing-small a-spacing-top-small']"));
		    String c = b.getText();
		    System.out.println(c);
		    WebElement d = driver.findElement(By.className("a-size-base a-color-base puis-bold-weight-text"));
	        Select s = new Select(d);
	        s.selectByVisibleText("Skybags");
	        s.selectByVisibleText("American Tourister");
	}
}
