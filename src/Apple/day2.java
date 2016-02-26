package Apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class day2 {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div[2]/div[3]/div/a")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]")).sendKeys("meeseva2gpm");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/input")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div/input[2]")).sendKeys("gpm970gpm");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/form/div[2]/div/input[1]")).click();

	}

}
