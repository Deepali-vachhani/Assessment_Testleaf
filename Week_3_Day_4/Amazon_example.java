package Week_3_Day_4;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_example {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();
		   driver.manage().window().maximize();
		   driver.get("https://www.amazon.in");
//		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		       
		   WebElement a = driver.findElement(By.id("twotabsearchtextbox"));
		   a.sendKeys("mobiles");
		   a.submit();
		   //find the number of links
		   List<WebElement> prices= driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		   
		   //to find the size of the links in the webpage
		   System.out.println("The total no: of links:" +prices.size());
		   
		   //to retrive the second link from the webpage
		   System.out.println(prices.get(1).getText());
		   
		   List<Double> list = new ArrayList<>();
		   
		   //print all the prices
		   
		   for(int i=0; i<prices.size(); i++) {
			   String text = prices.get(i).getText();
			   String replaceString = text.replaceAll(",","");
			   //converting string to integer
			   double actPrice=Double.parseDouble(replaceString);
			   list.add(actPrice);
			   System.out.println(text);
		   }
		  
		   
		   //sort the moblie Prie
		   Collections.sort(list);
		   System.out.println(list);
		   System.out.println("The lowest price is"+list.get(0));
		   
	}

}
