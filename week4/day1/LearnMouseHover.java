package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		//locate the element
		WebElement mouseHover = driver.findElement(By.xpath("//span[text()='Prime']"));
		//instantiate the actins class
		Actions builder=new Actions(driver);
		//using the object call the methods
		builder.moveToElement(mouseHover).perform();
	}

}
