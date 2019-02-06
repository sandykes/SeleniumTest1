package oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2EAmazonRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("redmi 6 pro mobile phone");
		//driver.findElement(By.xpath("//input[@value='Go']")).click();
		Select s= new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		s.selectByValue("search-alias=pantry");
		s.selectByIndex(3);
		s.selectByVisibleText("Appliances");
	}

}
