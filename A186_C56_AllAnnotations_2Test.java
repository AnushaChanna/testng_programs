package testng_programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A186_C56_AllAnnotations_2Test 
{
	
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void AS()
	{

		System.out.println("After suite");

	}

	@BeforeTest
	public void BT()
	{
		System.out.println("Before Test");
	}

	@AfterTest
	public void AT()
	{
	System.out.println("After Test");
	}

	@BeforeClass
	public void BC()
	{
		System.out.println("before class");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("After class");	
	}

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
	public void test()
	{
		System.out.println(" Test annotation1");
	}
	
	
	@Test
	public void logout()
	{
		System.out.println("Test logout annotation 2");
	}
	
}
