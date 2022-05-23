package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 //7	Click Find leads
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//span[@class='x-tab-strip-text ' and text()='Email']")).click();
		 driver.findElement(By.name("emailAddress")).sendKeys("vinodhinichandrakasan@gmail.com");
		 driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[@class='x-btn-text' and text()='Find Leads']")).click();
		 Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));//x-grid3-cell-inner x-grid3-col-firstName
		 String leadnum=ele.getText();
		 System.out.println(leadnum);
		 ele.click();
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 String title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		 System.out.println(title);
		 Assert.assertEquals(title,"Duplicate Lead");
		 driver.close();
		 
	}

}
