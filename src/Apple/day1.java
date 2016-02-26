package Apple;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class day1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div[2]/div[2]/div[1]/a")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div[2]/div[2]/div[2]/ul[1]/li[7]/a/span[1]")).click();
		//driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div[2]/div[2]/div[1]/a")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div[2]/div[3]/div/a")).click();
		
	}


}
