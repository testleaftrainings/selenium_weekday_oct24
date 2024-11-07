package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitwait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/waits.xhtml");
		//instantiate WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//use the condns
		WebElement firstEle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
		firstEle.click();
		
		//visiblity
		WebElement visible = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		boolean click = visible.isDisplayed();
		System.out.println(click);
		
		/*
		 * //invisiblity WebElement invis =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "(//span[text()='Click'])[2]"))); invis.click(); Boolean until =
		 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.
		 * xpath("//span[text()='I am about to hide']"))); System.out.println(until);
		 */
		WebElement invis = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
		invis.click();
		
		
		
			}

}
