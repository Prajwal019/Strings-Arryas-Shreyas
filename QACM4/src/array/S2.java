package array;
import java.util.Arrays;
import java.util.Scanner;

public class S2 {


public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("enter the size of the array");
 int size=s.nextInt();
 int[]a=new int[size];
 for (int i = 0; i < a.length; i++) {
	 a[i]=s.nextInt();
 }
 System.out.println("array befor sortying");
 int sum=0;
 for(int i=0;i<a.length;i++)
 {
	 sum=sum+(a[i]);
 }
 System.out.println("sum of array ="+sum);
 }
	
}