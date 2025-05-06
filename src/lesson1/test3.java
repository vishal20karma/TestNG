package lesson1;

import org.testng.annotations.Test;

public class test3 {

   @Test (enabled=false)
   public void OpenEnrollment5()   {
   System.out.println("HCFSA Coverages");	
   }

   @Test (dependsOnMethods={"OpenEnrollment7"})
   public void OpenEnrollment6()   {
   System.out.println("DCFSA Coverages");	   
   }

   @Test (groups={"smoke"})
   public void OpenEnrollment7()   {
   System.out.println("HSA Coverages");	   
   }

   
}
