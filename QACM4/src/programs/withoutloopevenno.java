package programs;

public class withoutloopevenno {

	public static void main(String[] args) {
iseven(1);

	}
	public static void iseven(int i) {
		if(i==20) {
			return;
		}
		if(i%2==0) {
			System.out.println(i);
		}
		i++;
		iseven(i);
	}

}
