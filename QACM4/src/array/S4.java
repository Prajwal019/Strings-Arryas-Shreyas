package array;

import java.util.Scanner;

public class S4 {

		public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int size=s.nextInt();
	int []a=new int[size];
	for(int i=0;i<size;i++)
	{
		a[i]=s.nextInt();
		
	}
	int sum=0;
	for(int i=0;i<size;i++)
	{
		sum=sum+a[i];
	}
	int avg=sum/size;
	System.out.println("avg of the array :"+avg);
	
	}

}
