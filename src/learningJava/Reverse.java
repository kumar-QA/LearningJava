package learningJava;

public class Reverse {

	
	public static void main(String[] args) {
//	StringBuilder Name= new StringBuilder("Prasanna");
//	StringBuilder rev=new StringBuilder();
//	rev=Name.reverse();
//	System.out.println("Name ="+Name);
//	System.out.println("ReverseName = "+rev);
		
		
//		String name="kumar";
//		StringBuffer rev=new StringBuffer(); 
//		char[] ch=name.toCharArray();
//		System.out.println("Name  "+name);
//		for(int i=ch.length-1;i>=0;i--) {
//
//			rev=rev.append(ch[i]);
//		}
//		System.out.println("Reverse String  "+rev);
		
//		String name="prasanna";
		String name="101";
		String rev="";
		for(int i =name.length()-1;i>=0;i--){
			rev=rev+name.charAt(i);
			}
		
		System.out.println("Name  :"+name);
		System.out.println("Reverse Name "+rev);
	
		if(name.equals(rev)) {
			System.out.println("given string is polindrom");
		}else {
			System.out.println("given string is Not a polindrom");
		}
		
	}
}
