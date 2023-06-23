package program.practice;

import java.util.Scanner;

public class evenorOdd {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num = sc.nextInt();
String res = num%2==0?"even":"odd";
System.out.println(res);

	}

}
