package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class writeString {

	public static void main(String[] args) throws IOException {
		String path="D://QACM4//t3.text";
		FileOutputStream fout=new FileOutputStream(path);
		String s="shreyas is a bad boy";
		byte[]b=s.getBytes();
		fout.write(b);
		fout.close();

	}

}
