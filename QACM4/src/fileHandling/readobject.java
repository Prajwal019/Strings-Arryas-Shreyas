package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class readobject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	String path="D://QACM4/t5.text";
	FileInputStream fis=new FileInputStream(path);
    ObjectInputStream ffis=new ObjectInputStream(fis);
	ffis.available();
	employe e1 = (employe)ffis.readObject();
	}
}
