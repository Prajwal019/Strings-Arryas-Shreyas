package programs;

import java.util.Scanner;

public class neon {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		String res=isneon(num);
		System.out.println(res);


	}

	private static String isneon(int num) {
		int squ=num*num;
		int sum=0;
		while(squ>0) {
			int rem=squ%10;
			sum=sum+rem;
			squ=squ/10;
		}
		if(num==sum) {
		return "neon";}
		else {
			return "not anon";}}
		}
