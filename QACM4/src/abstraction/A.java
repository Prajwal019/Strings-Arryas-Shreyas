package abstraction;
interface I1{
	void deposite();
}
interface I2{
	void withdraw();}

 class A implements I1,I2 {
public void deposite() {
	System.out.println("skjdak");
}
public void withdraw() {
	System.out.println("jasdhb");
}

	public static void main(String[] args) {
		A obj=new A();
		obj.deposite();
		obj.withdraw();
	}

}
