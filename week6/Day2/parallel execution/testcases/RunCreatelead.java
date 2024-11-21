package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;
import pages.WelcomePage;

public class RunCreatelead extends ProjectSpecificMethod {
	@Test
	public void runCL() {
	System.out.println("from c.l:"+driver);
		
		Login lp=new Login(driver);
		
		lp.enterUsername().enterPassword().clickLogin().clickCrmsfa();
		
		
	}

}
