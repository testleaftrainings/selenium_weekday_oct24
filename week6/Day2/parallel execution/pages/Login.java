package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class Login extends ProjectSpecificMethod {
	
	public  Login(ChromeDriver driver) {
		this.driver=driver;
	}
	public Login enterUsername() {
		System.out.println("lp:"+driver);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		/*
		 * Login lp=new Login(); return lp;
		 */
		return this;
	}
	public Login enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
}
