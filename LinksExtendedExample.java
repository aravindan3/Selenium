package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtendedExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARAVINDAN\\Desktop\\selenium software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement homePageLink=driver.findElement(By.linkText("Go to Home Page"));
		homePageLink.click();
		
		driver.navigate().back();
		
		WebElement whereToGo=driver.findElement(By.partialLinkText("Find where"));
		String where=whereToGo.getAttribute("href");
		System.out.println("This link is:"+"  "+where);
		
		WebElement brokenLink=driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		
		String title = driver.getTitle();
		
		if(title.contains("404"))
		{
			System.out.println("Link is broken");
		}
		
		else 
		{
			System.out.println("Link is not broken");
		}
		
		driver.navigate().back();
		
		WebElement homePageLin=driver.findElement(By.linkText("Go to Home Page"));
		homePageLin.click();
		
		driver.navigate().back();
		
		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
		
		int linkCount= totalLinks.size();
		System.out.println("Total links" +"  "+ linkCount);
		
		
		

	}

}
