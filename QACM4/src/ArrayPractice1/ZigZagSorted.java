package ArrayPractice1;

public class ZigZagSorted {

	public static void main(String[] args) {
		int[]a= {10,20,12,23,25};
		 int[]b= {35,37,41,46,49,51};
		 int[]c=new int[a.length+b.length];
		 int i=0; int j=0; int k=0;
		 while(i<a.length&&i<b.length) {
			 if(a[i]<b[i]) {
				 c[k++]=a[i++];
				 
			 }
			 else
			 {
				 c[k++]=b[i++];
			 }
		 }
		 while(i<a.length) {
			 c[k++]=a[i++];
		 }
		 while(i<a.length) {
			 c[k++]=a[i++];
		 }
		 for(int d=0;d<c.length;d++) {
			 System.out.println(c[d]);
			 
		 }
	}

}
