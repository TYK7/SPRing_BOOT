package first;


 class One
 {
	 public static void print()
	 {
		 System.out.println("1");
	 }
 }
 class Two extends One
 {
	 public static void print()
	 {
		 System.out.println("2");
	 }
 }
public class Testing {
	public static void main(String[] args) {
		One o= new Two();
		o.print();
	}

}
