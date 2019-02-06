package seleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	List<WebElement> links=	driver.findElements(By.tagName("a"));
	
	int count=links.size();
	System.out.println("Number of links in the page are :"+count);
	
		
	List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
     System.out.println(checkboxes.size());
	for(int i=0;i<=checkboxes.size()-1;i++)
	{
		System.out.println(checkboxes.get(i).getText());
	}
	
	System.out.println("loop webElemnent\n");
	for (WebElement webElement : checkboxes) {
		 webElement.sendKeys(Keys.SPACE);
		System.out.println(webElement.getAttribute("value") );
		//System.out.println(webElement.getText());
	}
	
	
	//Number of dropdown
	
System.out.println(driver.findElements(By.tagName("Select")).size());
//Number of textboxes

System.out.println(driver.findElements(By.xpath("//input[@type='text']")).size());
	
	
	
	
	}
	
	

}
