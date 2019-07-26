import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	@org.testng.annotations.Test
	public void test()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SumitKumar\\eclipse-workspace\\Sumit_Workspace\\GITARTIFACT\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
	}
	
}
