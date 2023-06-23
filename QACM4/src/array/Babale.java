package array;

public class Babale {

	public static void main(String[] args) {
		int []a= {25,74,10,9,52,35,12};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
			for(int i=0;i<a.length;i++)
			{
			System.out.println(a[i]);
		}

	}

}
