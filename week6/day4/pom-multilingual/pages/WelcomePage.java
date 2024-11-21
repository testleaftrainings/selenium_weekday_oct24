package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{

	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyHome clickCrmsfa() {
		System.out.println("driver wel:"+driver);
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHome(driver);
	}
}
