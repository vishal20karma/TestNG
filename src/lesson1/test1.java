package lesson1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {

   @Parameters ({"URL1"})
   @Test
   public void OpenEnrollment1(String urlName)   {
   System.out.println("Medical Coverages");	
   System.out.println(urlName);
   }

   @Test (groups={"smoke"})
   public void OpenEnrollment2()   {
   System.out.println("Dental Coverages");   
   }

}
