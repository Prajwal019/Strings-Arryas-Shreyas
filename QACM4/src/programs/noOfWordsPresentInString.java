package programs;

public class noOfWordsPresentInString {
	public static void main(String[] args) {
		String s="java  is a programming language";
		char[] ch=s.toCharArray();
		int words=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			
			{
				words++;
				}
			}
		
		System.out.println(words+" words present in given string");

}


}
