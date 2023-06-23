package program.practice;

public class IsinString {

	public static void main(String[] args) {

		String s1="India is the Great Country is and also is Developing Country and also is Populated Country";
		char[] sa1 = s1.toCharArray();
		int count = 0;
		for(int k=0;k<sa1.length;k++) {
			if(k!=0 && sa1[k-1]==' ' && sa1[k]=='i' && sa1[k+1]=='s' && sa1[k+2]==' ') {
				count++;
			}
			
		}
		
		System.out.println("Count="+count);
	}

}
