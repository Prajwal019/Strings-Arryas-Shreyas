package rev;

import java.util.Scanner;

public class bblsort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the Array");
		int size=s.nextInt();
		int []a=new int[size];
		System.out.println("enter the values");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
			
		}
		int [] b=bblso(a);
		System.out.println("array after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
	}}
		public static int[] bblso(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
			return a;
		}

	}
