package programs;

import java.util.Scanner;

public class sumOfDigitsInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++) {
		int ch = s.charAt(i);
		if(ch>=48&&ch<=57) {
	sum=sum+(ch-48);
	}
		}
		System.out.println(sum);
		}}

