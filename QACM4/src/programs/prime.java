package programs;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		String res=isprime(num);
		System.out.println(res);

	}

	private static String isprime(int num) {
		int i=2;
		int count=0;
		while(i<=num/2) {
			if(num%i==0) {
				count++;
				break;
			}
			i++;
		}
			if(count==0) {
				return "prime";
			}
		else {
		return "not a aprime";
	}}}
