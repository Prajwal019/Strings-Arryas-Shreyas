package programs;

public class zigjagArray {

	public static void main(String[] args) {
		int [] a= {10,20,55,14};
		int [] b= {12,23,34,64,72};
		int []c=new int[a.length+b.length];
		int e=0;
		int f=0;
		for(int i=0;i<c.length;i++) {{
			if(i%2==0&&i<a.length&&i<b.length)
			{
					c[i]=a[e];
					e++;
				}
				else
				{
						c[i]=b[f];
						f++;
					}}
			if(i<c.length)
					for(int j=0;j<a.length;j++) {
					c[i]=a[e];
					e++;}
					for(int k=0;k<b.length;k++) {
					c[i]=b[f];
					f++;
				}
				}
				
		for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
		}

	}}


