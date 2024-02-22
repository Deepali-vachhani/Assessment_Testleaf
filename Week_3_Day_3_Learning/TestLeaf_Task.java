package Week_3_Day_3_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf_Task {
	public static void main(String[] args)throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        Thread.sleep(2000);  
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        Thread.sleep(2000);
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();   
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("GroupsoftUS");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Deepali");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Patel");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Deepali");
        driver.findElement(By.name("departmentName")).sendKeys("QA-Tester");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.cssSelector("textarea[name='importantNote']")).sendKeys("This is Important Note");
        driver.findElement(By.name("submitButton")).click();
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.quit();
    }
}