package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARAVINDAN\\Desktop\\selenium software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downloadLink=driver.findElement(By.linkText("Download Excel"));
		downloadLink.click();
		Thread.sleep(4000);
		
		File filelocation=new File ("C:\\Users\\ARAVINDAN\\Downloads");
		
		File[] totalFiles=filelocation.listFiles();
		
		for (File file : totalFiles) 
		{
			if(file.getName().equals("testleaf.xlsx")) 
			{
				System.out.println("file is downloaded");
				break;
			}
			
	}

}
}
