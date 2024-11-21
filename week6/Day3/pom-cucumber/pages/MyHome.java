package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.And;

public class MyHome extends ProjectSpecificMethod {
	@And( "click on leads link")
	public MyLeads clickLeadsLink() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeads();
	}
	
}
