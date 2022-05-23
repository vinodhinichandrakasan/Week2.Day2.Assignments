package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 //7	Click Find leads
		 driver.findElement(By.linkText("Find Leads")).click();
		 //Click on Phone
		 driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[contains(text(),'Phone')]")).click();
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8610783341");
		 driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[@class='x-btn-text' and text()='Find Leads']")).click();
		 //
		 Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//*[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		 String leadnum=ele.getText();
		 System.out.println(leadnum);
		 ele.click();
		 driver.findElement(By.className("subMenuButtonDangerous")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.name("id")).sendKeys(leadnum);
		 driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[@class='x-btn-text' and text()='Find Leads']")).click();
		 Thread.sleep(2000);
		 WebElement ele2 = driver.findElement(By.xpath("//*[@class='x-paging-info' and text()='No records to display']"));
		 String data=ele2.getText();
		 System.out.println(data);
		 Assert.assertEquals("No records to display",data);
		// Assert.assertEquals(data, "")
		 
		 driver.close();
		 
		 
		

	}

}
