package programs;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number");
			int num=s.nextInt();
			if(((num/2)*2)==num)
			{
				System.out.println("Even");
			}
			else
				System.out.println("odd");

	}

}
