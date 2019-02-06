package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		WebElement Table=driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		List<WebElement> rows=Table.findElements(By.tagName("tr"));

          int rowcount=rows.size();
          System.out.println("Number of rows:"+rowcount);
          for(int i=0;i<rowcount;i++)
          {
        	  List<WebElement> colums=rows.get(i).findElements(By.tagName("th"));
        	  
        	  System.out.println(colums.size());
        	  int colunmsCount=colums.size();
        	  for(int j=0;j<colunmsCount;j++)
        	  {
        		  System.out.println(colums.get(j).getText());
        		  
        		 if(colums.get(j).getText().equals("Country"))
{
        		List<WebElement> columsData=colums.get(j).findElements(By.tagName("tr"));
        		for(int y=0;j<columsData.size();y++)
        		{
        			System.out.println(columsData.get(y).getText());
        		}
}
}
	

                 }

        	  }
          }
          
	


