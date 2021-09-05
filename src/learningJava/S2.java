package learningJava;

public class S2 {

	  void m(S2 obj){  
		  System.out.println("method is invoked");
//		 obj.p();
		  }  
		  void p(){  
		  m(this); 
		  System.out.println();
		  }  
		 void test(){
			 System.out.println("tested");
			 };
		  public static void main(String args[]){  
		  S2 s1 = new S2();  
		  s1.p();  
		  }  
}
