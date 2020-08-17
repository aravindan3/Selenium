package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARAVINDAN\\Desktop\\selenium software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		Thread.sleep(4000);
		
		WebElement java = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input"));
		java.click();
		
		WebElement selenium = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input"));
		boolean seleniumSelected= selenium.isSelected();
		System.out.println(seleniumSelected);
		
		Thread.sleep(4000);
		

		WebElement firstElement= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input"));
		if (firstElement.isSelected())
		{
			System.out.println(firstElement.isSelected());
			firstElement.click();
		}
		else
		{
			System.out.println(firstElement.isSelected());
			firstElement.click();
			
		}
		
		
		Thread.sleep(4000);
		
		
		WebElement secondElement= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
		if (secondElement.isSelected()){
			System.out.println(secondElement.isSelected());
			secondElement.click();
		}
		
		
		
		

	}

}
