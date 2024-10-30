package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		//simple Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		//switch the driver focus to the alert box
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//accept
		alert.accept();
		
		//confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		
		
		
		//sweet alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		//driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		//prompt Alert
				driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
				alert.sendKeys("testleaf");
				alert.accept();
				//System.out.println(alert.getText());
	}

}
