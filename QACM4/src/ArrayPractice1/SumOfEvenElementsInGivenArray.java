package ArrayPractice1;

public class SumOfEvenElementsInGivenArray {

	public static void main(String[] args) {
		int [] a= {10,26,45,67,34,29};
		int sum=0;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]%2==0) {
				 sum=sum+a[i];
			 }
	}
		 System.out.println(sum);

}}
