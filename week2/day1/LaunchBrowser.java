package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//launch the browser
		
		//chrome driver--->chrome
		//edge driver--->edge
		//safaridriver--->safari
		
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver1=new EdgeDriver();
		//load the url
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the window
		driver.manage().window().maximize();
		
		//get the title of the current page
		String title = driver.getTitle();
		System.out.println(title);
		
		/**steps to interact with the web element
		 * step1:to locate an element(find the element in the dom)
		 * to locate an element--->findelement
		 * to type the value in input field--->sendkeys
		 * to click an element--->click
		 */
		//enter the username
		driver.findElement(By.id("username")).sendKeys("democsr");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click on the login 
		WebElement element = driver.findElement(By.className("decorativeSubmit"));
		element.click();
		//click on crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		
		
		
		
		
		
	}

}