package rev;

import java.util.Iterator;
import java.util.Scanner;

public class advancefor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the Array");
		int size=s.nextInt();
		int []a=new int[size];
		System.out.println("enter the values");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
			
		}
		for(int i:a) {
			System.out.println(i);
		}

	}

}
