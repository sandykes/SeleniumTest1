package seleniumPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		/* Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'DEMO SITES')]"))).build().perform();
		driver.findElement(By.xpath("//*[contains(text(),'Basic Demo Site']")).click(); */
		
		driver.findElement(By.xpath("//*[@id='button1']")).click();
		System.out.println(driver.getTitle());
	Set<String>	ids=driver.getWindowHandles();
	java.util.Iterator<String> it= ids.iterator();
	String ParentId=it.next();
	String ChildId=it.next();
	driver.switchTo().window(ChildId);
	System.out.println(driver.getTitle());

	
	
	}

}
