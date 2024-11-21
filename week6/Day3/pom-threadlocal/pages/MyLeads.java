package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.And;

public class MyLeads extends ProjectSpecificMethod {
	@And ("click on createlink lead")
	public CreateLead clickCreateLead() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLead();
	}
}
