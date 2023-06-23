package rev;

public class CarDriver {

	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println(c1.brand);
		c1.brand="TATA";
		System.out.println(c1.e.cc);
		c1.Drive();
		c1.e.Combustion();

	}

}
