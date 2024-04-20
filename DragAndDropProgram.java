package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser6PMApril\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(2000);
       WebElement frame1=  driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
       driver.switchTo().frame(frame1);
       Thread.sleep(2000);
       WebElement drag= driver.findElement(By.id("draggable"));
       WebElement drop= driver.findElement(By.id("droppable"));
       Thread.sleep(2000);
       Actions act = new Actions
    		   (driver);
               act.dragAndDrop(drag, drop).perform();
		
		
		
	
	}

}
