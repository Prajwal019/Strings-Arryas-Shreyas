package array;

public class noofprime {

	public static void main(String[] args) {
		int [] a= {10,5,6,7,8,9,11,13};
		int res=noprime(a);
		System.out.println(res);
		
		

	}
	public static int noprime(int[]a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int c=0; int d=2;
			while(d<=a[i]/2)
			{
				if(a[i]%d==0)
				{
					c++;
				break;
				}
				d++;}
			if(c!=1) {count++;
			}
		}return count;
	}

}
