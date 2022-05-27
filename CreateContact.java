package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("http://leaftaps.com/opentaps/control/login");
	      driver.manage().window().maximize();
	      WebElement eleUserName = driver.findElement(By.xpath("//input[@id='username']"));
	      eleUserName.sendKeys("DemoSalesManager");
	      driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("crmsfa");
	      driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	      driver.findElement(By.linkText("CRM/SFA")).click();
	      driver.findElement(By.linkText("Contacts")).click();
	      driver.findElement(By.linkText("Create Contact")).click();
	      driver.findElement(By.id("firstNameField")).sendKeys("Preetha");
	      driver.findElement(By.id("lastNameField")).sendKeys("M");
	      driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Local Name");
	      driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Local Name");
	      driver.findElement(By.id("createContactForm_departmentName")).sendKeys("core department");
	      driver.findElement(By.id("createContactForm_description")).sendKeys("Grow With Test Leaf");
	      driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("preethamahadevan1997@gmail.com");
	      WebElement dtSource = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	      Select data = new Select(dtSource);
	      data.selectByVisibleText("New York");
	      driver.findElement(By.name("submitButton")).click();
	      driver.findElement(By.linkText("Edit")).click();
	      driver.findElement(By.id("updateContactForm_description")).clear();
	      driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Most important to use Test Leaf");
	      driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	      System.out.println("The title is :"+ driver.getTitle());
	      driver.close();
	      
	      
	      
	      
	      
	      
	      
	     
		
		
	}

	
}
