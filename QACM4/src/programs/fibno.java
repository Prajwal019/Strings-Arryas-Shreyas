package programs;

public class fibno {

	public static void main(String[] args) {
		
		isFib(0,1,0);

	}

	private static void isFib(int a,
	int b,
	int sum) {
		if(a==0&&b==1) {System.out.println(0);
		System.out.println(1);}
		
if(sum>=55)
{
	return;	
	}
sum=a+b;
System.out.println(sum);
a=b;
b=sum;
	isFib(a,b,sum);

}}
