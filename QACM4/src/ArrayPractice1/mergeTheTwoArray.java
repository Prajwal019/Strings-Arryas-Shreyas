package ArrayPractice1;

public class mergeTheTwoArray {

	public static void main(String[] args) {
 int[]a= {10,20,12,23,25};
 int[]b= {35,37,41,46,49,51};
 int[]c=new int[a.length+b.length];
 for(int i=0;i<a.length;i++) {
	 c[i]=a[i];
 }
 for(int i=0;i<b.length;i++) {
	 c[a.length+i]=b[i];
	}
 for(int i=0;i<c.length;i++) {
	 System.out.println(c[i]);
 }
}}
