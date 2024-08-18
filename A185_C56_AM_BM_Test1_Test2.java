package testng_programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A185_C56_AM_BM_Test1_Test2
{
	@AfterMethod
	public void AM()
	{
		System.out.println("After Method");
	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("before method");
	}
	@Test
	public void test1()
	{
		System.out.println(" Test 1");
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("Test  2");
	}
}
