package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;

public class RunCreatelead extends ProjectSpecificMethod {
	@BeforeTest
	public void setValues() {
		fileName="Createlead";
	}
	@Test(dataProvider="sendData")
	public void runCL(String uName,String pWord,String cName,String fName,String lName) {
	System.out.println("from c.l:"+driver);
		
		Login lp=new Login(driver);
		
		lp.enterUsername(uName).enterPassword(pWord).clickLogin().clickCrmsfa().clickLeadsLink().clickCreateLead().
		entercName(cName).enterfName(fName).enterlName(lName).clickSubmit();
		
		
		
	}

}
