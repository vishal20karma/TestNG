package lesson1;

public class base2 extends base3{

 int a;
 
 public base2(int a)   {
 super(a);
 this.a=a;	 
 }
	
 public int increment()   {
 a=a+1;
 return a;
 }

 public int decrement()   {
 a=a-1;
 return a;
 }
 
}
