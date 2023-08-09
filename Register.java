package nopcommerce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Register {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("akshatha");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("ck");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("ck");
		WebElement dropdown =driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		Select sel=new Select(dropdown);
		Thread.sleep(1500);
		sel.selectByVisibleText("24");
		 Thread.sleep(1500);
	     WebElement down = driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
		 Select sel1=new Select(down);
		  sel1.selectByValue("1");
		  Thread.sleep(1500);
		  WebElement dropdw = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		   Select sel2=new Select(dropdw);
		  sel2.selectByValue("2000");
		  Thread.sleep(1500);
		  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("dd3764354@gmail.com");
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("akshatha");
			driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("akshatha");
			 Thread.sleep(1500);
			 driver.findElement(By.xpath("//button[@id='register-button']")).click();
			 
			
			
			

			
		  
		  
		  
		
		
		
		
		
	}

}
