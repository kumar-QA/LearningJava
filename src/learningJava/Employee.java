package learningJava;

public class Employee {
//	int count = 0;
	static int count =0;
/* 
 1. it initilaize only once so first time count =0 
     next time calls increment take place
*/
	void counter() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {

		Employee loop=new Employee();
		Employee loop1=new Employee();
		Employee loop2=new Employee();
		loop.counter();
		loop.counter();
		loop.counter();
//		loop1.counter();
//		loop2.counter();
	}
}
