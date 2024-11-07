package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		//locate the table
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
		//print the row count
		/*
		 * List<WebElement> rowCount = driver.findElements(By.
		 * xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr"
		 * )); int size = rowCount.size(); System.out.println("row size is:"+size);
		 */
		List<WebElement> row = table.findElements(By.tagName("tr"));
		int size2 = row.size();
		System.out.println(size2);
		//print the column count
		List<WebElement> columnCount = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//th"));
		int colSize = columnCount.size();
		System.out.println(colSize);
		
		//retrieve a particular data
		String text = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[3]/td[3]")).getText();
		System.out.println(text);
		
		//print the datas for the entire row
		List<WebElement> singleRow = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[3]/td"));
		for (WebElement rowIer : singleRow) {
			System.out.println(rowIer.getText());
			System.out.println("----------------");
		}
		
		//print the data from the column
		List<WebElement> singleColu = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[3]"));
		for (WebElement colIter : singleColu) {
			System.out.println(colIter.getText());
			
		}
		
		System.out.println("---------");
		
		/*//print all the datas of rows and columns
		List<WebElement> allData = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td"));
		for (WebElement entireData : allData) {
			System.out.println(entireData.getText());*/
			
		//}
		//for dynamic value of data changes
		for (int i = 1; i <row.size(); i++) {
			WebElement element = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td"));
			for (int j = 1; j <columnCount.size(); j++) {
				WebElement datas = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td["+j+"]"));
				System.out.println(datas.getText());
			}
		}
	}

}
