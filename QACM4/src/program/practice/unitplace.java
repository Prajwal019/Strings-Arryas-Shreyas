package program.practice;
//wjp to print the number from its uit place
public class unitplace {

	public static void main(String[] args) {
int num=1234;
while (num>0) {
	int rem=num%10;
	System.out.println(rem);
	num=num/10;
}

	}

}
