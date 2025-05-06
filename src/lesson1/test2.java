package lesson1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {

   @Test (groups={"smoke"})
   public void OpenEnrollment3()   {
   System.out.println("Vision Coverages");	
   }

   @Parameters ({"URL2","UserId"})
   @Test
   public void OpenEnrollment4(String urlName, String loginId)   {
   System.out.println("Hearing Coverages");
   System.out.println(urlName);
   System.out.println(loginId);
   }

   @BeforeMethod
   public void bm()   {
   System.out.println("BM:I will execute before every method");
   }
   
   @AfterMethod
   public void am()   {
   System.out.println("AM:I will execute after every method");
   }
}
