package program.practice;
import java.util.Scanner;
public class outputbasedonding {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num1=num;
int count=0;
while(num>0)
{num=num/10;
	count++;}
if(count==4) {
	int rem=num1%10;
	System.out.println(rem);}
else if(count==3) {
	int rem=num1%100;
	System.out.print(rem);
	}
else if(count==2||count==1)
	System.out.println("hi");
else
	System.out.println("no of digit is more than 4 digit");
	}}
