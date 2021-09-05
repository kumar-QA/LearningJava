package learningJava;

public class Overloadingcases {

	void show(int a) {System.out.println("int method");}
//	void show(float a) {System.out.println("float method");}
//	void show(double a) {System.out.println("double method");}
//	void show(long a) {System.out.println("long method");}
//	void show(String a) {System.out.println("String method");}
//	void show(byte a) {System.out.println("byte method");}
//	void show(short a) {System.out.println("short method");}
	
	void show(Object a) {System.out.println("Object method");}
	
	public static void main(String[] args) {
		Overloadingcases c1=new Overloadingcases();
//		c1.show(100);
		c1.show("abc");
		
	}
}
