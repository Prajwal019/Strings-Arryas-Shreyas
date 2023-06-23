package wrapper;

public class commandlinearguments {

	public static void main(String[] args) {
int sum=0;
for(String g:args) {
	int a=Integer.parseInt(g);
	sum =sum+a;
	
}
System.out.println(sum);
	}

}
