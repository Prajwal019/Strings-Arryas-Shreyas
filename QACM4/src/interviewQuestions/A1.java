package interviewQuestions;

public class A1 {

	public static void main(String[] args) {
		int n=3;
		int m=4;
		char ch='A';
		int k=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i%2==0) {
					System.out.print(ch+++" ");
				}
				else
				{
					System.out.print(k+" ");
					k=k+2;
				}
			}
			System.out.println();
			}

	}

}
