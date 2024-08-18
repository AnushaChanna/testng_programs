package testng_programs;

import org.testng.annotations.Test;

public class A180_C55_Priority_TestAnno
{

	@Test (priority=1)
	public void Testcase1()
	{
		System.out.println("Testcase1 has priority 1 so it will run second");
	}
	@Test
	public void Testcase2()
	{
		System.out.println("Testcase2 has priority 0 by default so it will run first");
	}
}
