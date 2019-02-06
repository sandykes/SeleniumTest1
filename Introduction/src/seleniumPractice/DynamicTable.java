package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\surya\\eclipse-SandyWorksapce\\Introduction\\src\\seleniumPractice\\dataset1.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("UserName"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("Pwd"));
		driver.findElement(By.xpath("//input[@value='Login']")).submit();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		
	}

}
