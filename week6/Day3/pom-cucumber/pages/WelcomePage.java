package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class WelcomePage extends ProjectSpecificMethod{

	@When ("click on crmsfa link")
	public MyHome clickCrmsfa() {
		System.out.println("driver wel:"+driver);
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHome();
	}
}
