package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;

public class RunLogin extends ProjectSpecificMethod {
	@BeforeTest
	public void setValues() {
		fileName="login";
	}
	@Test(dataProvider="sendData")
	public void runLogin(String uName,String pWord) {
		
		System.out.println("from r.l:"+driver);
			
			Login lp=new Login(driver);
			
			lp.enterUsername(uName).enterPassword(pWord).clickLogin();
			
			
		}
}
