package rev;

import java.util.Scanner;

public class cityArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the Array");
int size=s.nextInt();
String[] ss=new String[size];
System.out.println("enter the city name");
s.nextLine();
for (int i = 0; i < ss.length; i++) {
	ss[i]=s.nextLine();
	
}
System.out.println("the odd index city names are");
for (int i = 0; i < ss.length; i++) {
	if (i%2!=0)
	{
		System.out.println(ss[i]);
	}
}


	}

}
