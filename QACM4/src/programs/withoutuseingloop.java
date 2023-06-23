package programs;

public class withoutuseingloop {

	public static void main(String[] args) {
		print(1);

	}

	public static void print(int i) {
	
		System.out.println(i);
		if(i==10) {
			return;
		}
	
		i++;
		print(i);
		
	}

}
