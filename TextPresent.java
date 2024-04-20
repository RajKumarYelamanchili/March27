package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextPresent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser6PMApril\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.cricbuzz.com");
		      String pageScr =  driver.getPageSource();
		     // System.out.println(pageScr);
		 boolean isTextPresent    =  pageScr.contains("football12345676");
		 
		 
		 
		 System.out.println("Cricket is present?: " + isTextPresent);
		      
		
	}

}
