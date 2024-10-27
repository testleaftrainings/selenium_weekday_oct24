package week3.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllTheLinksInAmazon {

	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(5000); //Java wait , Thread --> class from java and sleep is static method from Thread class
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//		for(int i=0; i<allLinks.size()-1; i++) {
//		String linkText = allLinks.get(i).getText();
//		System.out.println(linkText);
//		}
		
		//foreach --> enchanced for loop
		//syntax for(DataType localVariableName : collectionVaribaleName){}
		List<String> allLinkText = new ArrayList<String>();
		for(WebElement element: allLinks) {
			String text = element.getText();
			allLinkText.add(text);
		}
		
		System.out.println(allLinkText);
		
		
		 
	}
	
	
}
