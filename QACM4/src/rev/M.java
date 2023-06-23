package rev;

public class M {
/*three machine are manufactured in the industry.
 * give the unique product id for each and every machine
 * manufactured automatically and serially
 */
	int pid;
 String brand;
 double price;
 static int count=1000;
 {
	 pid=count++;
 }
 M(String brand,double price){this.brand=brand;this.price=price;}
 void whasingmachine() {
	 System.out.println("wash the cloth");
 }
 void display() {
	 System.out.println("product id :"+pid);System.out.println("product brand :"+brand);System.out.println("product price :"+price);
 }
}
