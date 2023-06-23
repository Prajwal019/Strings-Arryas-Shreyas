package ArrayPractice1;

public class printtheElementsinEvenIndex {

	public static void main(String[] args) {
 int [] a= {10,26,45,67,34,29};
 for(int i=0;i<a.length;i++) {
	 if(i%2==0) {
		 System.out.println(a[i]);
	 }
 }
	}

}
