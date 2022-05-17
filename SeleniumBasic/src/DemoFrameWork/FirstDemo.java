package DemoFrameWork;

import static org.junit.Assert.*;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstDemo 

{
	@Test
public void test() 
{
		
	System.setProperty("webdriver.edge.driver","C:\\Users\\puneetkumar.singh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver;
		 driver=new EdgeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("The title of the page:" +title);
		driver.close();
		driver.quit();
	
	
	
}
}
