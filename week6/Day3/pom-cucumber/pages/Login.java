package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login extends ProjectSpecificMethod {
	
	@Given ("enter the username as {string}")
	public Login enterUsername(String uName) {
		
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
	}
	@And ("enter the password as {string}")
	public Login enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
		return this;
	}
	@When( "click on login button")
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
