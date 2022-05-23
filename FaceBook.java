package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("data");
		driver.findElement(By.xpath("//div[contains(text(),'Mobile number')]/following-sibling::input")).sendKeys("8623678920");
		driver.findElement(By.id("password_step_input")).sendKeys("Danani");
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select day=new Select(ele1);
		day.selectByValue("22");
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(ele2);
		month.selectByVisibleText("Jun");
		WebElement ele3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(ele3);
		year.selectByValue("1997");
		driver.findElement(By.xpath("//label[contains(text(),'Fema')]/following-sibling::input")).click();
		

	}

}
