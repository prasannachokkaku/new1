import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day5 {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		List<WebElement>linksElements=driver.findElements(By.tagName("a"));
		for (int i = 0; i < linksElements.size(); i++) 
		{
			if (!linksElements.get(i).getText().isEmpty())
			{
				System.out.println(linksElements.get(i).getText());
				
			}
		}

	}

}
