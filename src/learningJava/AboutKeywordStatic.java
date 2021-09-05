package learningJava;

public class AboutKeywordStatic {

	/*
	 //Static Innerclass content
	 int i=10;//instance variable
	static int j = 20;

	static class InnerClass {
		public void display() {
//			System.out.println(+i);
			System.out.println(+j);
		}
	}
	class B {
		int k = 10;

		void display1() {
			System.out.println("class B inner calss" + k);
		}
	}
*/
	/*
	 //StaticBlock
	
	static int i=20;
	//int j=220;
	static {
		System.out.println(i);
		//System.out.println(j);
	}
	  
	 */
	
//	static void display() {
//		System.out.println("main class display method without classname calling");
//	}
	void display() {
		System.out.println("main class display method without classname calling");
	}
	class xyz{
//		static void show() {
//			System.out.println("xyz class  static show method");
//		}
		void show() {
			System.out.println("xyz class  static show method");
		}

	}
	
	
	
	public static void main(String[] args) {
		/* 
		 //Static Innerclass content
		  AboutKeywordStatic.InnerClass nested = new AboutKeywordStatic.InnerClass();
		 nested.display();
		AboutKeywordStatic mainobj = new AboutKeywordStatic();
		AboutKeywordStatic.B objOfB = mainobj.new B();
		objOfB.display1();
		 */
//		display();
//		xyz.show();
		 AboutKeywordStatic obj=new  AboutKeywordStatic();
		 obj.display();
		 xyz obj1=obj.new xyz();
		 obj1.show();

	}

}
