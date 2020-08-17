package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectionMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARAVINDAN\\Desktop\\selenium software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");

		List<WebElement> selectable= driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int listsize=selectable.size();
		System.out.println(listsize);
		
		Actions actions = new Actions(driver);
		//actions.keyDown(Keys.CONTROL).click(selectable.get(0))
		//.click(selectable.get(1)).click(selectable.get(2)).build().perform();
		
		
		 actions.clickAndHold(selectable.get(0));
		 actions.clickAndHold(selectable.get(1));
		 actions.clickAndHold(selectable.get(2));
		 actions.build().perform();
		 
		
		
	}

}
