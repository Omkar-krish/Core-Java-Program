import java.io.*;
import java.util.*;
public class FirstApp{
   public static void main(String x[]){
   
			Scanner sc = new Scanner(System.in);
			File f1 = new File("C:\\CoreJava\\FileHandling\\Abc");
		    boolean res=f1.exists();
			if(res){
			   System.out.println("Folder is Exists");
			}
			else{
			     boolean fs=f1.mkdir();
				    if(fs){
					    System.out.println("Folder is Created ..");
					}
					else{
					  System.out.println("Folder is not creates ");
					}
			}
   
   }
}
