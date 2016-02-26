import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day7 {

	public static void main(String[] args) 
	{
		boolean linkexit = false;
		String explink ="praanna";
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++)
		{
			if (links.get(i).getText().equalsIgnoreCase(explink)) 
			{
				linkexit=true;
				break;
			}
			else
			{
				linkexit=false;
				
			}
			if (linkexit=true) 
			{
				System.out.println(explink+"link is present");
				
			}
			else 
			{
				System.out.println(explink+"link is not present");
				
			}
			
		}
		

	}

}
