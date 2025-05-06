package lesson1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base1 {

 public void doThis()   {
 System.out.println("Lets do calculations"); 
 }

 @BeforeMethod   //Any Before/After annotations used will be automatically called in child class if parent class has been inherited. No need to call separately.
 public void bm()   {
 System.out.println("I will execute first"); 
 }
 
 @AfterMethod
 public void am()   {
 System.out.println("I will execute last"); 
 }


}
