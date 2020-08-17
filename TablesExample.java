package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TablesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARAVINDAN\\Desktop\\selenium software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
		List<WebElement> columns=driver.findElements(By.tagName("th"));
		int coloumnCount=columns.size();
		System.out.println("Number of Columns"+" "+coloumnCount);

		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int rowsCount=rows.size();
		System.out.println("Number of Rows"+" "+rowsCount);
		
		WebElement getPercent=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		//WebElement getPercent=driver.findElement(By.xpath("//*[@id='table_id']/tbody/tr[3]/td[2]"));
		String percent=getPercent.getText();
		System.out.println("Percentage is "+percent);
		
		List<WebElement> allProgress=driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberList = new ArrayList<Integer>();
		
		for (WebElement webElement : allProgress) {
			String individualValue=webElement.getText().replace("%", "");
			numberList.add(Integer.parseInt(individualValue));
		}
		System.out.println("Final list"+numberList);
		
		int smallValue=Collections.min(numberList);
		System.out.println(smallValue);
		
		String smallvalueString=Integer.toString(smallValue)+"%";
		String finalXpath="//td[normalize-space()="+"\""+ smallvalueString + "\""+"]"+"//following::td[1]";
		System.out.println(finalXpath);
		
		
		
		WebElement check=driver.findElement(By.xpath(finalXpath));
		check.click();
		
		
		
		}
	}


