package seleniumPractice;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.net.URL;

	public class Saucelabtest  {

	  public static final String USERNAME = "rayudu";
	  public static final String ACCESS_KEY = "have to change this";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	  public static void main(String[] args) throws Exception {

	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 10");
	    caps.setCapability("version", "latest");
	    //WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    /**
	     * Goes to Sauce Lab's guinea-pig page and prints title
	     */

	    //driver.get("https://saucelabs.com/test/guinea-pig");
		//https://www.yelp.com/search?find_desc=pizza&find_loc=Charlotte%2C%20NC
		String desc="PIZZA";
		String loc="Charlotte, C";
		String url="https://www.yelp.com/search?find_desc="+desc+"&find_loc="+loc;
		driver.get(url);
		String str_xpath="//*[@id='wrap']/div[2]/div[1]/div/div[2]/div/div[1]/div/span";

		 // ---"//*[@id='wrap']/div[3]/div[2]/div[1]/div/div/div[1]/p";
		
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
			}
		//*[@id="wrap"]/div[3]/div[2]/div[1]/div/div/div[1]/p
		
	    WebElement element=driver.findElement(By.xpath(str_xpath));
	    System.out.println("Search Results : " + element.getText());
		driver.quit();
	  }
	}

