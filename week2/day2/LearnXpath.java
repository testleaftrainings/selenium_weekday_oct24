package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

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
		//enter the usernam
		driver.findElement(By.xpath("(/input [class= 'inputLogin'])[1]")).sendKeys("democsr");
		//enter the password
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		//login
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();

	}

}
