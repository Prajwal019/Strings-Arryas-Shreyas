package program.practice;

public class missingnumber {

	public static void main(String[] args) {
		int []a= {5,9,3,7};
		for(int i=1;i<=10;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					count++;
					break;
				}}
				if(count==0) {
					System.out.println("missing number is: "+i);
				}
			}
		}

	}


