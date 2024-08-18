package testng_programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A181_C56_InvocationCount_SingleClass 
{
@Test (invocationCount=5)
public void launchamazon() 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	driver.close();
}
}
