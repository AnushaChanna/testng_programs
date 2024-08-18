package testng_programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class A191_C56_Test_Priority_invocation_Together 
{
@Test (priority=1, invocationCount=5)
public void launchflipkart()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	System.out.println("flipkart launched second");
	
	driver.close();
}
@Test
public void launchamazon()
{
	EdgeDriver driver1=new EdgeDriver();
	driver1.get("https://www.amazon.in");
	driver1.manage().window().maximize();
	System.out.println("Amazon launched first");
	 driver1.close();
}
	
}
