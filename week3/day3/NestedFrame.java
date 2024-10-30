package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		//switch to the parent frame
		WebElement parentframe = driver.findElement(By.xpath("//h5[contains (text(),'Click Me (Inside Nested frame)')]/following::iframe"));
		driver.switchTo().frame(parentframe);
		//switch to child frame
		driver.switchTo().frame("frame2");
		//click
		driver.findElement(By.id("Click")).click();
		
		//default content--->come out of all the frames and switch back to the main page
		//parent frame--->switch back to the immediate frame
		//exceptions
		//1.no such element exception
		//2.no such frame exception

	}

}
