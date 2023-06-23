package basics;

public class Car {
int nOofwheels;
String brand;
double price;

public Car(int nOofwheels, String brand, double price) {
	super();
	this.nOofwheels = nOofwheels;
	this.brand = brand;
	this.price = price;
	System.out.println("details of car");
	System.out.println("no of wheels"+nOofwheels);
	System.out.println("brand"+brand);
	System.out.println("price"+price);
}
public static void main(String[]args)
{
	new Car(4,"tata",1123445);

	}

}
