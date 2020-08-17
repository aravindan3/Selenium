package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARAVINDAN\\Desktop\\selenium software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calender.html");
		WebElement calender = driver.findElement(By.id("datepicker"));
		//calender.sendKeys("01/10/2019"+Keys.ENTER);
		
		calender.click();
		
		WebElement nextButton=driver.findElement(By.xpath("//a[@title'Next']"));
		nextButton.click();
		WebElement dateToBeGiven=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		dateToBeGiven.click();
		
	}

}
