package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod  {
	
	@Given("enter the company name as (.*)$")
	public CreateLead entercName(String cName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
	}
	@And("enter the firstname (.*)$")
	public CreateLead enterfName(String fName) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	@And ("enter the last name (.*)$")
	public CreateLead enterlName(String lName) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	
}
	@When("click on the create lead button")
	public ViewLeads clickSubmit() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeads();
	}
}
