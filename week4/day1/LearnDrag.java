package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDrag {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/draggable/");
		//switch the frame
		driver.switchTo().frame(0);
		//locate the element
		WebElement drag = driver.findElement(By.id("draggable"));
		//Action class
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag, 40, 60).perform();//method 1
		/*
		 * Point location = drag.getLocation();//method 2 int x = location.getX(); int y
		 * = location.getY(); act.dragAndDropBy(drag, x, y).perform();
		 */
		

	}

}
