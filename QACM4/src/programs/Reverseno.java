package programs;

import java.util.Scanner;

public class Reverseno {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
int num=s.nextInt();
int rev=0;
while(num>0)
{int rem=num%10;
rev=rev*10+rem;
	num=num/10;
	
}System.out.println(rev);
	}

}

