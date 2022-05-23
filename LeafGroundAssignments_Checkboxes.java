package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignments_Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input[1]")).click();
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input[3]")).click();
		//driver.findElement(By.linkText("Java")).click();
		//Check selenium is selected
		Boolean ans=driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input")).isSelected();
		System.out.println("selenium is checked "+ans);
		//uncheck the selected checkbox
		List<WebElement> elements = driver.findElements(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input"));
		for (WebElement webElement : elements) {
			if(webElement.isSelected()==true)
			{
				webElement.click();
				System.out.println("checkbox is unselected");
				
			}
			
		}
		//select all checkbox
		List<WebElement> allSelect = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input"));
		 for (WebElement check : allSelect) {
		           check.click();		
             
		  }
		 System.out.println("all options are selected");
		 driver.close();
	}

}
