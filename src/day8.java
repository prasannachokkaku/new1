import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day8 {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http:google.com");
		List<WebElement>links=driver.findElements(By.linkText("Gmail"));
		if (links.size()>0)
		{
			System.out.println("Gmail link is present");
			
		}
		else {
			System.out.println("Gmail link is not present");
		}
	}

}
