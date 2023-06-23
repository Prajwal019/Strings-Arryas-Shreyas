package javaprograms;

public class ovelprintatlast {

	public static void main(String[] args) {
   String s="hello";
   char [] c=s.toCharArray();
   int count=0;
   char[]ch=new char[s.length()];
    for(int i=0;i<c.length;i++) {
    	if(!(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')) {
    		count++;
    	}
    }
    int y=0;
    for(int i=0;i<c.length;i++) {
    	if(!(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')) {
           ch[y]=c[i]; 
           y++;
    	}
    	else {
    		ch[count]=c[i];
    		count++;
    	}
	}
    String s1=new String(ch);
    System.out.println(s1);

}}
