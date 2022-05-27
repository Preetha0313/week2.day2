package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup();
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("http://en-gb.facebook.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.findElement(By.xpath("//div[@class='_6ltg']/a[@role='button']")).click();
	      driver.findElement(By.name("firstname")).sendKeys("Preetha");
	      driver.findElement(By.name("lastname")).sendKeys("M");
          driver.findElement(By.name("reg_email__")).sendKeys("9629046728");
	      driver.findElement(By.id("password_step_input")).sendKeys("core@123");
	      driver.findElement(By.id("day")).sendKeys("20");
	      driver.findElement(By.id("month")).sendKeys("Aug");
	      driver.findElement(By.id("year")).sendKeys("1999");
          driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[@class='_8esa']")).click();
	      }

}
