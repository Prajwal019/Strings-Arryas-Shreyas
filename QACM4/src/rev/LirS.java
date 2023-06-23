package rev;

import java.util.Scanner;

public class LirS {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the Array");
		int size=s.nextInt();
		int []a=new int[size];
		System.out.println("enter the values");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
			
		}
		System.out.println("enter the key element");
		int key=s.nextInt();
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==key) {
				c++;
				break;
			}
		}
		if(c==1) {System.out.println("found");}
			else
			{System.out.println("not found");}
			
		}
		

	}
