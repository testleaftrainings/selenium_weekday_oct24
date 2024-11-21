package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import config.ConfigurationManager;

public class MyLeads extends ProjectSpecificMethod {
	public MyLeads(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLead clickCreateLead() {
		driver.findElement(By.partialLinkText(ConfigurationManager.configuration().createleadlink())).click();
		return new CreateLead(driver);
	}
}
