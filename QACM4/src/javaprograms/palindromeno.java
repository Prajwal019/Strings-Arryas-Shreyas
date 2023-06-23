package javaprograms;

public class palindromeno {

	public static void main(String[] args) {
		System.out.println("palindrome numbers from 100 to 200 is ");
		for(int num=100;num<=2000;num++) {
		int num1=num;
		int temp=num;
		int rev=0;
		while(num1>0) {
			int rem=num1%10;
			rev=rev*10+rem;
			num1=num1/10;
		}
		if(temp==rev) {
			System.out.print(temp+", ");
		}}
		

	}

}
