package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARAVINDAN\\Desktop\\selenium software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement getPositionButton=driver.findElement(By.id("position"));
		Point xypoint=getPositionButton.getLocation();
		int xvalue=xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println("X Value :" +xvalue+"    "+ "Y Value : " +yvalue  );
		
		
		WebElement getColor=driver.findElement(By.id("color"));
		String colorValue=getColor.getCssValue("background-color");
		System.out.println("color is :" + colorValue );
		
		WebElement sizeButton=driver.findElement(By.id("size"));
		int height= sizeButton.getSize().getHeight();
		int width= sizeButton.getSize().getWidth();
		System.out.println("Height:"+ height+"  "+"Width:"+ width);
		
		
		WebElement homeButton=driver.findElement(By.id("home"));
		homeButton.click();
		
		
		}
}
