package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;

public class RunLogin extends ProjectSpecificMethod {
	@Test
	public void runLogin() {
		
		System.out.println("from r.l:"+driver);
			
			Login lp=new Login(driver);
			
			lp.enterUsername().enterPassword().clickLogin();
			
			
		}
}
