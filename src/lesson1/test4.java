package lesson1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test4 {

   @Test
   public void OpenEnrollment8()   {
   System.out.println("Employee Life Coverages");	
   }

   @Test (timeOut=4000)
   public void OpenEnrollment9()   {
   System.out.println("Child Life Coverages");	   
   }
   
   @Test
   public void OpenEnrollment10()   {
   System.out.println("Spouse Life Coverages");	   
   }
   
   @Test
   public void OpenEnrollment11()   {
   System.out.println("Basic Life Coverages");	   
   }
   
   @BeforeTest
   public void bt()   {
   System.out.println("BT:I will execute 2nd First");  
   }
   
   @AfterTest
   public void at()   {
   System.out.println("AT:I will execute 2nd last");  
   }

}
