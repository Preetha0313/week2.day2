package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uipath {

	public static void main(String[] args) throws InterruptedException {

		
		 WebDriverManager.chromedriver().setup();
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://acme-test.uipath.com/login");
	      driver.manage().window().maximize();
	      WebElement eleUserName = driver.findElement(By.xpath("//input[@id='email']"));
	      eleUserName.sendKeys("kumar.testleaf@gmail.com");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("leaf@12");
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     Thread.sleep(2000);
	      System.out.println("The title is :"+ driver.getTitle());
	      driver.findElement(By.linkText("Log Out"));
	      driver.close();

	     
	}

}
