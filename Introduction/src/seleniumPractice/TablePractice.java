package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.yelp.com/");
		driver.findElement(By.xpath("//input[@id='find_desc']")).sendKeys("Re"+Keys.ARROW_DOWN);
		
		
		
		
		
		
		
		
		
		
		
		/*driver.get("http://toolsqa.com/automation-practice-table/");
		String value=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
	System.out.println(value);
	driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]")).click();
	
	
	String beforeXpath="//*[@id='content']/table/tbody/tr[";
	String afterXpath="]/td[1]";
	for(int i=1;i<=4;i++)
	{
		
		String actualXpath=beforeXpath+i+afterXpath;
		
		String data= driver.findElement(By.xpath(actualXpath)).getText();
		System.out.println(data);
	
	}
	}*/
	
}
}

