package rev;
//w.j.p to find avg of the product price
import java.util.Scanner;

public class Productprice {

	public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the size of the array");
		int size=s.nextInt();
		int [] price=new int[size];
		System.out.println("enter the "+size+" product price");
		for (int i = 0; i < price.length; i++) {
			 price[i] = s.nextInt();}
		int sum=0;
			for (int i = 0; i < price.length; i++) {
			 sum=sum+price[i];
				
			}
 int avg=sum/size;
 System.out.println("average price of products= "+avg );

}}
