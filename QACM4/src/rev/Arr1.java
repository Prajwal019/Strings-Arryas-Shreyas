package rev;

import java.util.Scanner;

public class Arr1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the Array");
int size=s.nextInt();
int []a=new int[size];
System.out.println("enter the elements of array");
for(int i=0;i<size;i++)
{
	a[i]=s.nextInt();
}
System.out.println("the array elements are");
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
	}}
