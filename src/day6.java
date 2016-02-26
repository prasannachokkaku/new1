import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day6 {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		List<WebElement>linkList=driver.findElements(By.tagName("a"));
		for (int i = 0; i < linkList.size(); i++)
		{
			if (!linkList.get(i).getText().isEmpty())
			{
				System.out.println(linkList.get(i).getText());
				
			}
			
		}
	}

}
