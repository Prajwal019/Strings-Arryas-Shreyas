package javaprograms;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		System.out.println("armStrong no from 1 to 1000 is :");
		for(int num2=1;num2<1000;num2++) {
		int num=num2;	
		int num1=num2;
		int temp=num2;
		int count =0;
		int sum=0;
		while(num>0) {
// in order to count the num of digits we ues this loop
			num=num/10;
			count++;
			
		}
		while(num1>0) {
			int temp1=count;
			//in order to find the nth 
			//power of singe digit we use below stmt
		int fact=1;
		//in order to find the last digit we use below stmt
		int rem=num1%10;
		while(temp1>0) {
			//in order to find nth power of perticular digit we use this loop
			fact=fact*rem;
			temp1--;
		}
		//in order to find the summation we use this below stmt
		sum=sum+fact;
		//in order remove the last digit we use the below stmt
		num1=num1/10;
		}
		//in order to compare the num with sum we use this condition block
if(temp==sum) {
	System.out.print(temp+", ");
}
}}}
