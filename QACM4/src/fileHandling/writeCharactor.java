package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeCharactor {

	public static void main(String[] args) throws InterruptedException, IOException {
		String path="D://QACM4//t2.text";
		FileOutputStream fout=new FileOutputStream(path);
        String s="Shreyas";
        char ch=s.charAt(0);
        fout.write(ch);
        fout.close();
	}

}
