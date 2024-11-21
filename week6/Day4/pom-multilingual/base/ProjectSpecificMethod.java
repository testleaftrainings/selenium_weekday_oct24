package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import config.ConfigurationManager;
import utils.ReadExcelIntegration;

public class ProjectSpecificMethod {
      public  ChromeDriver driver;
      public String fileName;
      @BeforeMethod
	public void preCondition() {
		 driver=new ChromeDriver();
		 System.out.println("beforemethod:"+driver);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		int time = ConfigurationManager.configuration().getTimeout();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
		
	}
	@DataProvider
	public String[][] sendData() throws IOException{
		return ReadExcelIntegration.readExcel(fileName);
	}
}
