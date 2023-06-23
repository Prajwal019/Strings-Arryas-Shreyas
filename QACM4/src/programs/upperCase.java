package programs;

public class upperCase {

	public static void main(String[] args) {
		String s="shreyas";
		String upp="";
		char [] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
		if(ch[i]>='a'&&ch[i]<='z') {
				char c=(char)(ch[i]-32);
				upp= upp+c;
				
			}
		}
		System.out.println(upp);

	}

}
