package array;

public class BS {

	public static void main(String[] args) {
		int []a= {10,20,56,87,13,25};
		System.out.println("array before sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("array after sorting");
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
