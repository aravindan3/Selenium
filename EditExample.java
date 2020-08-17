package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

		
	

		
		public static void main(String[] args) throws InterruptedException
		{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ARAVINDAN\\Desktop\\selenium software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Edit.html");
			Thread.sleep(4000);
			
			WebElement emailbox= driver.findElement(By.id("email"));
			emailbox.sendKeys("aravind@gmail.com");
			Thread.sleep(4000);
			
			WebElement appendbox= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
			appendbox.sendKeys("Text");
			Thread.sleep(4000);

			WebElement getTextbox= driver.findElement(By.name("username"));
			String value= getTextbox.getAttribute("value");
			System.out.println(value);
			Thread.sleep(4000);
			
			WebElement clearBox= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
			clearBox.clear();
			Thread.sleep(4000);
			
			WebElement disableBox= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
			boolean enable= disableBox.isEnabled();
			System.out.println(enable);
			
			
			
		}

	

	

}



