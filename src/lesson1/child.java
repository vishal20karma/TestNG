package lesson1;

import org.testng.annotations.Test;

public class child extends base1{   //Never 'extends' and 'Object method calling' from the parent class, else child will throw error for super constructor. This issue because already one constructor already created in the parent class.

 @Test
 public void calculations()   {
 int a=3;
 doThis();
 base2 b2 = new base2(a);
 System.out.println("Incremented Value:"+b2.increment());
 System.out.println("Decremented Value:"+b2.decrement());
 System.out.println("Multiplied Value:"+b2.multiplyThree());
 }

// 'multiplyThree' method is in base3 class, we can call by creating base3 object but here we have
// inherited the properties of base3 to base2 by 'extends', that is why directly from base2 class we
// have called 'multiplyThree' method. Whenever integration two base class and already one has been
// called in one child class, then there is a need of super constructor. Already created in base2 class. 
 
}
