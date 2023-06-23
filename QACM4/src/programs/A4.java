package programs;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int big =a;
		if(b>big)
		{
			big=b;
		}
		if(c>big) {
			big=c;

	}
		System.out.println(big);}}
