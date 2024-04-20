package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownWithoutMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser6PMApril\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
	WebElement dropdown1	= driver.findElement(By.xpath("//select[@name='country']"));
	if (dropdown1.isEnabled()  && dropdown1.isDisplayed())
	{
		System.out.println("Dropdown is enabled and displayed");
	}
	else
	{
		System.out.println("Dropdown is either not enabled or not displayed");
	}
	
	
	Select sel = new Select(dropdown1);
	  if(sel.isMultiple())
	  {
		  System.out.println("drop down supports multiple options selection");
	  }
	  else
	  {
		  System.out.println("drop down does not support multiple options selection");
	  }
	  
	  int lstSize = sel.getOptions().size();
	  System.out.println("Number of countries: " + lstSize);
	  
	  sel.selectByIndex(9);
	 String country1=  sel.getFirstSelectedOption().getText();
	 System.out.println("Country chosen: " + country1);
	 Thread.sleep(2000);
	 
	 sel.selectByValue("IN");
	String country2= sel.getFirstSelectedOption().getText();
	System.out.println("Country chosen: " + country2);
	Thread.sleep(2000);
	
	sel.selectByVisibleText("United States of America");
	
	String country3= sel.getFirstSelectedOption().getText();
	System.out.println("Country chosen: " + country3);
	Thread.sleep(2000);
	
}
	
}


