package ArrayPractice1;

public class reverseTheCharArray {

	public static void main(String[] args) {
char []ch= {'d','i','n','g','a'};
int i=0;
int j=ch.length-1;
while(i<j) {
	char temp=ch[i];
	ch[i]=ch[j];
	ch[j]=temp;
	i++;
	j--;
}
System.out.println(ch);
	}

}
