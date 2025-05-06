package lesson1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test6 {

	@Test
	public void LifeEmplEnroll()   {
	System.out.println("Employee Life Coverages");	
	}

	@Test
	public void LifeChildEnroll()   {
	System.out.println("Child Life Coverages");	   
	}
	   
	@Test
	public void SpouseLifeEnroll()   {
	System.out.println("Spouse Coverages");	   
	}

	@BeforeSuite
	public void bs()   {
	System.out.println("BS:I am always no.1");
	}

	@AfterSuite
	public void as()   {
	System.out.println("AS:I am always no.last");
	}
}
