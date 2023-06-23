package Collections;

public class marker implements Comparable{

int pid;
String colour;
double price;
marker(){}
marker(int pid,String colour,double price){
	this.pid=pid;
	this.colour=colour;
	this.price=price;
	
	
	}
public String toString() {
	return "marker[pid="+pid+", colour="+colour+", price="+price+"]";
	
}
@Override
public int compareTo(Object o) {
	marker m1=(marker)o;
	if(this.pid>m1.pid) {
		return 1;
	}
	else if(this.pid<m1.pid) {
		return -1;
	}
	else
	return 0;
}
}

	


