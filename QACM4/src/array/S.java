import java.util.Scanner;
package array;
public class S {

public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("enter the size of the array");
 int size=s.nextInt();
 int[]a=new int[size];
 for (int i = 0; i < a.length; i++) {
	 a[i]=s.nextInt();
 }
 System.out.println("array befor sortying");
 for(int i=0;i<a.length;i++)
 {
	 System.out.println(a[i]);
 }
 }
	
}
		                    		   }
