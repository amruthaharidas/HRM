package script;

import org.testng.annotations.Test;

public class Test1 {

@Test(groups = "smoke")
	
	public void script1()
	{
		System.out.println("........script 1............");
		System.out.println("Sridevi");
	}
	
	@Test()
	public void script2()
	{
		System.out.println("........script 2............");
	}
	
	@Test()
	public void script11()
	{
		System.out.println("........script 11............");
	}
	@Test()
	public void script22()
	{
		System.out.println("........script 22............");
	}
}
