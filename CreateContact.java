package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				//1. Launch URL "http://leaftaps.com/opentaps/control/login"
			    driver.get("http://leaftaps.com/opentaps/control/login");
				//2. Enter UserName and Password Using Id Locator
			    driver.manage().window().maximize();
				 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				 driver.findElement(By.id("password")).sendKeys("crmsfa");
				 // 3. Click on Login Button using Class Locator
				 driver.findElement(By.className("decorativeSubmit")).click();
				 //4. Click on CRM/SFA Link
				 driver.findElement(By.linkText("CRM/SFA")).click();
				 // 5.Click on contacts Button
				 driver.findElement(By.linkText("Contacts")).click();
				 //6. Click on Create Contact
				 driver.findElement(By.linkText("Create Contact")).click();
				 //7. Enter FirstName Field Using id Locator
				 driver.findElement(By.id("firstNameField")).sendKeys("Vino");
				 //8. Enter LastName Field Using id Locator
				 driver.findElement(By.id("lastNameField")).sendKeys("Chan");
				 // 9. Enter FirstName(Local) Field Using id Locator
				 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("vinod");
				 //10. Enter LastName(Local) Field Locator
				 driver.findElement(By.name("lastNameLocal")).sendKeys("c");
				 //11. Enter Department Field Using any Locator of Your Choice
				 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("testing");
				 //12. Enter Description Field Using any Locator of your choice 
				 driver.findElement(By.xpath("//*[@name='description']")).sendKeys("data has been added");
				 //13. Enter your email in the E-mail address Field using the locator of your choice
				 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("vinodhinichandrakasan@gmail.com");
				 WebElement ele1 = driver.findElement(By.name("generalStateProvinceGeoId"));
				 Select city=new Select(ele1);
				 city.selectByVisibleText("New York");
				 driver.findElement(By.className("smallSubmit")).click();
				 driver.findElement(By.linkText("Edit")).click();
				 driver.findElement(By.id("updateContactForm_description")).clear();
				 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("New test notes are added");
				 
				 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				 
				 //* 20. Get the Title of Resulting Page.
				   System.out.println(driver.getTitle());
				   
				   driver.close();
				 
				 
				
				 
				
			}

		

	}


