package programs;

public class Methodrecurrsion {

	public static void main(String[] args) {
		print(1);

	}
	public static void print(int i) {
		
			if(i==22) {
				return;
				
			}
			if(i%2==0){
			System.out.println(i);}
			i++;
			print(i);
			
		}

}

