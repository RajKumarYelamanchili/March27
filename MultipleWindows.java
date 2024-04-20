package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser6PMApril\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);
		
		  String parentWindow = driver.getWindowHandle();
		  System.out.println("Parent window: " + parentWindow);
		  Thread.sleep(2000);
		  
		  Set<String> allWindows =   driver.getWindowHandles();
		
		 Iterator<String>  itr = allWindows.iterator();
		     itr.next();
		   String childWindow =   itr.next();
		   System.out.println("Child Window: " + childWindow);
		
		
		driver.switchTo().window(childWindow);
		  String text1= driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		  System.out.println(text1);
		  Thread.sleep(2000);
		 // driver.close();
		
		  
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		
		 String btnTxt= driver.findElement(By.xpath("//button[text()='Button2']")).getText();
		  System.out.println(btnTxt);
		  Thread.sleep(2000);
		  //driver.close();
		  driver.quit();
		  
		  
		
		
		
	

	}

}
