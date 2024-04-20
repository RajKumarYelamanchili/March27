package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownWithMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser6PMApril\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
	WebElement dropdown2	= driver.findElement(By.xpath("//select[@name='Month']"));
	if (dropdown2.isEnabled()  && dropdown2.isDisplayed())
	{
		System.out.println("Dropdown is enabled and displayed");
	}
	else
	{
		System.out.println("Dropdown is either not enabled or not displayed");
	}
	
	
	Select sel = new Select(dropdown2);
	  if(sel.isMultiple())
	  {
		  System.out.println("drop down supports multiple options selection");
	  }
	  else
	  {
		  System.out.println("drop down does not support multiple options selection");
	  }
	  
	  sel.selectByIndex(6);
	  Thread.sleep(2000);
	  sel.selectByVisibleText("March");
	  Thread.sleep(2000);
	  sel.selectByValue("Nov");
	  Thread.sleep(2000);
	  
	  
	 if (sel.getAllSelectedOptions().size()==3)
	 {
		 System.out.println("3 options are chosen");
	 }
	 else
	 {
		 System.out.println("3 options are NOT chosen");
	 }

	// sel.deselectAll();
	 
	 sel.deselectByIndex(11);
	 Thread.sleep(2000);
	 sel.deselectByValue("Ma");
	 Thread.sleep(2000);
	 sel.deselectByVisibleText("June");
	 Thread.sleep(2000);
	 
	}

}
