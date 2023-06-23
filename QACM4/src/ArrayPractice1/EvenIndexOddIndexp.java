package ArrayPractice1;

import java.util.Scanner;

public class EvenIndexOddIndexp {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("enter the Size");
int size=sc.nextInt();
int even=0;
int odd=0;
int []a=new int[size];
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}

for(int i=0;i<a.length;i++) {
	if(a[i]%2==0) {
		even++;
		
	}
	else {
		odd++;
		
	}
}
System.out.println("no of even  elements"+even);
System.out.println("no of odd  elements"+odd);

	}

}
