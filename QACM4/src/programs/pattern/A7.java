package programs.pattern;

public class A7 {
	
	public static void main(String[] args) {
		int n=5;
		char k='A';
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i+j==n-1||i==n-1) {
				
				System.out.print(k+++" ");
			}else
				System.out.print("  ");
		}
		for(int j=1;j<n;j++) {
			if(i==j||i==n-1) {
				System.out.print(k+++" ");
			}else
				System.out.print("  ");
		}
		System.out.println();
		
	}
}
}

