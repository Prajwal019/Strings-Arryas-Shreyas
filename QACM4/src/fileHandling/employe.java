package fileHandling;

import java.io.NotSerializableException;
import java.io.Serializable;

public class employe implements Serializable{
	int i; String string; int j;

	
employe(){}
	public employe(int i, String string, int j) {
		super();
		this.i = i;
		this.string = string;
		this.j = j;
	}



	public static void main(String[] args) {
		

	}

}
