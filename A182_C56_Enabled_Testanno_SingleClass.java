package testng_programs;

import org.testng.annotations.Test;

public class A182_C56_Enabled_Testanno_SingleClass
{
@Test
public void testenable()
{
	System.out.println("this testcase is enabled");
}
@Test (enabled=false)
public void testdisable()
{
	System.out.println("this testcase is disabled");
}	
	
}
