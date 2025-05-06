package lesson1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test5 {

   @Test
   public void FSAFamily()   {
   System.out.println("HCFSA Enrollment");	
   }

   @Test
   public void FSAChild()   {
   System.out.println("DCFSA Enrollment");	   
   }

   @Test
   public void HSAContribution()   {
   System.out.println("HSA Enrollment");	   
   }
   
   @BeforeClass
   public void bc()   {
   System.out.println("BC:I will execute before first method execution");   
   }
   
   @AfterClass
   public void ac()   {
   System.out.println("BC:I will execute after last method execution");   
   }

}
