package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
      public static ChromeDriver driver;
      @BeforeMethod
	public void preCondition() {
		 driver=new ChromeDriver();
		 System.out.println("beforemethod:"+driver);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
		
	}
}
