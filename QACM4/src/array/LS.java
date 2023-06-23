package array;

public class LS {

	public static void main(String[] args) {
		int []a= {10,20,56,87,13,25};
		System.out.println("array before sorting");
		
		int key=56;
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				c++;
				break;
			}
		}
		if(c==1)
		{
			System.out.println(key+"   is found");
		}
		else
			System.out.println("key not found");

	}

}
