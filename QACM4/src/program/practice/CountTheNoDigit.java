package program.practice;
//wjp to find the number digits present in given number
public class CountTheNoDigit {

	public static void main(String[] args) {
		int num=254978672;
		int digit = 0;
		while(num>0) {
			num=num/10;
			digit++;
		}
		System.out.println(digit);

	}

}
