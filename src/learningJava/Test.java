package learningJava;

public class Test {
   synchronized void show() {
		System.out.println("test");
	}

}

class Xyz extends Test {
	 void show() {
		System.out.println("xyz");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.show();
		Xyz x = new Xyz();
		x.show();
	}
}
