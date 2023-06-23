package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class readstring1 {
	public static void main(String[] args) throws IOException {
		String path="D://QACM4//t3.text";
		FileInputStream fis=new FileInputStream(path);
	 fis.available();
	 byte[]b=new byte[fis.available()];
	 fis.read(b);
	 for(int i=0;i<b.length;i++) {
		 System.out.print((char)b[i]);} 
	 fis.close();
	 }
	 

}
