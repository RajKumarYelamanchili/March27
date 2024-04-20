package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser6PMApril\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		//driver.findElement(By.name("email")).sendKeys("rahul@dravid.com");
		//driver.findElement(By.id("email")).sendKeys("virat@kohli.com");
		//driver.close();
		//driver.findElement(By.linkText("Create a Page")).click();
		//driver.findElement(By.partialLinkText("reate a Pag")).click();
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@xyz.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@pqr.com");
		
		


	}

}
