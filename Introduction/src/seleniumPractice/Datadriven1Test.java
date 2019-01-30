package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Datadriven1Test {
	
	
	public WebDriver driver=null;
  @Test
  public void propertiestest() throws IOException, InterruptedException {
	  
	  Properties prop=new Properties();
	  FileInputStream fis = new FileInputStream("C:\\Users\\surya\\eclipse-SandyWorksapce\\Introduction\\src\\seleniumPractice\\dataset1.properties");
	  prop.load(fis);
	
	  if (prop.getProperty("Browser").equalsIgnoreCase("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		  driver= new ChromeDriver();
		 // driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		  driver.get(prop.getProperty("url"));
		  
		 System.out.println( driver.getTitle());
		 Select s=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']")));
		 List<WebElement> ele=s.getOptions();
		 int optionscount=ele.size();
		 System.out.println(optionscount);
		 for(int i=0;i<optionscount;i++)
		 {
			 
			 if(ele.get(i).getText().equalsIgnoreCase("Amritsar (ATQ)"))
			 {
				 System.out.println("Amrisar is present");
			 }
			 
		 }
		 
		 
	  }
	  
	  else if(prop.getProperty("Browser").contains("Firefox"))
	  {
		   driver = new FirefoxDriver();
	  }
	  
  }
}
