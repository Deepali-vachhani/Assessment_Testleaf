package week_3_Assessment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Abhi_Bus {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();  
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        // Step 1: Launch the website
	        driver.get("https://www.abhibus.com/");        
	        driver.findElement(By.name("From Station")).sendKeys("Chennai");

	        // Step 2: Type "Chennai" in the FROM text box
	        WebElement fromTextBox = driver.findElement(By.id("source"));
	        fromTextBox.sendKeys("Chennai");
	        fromTextBox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

	        // Step 3: Type "Bangalore" in the TO text box
	        WebElement toTextBox = driver.findElement(By.id("destination"));
	        toTextBox.sendKeys("Bangalore");
	        toTextBox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

	        // Step 4: Select tomorrow's date in the Date field and click on search button
	        WebElement dateField = driver.findElement(By.id("datepicker1"));
	        dateField.sendKeys("tomorrow");

	        WebElement searchButton = driver.findElement(By.id("search_btn"));
	        searchButton.click();

	        // Step 5: Print the name of the first resulting bus
	        WebElement firstBus = driver.findElement(By.xpath("//div[@class='travels lh1']/a"));
	        System.out.println("First Bus Name: " + firstBus.getText());

	        // Step 6: Choose SLEEPER in the left menu from Bus Type
	        WebElement sleeperCheckbox = driver.findElement(By.xpath("//label[text()='SLEEPER']/input"));
	        sleeperCheckbox.click();

	        // Step 7: Print the first resulting bus seat count
	        WebElement firstBusSeatCount = driver.findElement(By.xpath("//div[@class='seats-available']/strong"));
	        System.out.println("First Bus Seat Count: " + firstBusSeatCount.getText());

	        // Step 8: Click Show Seats
	        WebElement showSeatsButton = driver.findElement(By.id("show_seats"));
	        showSeatsButton.click();

	        // Step 9: Choose any one Available seat
	        // (Assuming the seat selection involves some UI interactions, update this part based on your actual scenario)

	        // Step 10: Select the first resulting checkbox from the Boarding Point and Dropping Point
	        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	        checkboxes.get(0).click();

	        // Step 11: Print Seats Selected, Total Fare
	        WebElement seatsSelected = driver.findElement(By.id("selectedseats"));
	        WebElement totalFare = driver.findElement(By.id("totalfare"));
	        System.out.println("Seats Selected: " + seatsSelected.getText());
	        System.out.println("Total Fare: " + totalFare.getText());

	        // Step 12: Get the Title of the page
	        System.out.println("Page Title: " + driver.getTitle());

	        // Step 13: Close the browser
	        driver.quit();
	  }
}
