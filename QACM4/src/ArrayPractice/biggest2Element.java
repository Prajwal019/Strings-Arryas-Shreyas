package ArrayPractice;

public class biggest2Element {

	public static void main(String[] args) {
int [] a= {76,8,29,92,16,86};
int big=a[0];
int big2=a[1];
for(int k:a) {
	if(k>big) {
		big2=big;
		big=k;
	}
	else if(k>big2&&k<big) {
		big2=k;
	}
}
System.out.println(big2);
	}

}
