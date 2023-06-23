package programs;

import java.util.Scanner;

public class Unitplace {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
int num=s.nextInt();
while(num>0)
{
	int rem=num%10;
	System.out.println(rem);
	num=num/10;
}
	}

}
