package Object;

public class toStr {

	int price;
	String brand;
	toStr(){}
	public toStr(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	public String toString() {
		return "price  :"+price+"brand  :"+brand;

	}

}
