package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		//locate the element
		WebElement sD = driver.findElement(By.xpath("//span[contains(text(),'Amazon.com')]"));
		//INSTANTIATE ACTIONS CLASS
		Actions act=new Actions(driver);
		act.scrollToElement(sD).perform();
		String text = sD.getText();
		System.out.println(text);
	}

}
