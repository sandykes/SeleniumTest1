package oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
	    String text=driver.switchTo().alert().getText();
	    System.out.println(text);
	    driver.switchTo().alert().accept();
	   // driver.switchTo().alert().dismiss();
	   // driver.switchTo().alert().sendKeys("test12");
	    
		
	}

}
