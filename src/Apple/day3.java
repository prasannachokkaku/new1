package Apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class day3 {

	public static void main(String[] args)
	{
		String url = "http://opensource.demo.orangehrm.com/";
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.partialLinkText("Welcome Ruth")).click();
		WebElement logout=driver.findElement(By.linkText("Logout"));
		logout.click();
		//driver.findElement(By.linkText("Logout")).click();
		driver.close();
		

	}

}
