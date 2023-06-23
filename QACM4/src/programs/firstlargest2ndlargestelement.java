package programs;

public class firstlargest2ndlargestelement {

	public static void main(String[] args) {
		int[]a= {50,24,35,73,24,63};
		int large=a[0];
		int large2=a[1];
		for (int j = 0; j < a.length; j++) {
			if(a[j]>large) {
				large2=large;
				large=a[j];
				}
			else if(a[j]>large2){
				large2=a[j];
				
			}
		}
		System.out.println("largest element is :"+large);
		System.out.println("2nd largest element is :"+large2);
		

	}

}
