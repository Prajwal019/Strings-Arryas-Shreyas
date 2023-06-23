package String;

public class Count {

		public static void main(String[] args)  {
		String s1="SHReyasnsjois33@gmail.com".toLowerCase();
		Thread.sleep(4000);
		int UPC=0;
		int LOC=0;
		int DIC=0;
		int SPC=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch>'A'&&ch<'Z')
			{
				 UPC++;
		}
			else if (ch>='a'&&ch<='z')
			{
				LOC++;
			}
			else if (ch>='0'&&ch<='9')
			{
				DIC++;
			}

			else
		{
			SPC++;
		}
		}
		System.out.println(" no of uppercase present inside string is :"+UPC);
		System.out.println(" no of lowercase present inside string is :"+LOC);
		System.out.println(" no of digits present inside string is :"+DIC);
		System.out.println(" no of special char present inside string is :"+SPC);
		}
}
