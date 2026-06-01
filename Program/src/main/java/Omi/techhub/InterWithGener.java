package Omi.techhub;
import java.util.*;
/*
 Interface With Generic
interface Abc<T>{
	  void setData(T value);
	  T get();
}
class Mno<T> implements Abc<T>
{
      private T value;
	public void setData(T value) {
		this.value=value;
	}
	public T get() {
		return value;
	}
	
}
public class InterWithGener{
     public static void main(String x[]) {
    	 Abc a1 = new Mno();
    	 a1.setData("Hello Good Mornin");
    	 Object res=a1.get();
    	 System.out.println(res);
     }
}
*/
// Wild Card Generic :it is denoted by ? And its Accepts the Any Kind of Data
/*
class Abc{
	 void setData(List<?> list) {
		   for(Object obj :list) {
			   System.out.println(obj);
		   }
	 }
}
public class InterWithGener{
	public static void main(String x[]) {
		List l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add("Omkar");
		
		Abc a1 = new Abc();
	   a1.setData(l1);
	}
}
*/
// Unbounded Generics 
/*
class App{
	void setData(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
public class InterWithGener{
	public static void main(String x[]) {
		  ArrayList a1 = new ArrayList();
		  a1.add(10);
		  a1.add(20);
		  a1.add(30);
		  
		  ArrayList a2 = new ArrayList();
		  a2.add("Omkar");
		  a2.add("Shyam");
		  a2.add("Vishal");
		  
		  App s1 = new App();
		  s1.setData(a1);
		  s1.setData(a2);
	}
}*/
// Bounded Generics : Means Some Restricon that type with Generics
// upper Bounded : means can allow the data its subclasses  and mainly used in the reading data

class Abc{
	void setData(List<? extends Number> list) {
		
		for(Object obj:list) {
		   System.out.println(obj);
		}
	}
}
public class InterWithGener{
	public static void main(String x[]) {
		ArrayList a1 = new ArrayList();
	     a1.add(100);
	     a1.add(200);
	     a1.add(300);
	     a1.add(65.5);
	    
	      
	     Abc s1 = new Abc();
	     s1.setData(a1);
	}
}