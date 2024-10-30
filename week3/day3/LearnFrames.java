package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		/**
		 * check1--->no such element exception--->element location
		 * check2---->wait stmt
		 * check3---->element is inside the frame
		 */
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		//switch over the frame
		driver.switchTo().frame(0);//index starts from 0
		//click
		driver.findElement(By.id("Click")).click();
	}

}
