package testngPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups={"Smoke"})
	public void secondtest()
	{
		System.out.println("This is Dummy test");
	}

	@AfterSuite
	 public void Aftersuitonly()
	 
	 {
		  System.out.println("I will excute at Last at no 1 position");
	 }
	
	
	
}
