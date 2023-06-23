package program.practice;

import java.util.Scanner;

public class perfect2digitno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2digit number");
		int num = sc.nextInt();
		int a=num%10;
		int b=num/10;
		int res=((a+b)+(a*b));
		if(num==res) {
			System.out.println(num+" is perfect number");
		}
		else
			System.out.println(num+" is not a perfect number");

	}

}
