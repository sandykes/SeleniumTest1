package seleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20138/sl-vs-eng-5th-odi-england-tour-of-sri-lanka-2018");
		driver.manage().window().maximize();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D://SanyScreenshot.png"));
	  WebElement Table=  driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	  List<WebElement> rows= Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
	int count=rows.size();
	System.out.println(count);
	
	
for(int i=0;i<count-2;i++)
{
	System.out.println(rows.get(i).getText());
	String value=rows.get(i).getText();
	Integer number=Integer.parseInt(value);
	sum=sum+number;
}
String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();

Integer ExtrasValue=Integer.parseInt(Extras);
System.out.println(ExtrasValue);
int TotalSum=sum+ExtrasValue;
System.out.println(TotalSum);

System.out.println(TotalSum);
String Actual=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
Integer ActualValue=Integer.parseInt(Actual);
System.out.println(ActualValue);
if(ActualValue==TotalSum)
{
	System.out.println("Total is matched");
}

	}

}
