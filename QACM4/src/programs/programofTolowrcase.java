package programs;

import java.util.Scanner;

public class programofTolowrcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
		int ch = s.charAt(i);
		if(ch>=65&&ch<=90) {
	ch=ch+32;
	System.out.print((char)ch);}
		
		else
			System.out.print((char)ch);

	}

}}
