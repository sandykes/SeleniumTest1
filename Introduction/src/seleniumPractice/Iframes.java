package seleniumPractice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	List<WebElement>iframes=driver.findElements(By.tagName("iframe"));
	int  count=iframes.size();
	System.out.println(count);
	
	for(int i=0;i<count;i++)
	{
		driver.switchTo().frame(i);
	if(driver.findElement(By.xpath("//a[text()='Hello world!']"))!=null)
	   {
		   driver.switchTo().frame(i);
		   driver.findElement(By.xpath("//*[text()='Hello world!']")).click();
		   driver.findElement(By.cssSelector("input#author.form-control")).sendKeys("sandy");
		   break;  
	   }
	
	else
	{
		System.out.println("Keep looping");
	}
	}
	   driver.switchTo().defaultContent();
	
	}
	
	}


