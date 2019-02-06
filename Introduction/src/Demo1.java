import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("sandy@gmail.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("test001");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
	}

}
