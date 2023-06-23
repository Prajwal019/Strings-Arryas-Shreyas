package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class F1 {


	public static void main(String[] args) throws IOException {
		String path="D://QACM4//t4.text";
		FileOutputStream fout=new FileOutputStream(path);
		String s="shreyas is a bad boy";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			fout.write(ch);
		}
		System.out.println("done");
		fout.close();
	}

}
