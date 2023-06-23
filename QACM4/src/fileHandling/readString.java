package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class readString {
	public static void main(String[] args) throws IOException {
		String path="D://QACM4//t5.text";
		FileOutputStream fot=new FileOutputStream(path);
		ObjectOutputStream ffot=new ObjectOutputStream(fot);
		ffot.writeObject(new employe(101,"shela",10000));
	}

}
