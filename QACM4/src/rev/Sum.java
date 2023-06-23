package rev;

import java.util.Scanner;

public class Sum {
public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of the Array");
	int size=s.nextInt();
	System.out.println("enter the elements");
	double [] a= new double[size];
	double sum=0;
	for (int i = 0; i < a.length; i++) {
		a[i]=s.nextDouble();
		
	}  
	System.out.println(sum);


}
}
