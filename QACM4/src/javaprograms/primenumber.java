package javaprograms;

public class primenumber {

	public static void main(String[] args) {
		for(int num=2;num<=100;num++) {
			int i=2;
		int count=0;
		while(i<=num/2) {
			if(num%i==0) {
				count++;
				break;
			}
			i++;
		}
		if(count==0) {
			System.out.print(num+", ");
		}
		}

	}

}
