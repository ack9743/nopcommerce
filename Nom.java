package nomcommertestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Nom
{
	WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
       
    }

    @Test(priority = 1)
    public void register() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("ck");
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("akshatha");
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("24");
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
    			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9019622876");
    			driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("9019622876");
    			 Thread.sleep(1500);
    			 driver.findElement(By.xpath("//button[@id='register-button']")).click();
    }
    @Test(priority = 2)
    public void login()
    {
    			 driver.findElement(By.xpath("//a[text()='Log in']")).click();  
    				driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("dd3764354@gmail.com");
    				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9019622876");
    				driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();;
    }
@Test(priority = 3)

	public void addtocart() throws InterruptedException 
	{
	 driver.findElement(By.xpath("(//a[@href='/computers'])[1]")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//img[@alt='Picture for category Notebooks']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//img[@alt='Picture of Apple MacBook Pro 13-inch']")).click();
     Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.findElement(By.xpath("//a[@class='ico-cart']")).click();
    
}
@Test(priority = 4)
public void placingorder()
{
	driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
    driver.findElement(By.xpath("//button[@id='checkout']")).click();
}
@Test(priority = 5)
public void address() throws InterruptedException 
{
	WebElement drop =driver.findElement(By.xpath("//select[@data-trigger='country-select']"));
	Select sel21=new Select(drop);
	Thread.sleep(1500);
	 sel21.selectByValue("133");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("banglore");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("rajajinagar ");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("banglore");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//input[@id='BillingNewAddress_PhoneNumber'])")).sendKeys("9019622876");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
}
	 @Test(priority = 6)
	 public void shipping() throws InterruptedException 
	 {
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@onclick='ShippingMethod.save()']")).click();
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@onclick='PaymentMethod.save()']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
     JavascriptExecutor js6=(JavascriptExecutor) driver;
	 js6.executeScript("window.scrollBy(0,1000)");
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();
}
	
	
}
	
	
		  
			
	  


