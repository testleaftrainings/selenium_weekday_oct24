package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class Login extends ProjectSpecificMethod {
	public void enterUsername() {
		System.out.println("lp:"+driver);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
}
