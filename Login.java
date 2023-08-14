package nopcommerce;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("akshatha");
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
		  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("   ");
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9019622876");
			driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("9019622876");
			 Thread.sleep(1500);
			 driver.findElement(By.xpath("//button[@id='register-button']")).click();
			 
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();  
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("dd3764354@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9019622876");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();;
		
		
		//selecting the product
        driver.findElement(By.xpath("(//a[@href='/computers'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt='Picture for category Notebooks']")).click();
        Thread.sleep(2000);
        JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        Thread.sleep(2000);
        JavascriptExecutor js4=(JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[@class='ico-cart']")).click();
        Thread.sleep(2000);
        JavascriptExecutor js3=(JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
       
        
        
        
        //confirming order
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
