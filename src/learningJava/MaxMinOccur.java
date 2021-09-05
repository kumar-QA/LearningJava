package learningJava;

import java.util.HashMap;
import java.util.Map;

public class MaxMinOccur {

	public static void main(String[] args) {
//		int[] arr=new int[127];
//		String s="Iam m.prasanna kumar iam good boy";
//		s=s.replaceAll("\\s", "");
//		int maxchar=-1;
//		int minchar=1;
//		char maxch=' ';
//		char minch=' ';
//		for(int i=0;i<=s.length()-1;i++) {
//			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
//			System.out.println(arr[s.charAt(i)]);
//		}
//		for(int i=0;i<=s.length()-1;i++) {
//			if(maxchar<arr[s.charAt(i)]) {
//				maxchar=arr[s.charAt(i)];
//				maxch=s.charAt(i);
//			} 
//		}
//		for(int i=s.length()-1;i>0;i--) {
//			 
//			if(minchar>=arr[s.charAt(i)]){
//				minchar=arr[s.charAt(i)];
//				minch=s.charAt(i);
//			}
//		}
//		System.out.println("max ocuured charachter is  "+maxch);
//		System.out.println("min occured charachter is "+minch);
	
		//using map method
		
	  String s="prasanna kumar";
	  char[] c=s.toCharArray();
	  System.out.println(c);
	  HashMap<Character,Integer> hm=new HashMap<>();
		for(char ch:c) {
//			System.out.println(ch);
//			System.out.println(hm);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		int maxcount=0;
		char maxchar=' ';
		for(Map.Entry<Character,Integer> me: hm.entrySet()) {
			if(maxcount<me.getValue()) {
				maxcount=me.getValue();
				maxchar=me.getKey();
			}
		}
		System.out.println("Max Repeated character is  "+maxchar);
	}

}
