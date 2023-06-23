package rev;
//w.j.p to find sum of odd index elements

import java.util.Scanner;

public class ArraySumOfOddIndex {

	public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the size of the array");
		int size=s.nextInt();
		int []a=new int[size];
		System.out.println("enter the "+size+" values");
		for (int i = 0; i < a.length; i++) {
			 a[i] = s.nextInt();}
		int sum=0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]%2==1) {sum=sum+a[i];}
				
			}
System.out.println(sum);
	}

}
