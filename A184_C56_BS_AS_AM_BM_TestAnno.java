package testng_programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class A184_C56_BS_AS_AM_BM_TestAnno 
{
@BeforeMethod
public void BM()
{
	System.out.println("Before Method");	
}
	
@AfterMethod
public void AM()
{
	System.out.println("After Method");	
}	
	
@BeforeSuite
public void BS()
{
	System.out.println("Before Suite");
}
@AfterSuite
public void AS()
{
	System.out.println("After Suite");
}
@Test
public void Testcase()
{
	System.out.println("Test annotation");
}
	
	
}
