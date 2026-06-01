package Omi.techhub;
// class With Generics
class A<T>{
	 T value;
	void setData(T value){
		 this.value =value;
	}
    T getdata() {
    	return value;
    }
}
public class First {
     public static void main(String x[]) {
    	       A a1 = new A();
    	       a1.setData(10);
    	       Object res=a1.getdata();
    	       System.out.println(res);
     }
}
