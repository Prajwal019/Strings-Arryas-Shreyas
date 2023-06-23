package ArrayPractice1;

public class ZigzagArray {

	public static void main(String[] args) {
		 int[]a= {10,20,12,23,25};
		 int[]b= {35,37,41,46,49,51};
		 int[]c=new int[a.length+b.length];
		 int i=0; int j=0;
		 while(i<a.length&&i<b.length) {
			 c[j]=a[i];j++;
			 c[j]=b[i];
			 i++;j++;
		 }
		 while(i<a.length) {
			 c[j]=a[i];
			 i++; j++;
		 }
		 while(i<b.length) {
			 c[j]=b[i];
			 i++; j++;
		 }
		 for(int d=0;d<c.length;d++) {
			 System.out.println(c[d]);
			 
		 }
	}

}