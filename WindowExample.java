package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARAVINDAN\\Desktop\\selenium software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldWindow=driver.getWindowHandle();
		WebElement firstButton=driver.findElement(By.id("home"));
		firstButton.click();
		Thread.sleep(6000);
		Set<String> handles=driver.getWindowHandles();
		
		for (String newWindows: handles) 
		{
			driver.switchTo().window(newWindows);
			
		}
		
		WebElement editbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		Thread.sleep(6000);
		driver.close();
		Thread.sleep(6000);
		
		driver.switchTo().window(oldWindow);
		Thread.sleep(6000);
		WebElement openMultiple=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		openMultiple.click();
		Thread.sleep(6000);
		int noOfWindows=driver.getWindowHandles().size();
		System.out.println("No of windows:"+" "+ noOfWindows);
		
		WebElement dontCloseMe=driver.findElement(By.id("color"));
		dontCloseMe.click();
		Thread.sleep(3000);
		Set<String> newWindowHandles=driver.getWindowHandles();
		System.out.println(newWindowHandles.size());
		
		for (String allWindows : newWindowHandles) 
		{
			if(!allWindows.equals(oldWindow))
			{
				driver.switchTo().window(allWindows);
				driver.close();
			}
		}
		//driver.quit();
	}

}
