package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		//search phones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		//prices
		List<WebElement> allPrices= driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> list=new ArrayList<Integer>();
		
		for (WebElement each : allPrices) {
			String text = each.getText();
			//System.out.println(text);
			String replaceAll = text.replaceAll(",", "");
			int parseint = Integer.parseInt(replaceAll);
			//System.out.println(parseint);
			list.add(parseint);
			Collections.sort(list);
		}
		//sort the list
		
		//print the list
		System.out.println(list);
	}

}
