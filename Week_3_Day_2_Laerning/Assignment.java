package Week_3_Day_2_Laerning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();
		   driver.manage().window().maximize();
		   driver.get("https://www.amazon.in/");
//		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		   
		    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys", Keys.ENTER);
		    driver.findElement(By.xpath("//span[contains(text(),'results for')]"));	      
		    WebElement b = driver.findElement(By.xpath("//span[@class='a-section a-spacing-small a-spacing-top-small']"));
		    String c = b.getText();
		    System.out.println(c);
		    WebElement brand1 = driver.findElement(By.xpath("//*[@id=\"p_89/American Tourister\"]/span/a/div/label/i"));
	        WebElement brand2 = driver.findElement(By.xpath("//*[@id=\"p_89/Skybags\"]/span/a/span"));
	        brand1.click();
	        brand2.click();
	        WebElement p = driver.findElement(By.id("s-result-sort-select"));
	        p.click();
	        WebElement q = driver.findElement(By.xpath("//a[text()='New Arrivals']"));
	        q.click();		      
	        WebElement firstResult = driver.findElement(By.xpath("//div[@data-asin and @data-index='0']"));
	        String itemName = firstResult.findElement(By.xpath(".//span[@class='a-text-normal']")).getText();
	        String itemPrice = firstResult.findElement(By.xpath(".//span[@class='a-price']")).getText();
	        System.out.println( itemName);
	        System.out.println( itemPrice);
	        String pageTitle = driver.getTitle();
	        System.out.println( pageTitle);	      
	        driver.close();
		    }
	}
