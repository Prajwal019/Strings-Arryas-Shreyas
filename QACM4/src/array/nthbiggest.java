package array;

public class nthbiggest {

	public static void main(String[] args) {
		int []a= {25,74,10,9,52,35,12};
		
		int n=2;
		int big=0;
		for(int i=0;i<a.length;i++)
		{int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					count++;
				}}
				if(count==n-1)
				{big=a[i];
					
			}
			}System.out.println(big);
	}
}
		
