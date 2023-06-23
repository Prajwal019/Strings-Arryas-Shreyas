package program.practice;

import java.util.Scanner;

public class productofPrimenumber {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the m value");
int m=s.nextInt();
System.out.println("enter the n value");
int n=s.nextInt();
int j=2;
int prod=1;
for(int i=m;i<n;i++) {
	int count=0;
while(j<=i/2) {
	if(i%j==0) {
		count++;
		break;
	}
	j++;
}
if(count==0) {
	prod=prod*i;
}
	}
System.out.println(prod);
	}}
