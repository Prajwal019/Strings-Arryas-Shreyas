package programs;

public class upperCaseword {

	public static void main(String[] args) {
		String s="java  is a programming language";
		char[] ch=s.toCharArray();
		int words=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			
			{
				if(ch[i]>='a'&&ch[i]<='z') {
					ch[i]=(char)(ch[i]-32);
				}
			}
		}

	
		String s1=new String(ch);
		System.out.println(s1);

}}
