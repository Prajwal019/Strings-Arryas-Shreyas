package array;

public class SS {

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
			int pos=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[pos]>a[j])
				{
					pos=j;
				}
			}
			if(i!=pos)
			{
				int temp=a[i];
				a[i]=a[pos];
				a[pos]=temp;
			}
		} 
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
	}
}