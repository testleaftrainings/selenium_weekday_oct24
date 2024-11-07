package testng;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass {
	@DataProvider
	public String[][] sendData() {
		
		String[][] data=new String[2][3];
		//ist data
		data[0][0]="Testleaf";
		data[0][1]="saranya";
		data[0][2]="s";
		//2nd data
		data[1][0]="Testleaf";
		data[1][1]="Hari";
		data[1][2]="R";
		
		return data;
		
	}
	

	
	@Test(dataProvider="sendData")
	public void runCreateLead(String cName,String fName,String lName) {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
}






