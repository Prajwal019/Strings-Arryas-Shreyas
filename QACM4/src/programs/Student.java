package programs;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int kannada=s.nextInt();
		int Social=s.nextInt();
		int maths=s.nextInt();
		int English=s.nextInt();
		if(kannada>=35&&Social>=35&&maths>=35&&English>=35)
		{
			System.out.println("canditate is pass in all subject");
		}
		else
		System.out.println("canditate is fail");
	}

}
