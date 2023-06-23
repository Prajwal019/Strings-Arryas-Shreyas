package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class readthecharactor {
	public static void main(String[] args) throws IOException {
	String path="D://QACM4//t2.text";
	FileInputStream fis=new FileInputStream(path);
 fis.available();
 int b = fis.read();
 System.out.println((char)b);

}}

