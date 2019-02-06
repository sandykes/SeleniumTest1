package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowsAndColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println("Number of Rows are:");
		int Rowcount=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size());
		System.out.println("Number of columns are: ");
		int columncount= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();
		System.out.println(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size());
		
		//print 1 st column data
		
		String beforeXpath="//table[@id='customers']/tbody/tr[";
		String afterXapth="]/td[1]";
		for(int i=2;i<=Rowcount;i++)
		{
			
			WebElement element=driver.findElement(By.xpath(beforeXpath+i+afterXapth));
			System.out.println(element.getText());
		}
		//print all column names
		String ColubeforeXpath="//table[@id='customers']/tbody/tr[1]/th[";
		String ColuAfterXpath="]";
		
		for(int i=1;i<=columncount;i++)
		{
			WebElement element1=driver.findElement(By.xpath(ColubeforeXpath+i+ColuAfterXpath));
			 System.out.println(element1.getText());
			
			
		}
		
				
				

	}

}
