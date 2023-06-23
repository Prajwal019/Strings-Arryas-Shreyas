package array;

public class Car implements Comparable {

	public static void main(String[] args) {
		double price;
		String brand;
		int no_wheels;
		Car()
		{}
		Car(double price,String brand,int no_wheels)
		{
		this.price=price;
		this.brand=brand;
		this.no_wheels=no_wheels;
		}
		public void display() 
		{
		System.out.println("the price of the car :"+price);
		System.out.println("the brand name of the car :"+brand);
		System.out.println("the no_wheels of the car :"+no_wheels);
		System.out.println("=============================");
		}
		public String tostring()
		{
			return brand+":"+
		}
		
		

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
