package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@text='Kolkata (CCU)']")).click();
		driver.findElement(By.xpath("(//a[@text='Varanasi (VNS)'])[2]")).click();
	WebElement element=	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
	element.click();
		boolean result=element.isSelected();
		System.out.println(result);
		WebElement radio2=driver.findElement(By.id("ctl00_mainContent_chk_IndArm"));
		boolean result2=radio2.isSelected();
		System.out.println(result2);
	}

}
