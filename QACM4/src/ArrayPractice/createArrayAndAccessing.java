package ArrayPractice;

public class createArrayAndAccessing {

	public static void main(String[] args) {
int[]a= {2,4,7,8,3};
int []b=new int[5];
b[0]=7;
b[1]=8;
b[2]=3;
b[3]=6;
b[4]=9;
for(int i=0;i<a.length;i++) {
System.out.println(a[i]);
	}
System.out.println("elements of b array is");
for(int k:b) {
	System.out.println(k);
}
}
}