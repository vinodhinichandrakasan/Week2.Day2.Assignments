package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Assignments_HyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		//getTitle
		String title=driver.getTitle();
		System.out.println(title);
		//getCurrentUrl
	    System.out.println(driver.getCurrentUrl());
	    //get pagesource
	    System.out.println(driver.getPageSource());
	    driver.navigate().back();
	    System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
	    //driver.close();
	    driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
	    //get css attribute
	    System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
	    //get Text
	    driver.findElement(By.id("color")).getText();
	    //get location:
	    System.out.println(driver.findElement(By.id("position")).getLocation());
	    //getSize
	    WebElement size_val = driver.findElement(By.id("size"));
	    System.out.println(size_val.getSize());
	    //getTagName
	    System.out.println(size_val.getTagName());
	    //driver.close();
	    driver.navigate().back();
	    //check link is broken
	    WebElement link=driver.findElement(By.linkText("Verify am I broken?"));
	    link.click();
	    
	    System.out.println(driver.findElement(By.tagName("h1")).getText());
	    driver.navigate().to("http://leafground.com/pages/Link.html");
	    driver.findElement(By.xpath("//label[text()='(Interact with same link name)']/preceding-sibling::a")).click();
	    System.out.println("success");
	    driver.close();
		

	}

}
