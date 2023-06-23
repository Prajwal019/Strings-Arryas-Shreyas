package programs;

public class missingnumber {
	public static void main(String[] args) {
		int []a= {1,2,3,4};
		for(int i=1;i<=5;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					count++;
					break;
				}}
				if(count==0) {
				System.out.println("missing no is:"+i);
				}
			}
		}
	}


