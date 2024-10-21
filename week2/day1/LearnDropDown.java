package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver1=new EdgeDriver();
		//load the url
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the window
		driver.manage().window().maximize();
		
		//get the title of the current page
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//enter the username
		driver.findElement(By.id("username")).sendKeys("democsr");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click on the login 
		WebElement element = driver.findElement(By.className("decorativeSubmit"));
		element.click();
		//click on crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		/** steps to handle Drop down
		 * step 1:identify whether the element is present under select tag
		 * step2:if the dd is present inside the <select tag> then locate the element and store it in alocal variable
		 * step3:use select class and create an object.
		 * step4:webelement should be passed into the constructor asa an arguments
		 * 
		 * using the select class,there are 3 methods available to access the methods
		 *  	a)select by index
		 *  	b)select by visible text
		 *  	c)select by value
		 * 
		 * 
		 * 
		 * 
		 *///click on the leads
		driver.findElement(By.linkText("Leads")).click();
		//click on the create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//enter the firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		//enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		//click source dropdown
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//create an object for the select class
		Select sel=new Select(sourceDD);
		//saelect as conference
		sel.selectByIndex(2);
		
		//click the marketing campaign
		WebElement MC = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel2=new Select(MC );
		sel2.selectByVisibleText("Car and Driver");
		
		//click on industry
		WebElement IND = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel3=new Select(IND);
		sel3.selectByValue("IND_DISTRIBUTION");
		
	}

}
