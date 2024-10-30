package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		//to get the address of the current window
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);//66F1123108959C218794D3F7CE16ECC2
		//title of the parent
		System.out.println(driver.getTitle());
		//click open
		WebElement element = driver.findElement(By.xpath("//span[text()='Open']"));
		element.click();
		//get all the windows
		Set<String> windowHandles = driver.getWindowHandles();
		//convert set into list
		List<String> childwindow=new ArrayList<String>(windowHandles);
		//navigate to child window
		driver.switchTo().window(childwindow.get(1));
		//address of the child window
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		//title of the child
		System.out.println(driver.getTitle());
		driver.close();//close the current window
		//driver.switchTo().window(childwindow.get(1));
		driver.quit();//close all the opened windows
		
		
		//Exceptions
		//1.No such window exception----ther is no window and we are trying to handle it
		
		
		
		


	}

}
