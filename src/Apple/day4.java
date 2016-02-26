package Apple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day4 {

	public static void main(String[] args)
	{
		String expval,actval;
		expval = "Travels";
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		actval=driver.getPageSource();
		if (actval.contains(expval))
		{
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		
	}

}
