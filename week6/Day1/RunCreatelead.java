package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;
import pages.WelcomePage;

public class RunCreatelead extends ProjectSpecificMethod {
	@Test
	public void runCL() {
	System.out.println(driver);
		
		Login lp=new Login();
		
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLogin();
		
		WelcomePage wp=new WelcomePage();
		wp.clickCrmsfa();
	}

}
