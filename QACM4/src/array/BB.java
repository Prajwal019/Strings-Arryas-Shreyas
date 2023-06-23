package array;

import java.util.Arrays;

public class BB {

	public static void main(String[] args) {
		int []a= {10,20,56,87,13,25};
		Arrays.sort(a);
		int key=56;
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		while (low<=high)
		{
			System.out.println("binary searching loop");
			if (a[mid]==key)
			{
				System.out.println(key+" is found");
				break;
			}	
			else if(a[mid]>key)
				high=mid-1;
			else
				low=mid+1;

			mid=(low+high)/2;
		}
		if(low>high)
		{
			System.out.println(key+" is not found");
		}
	}
}
