package learningJava;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList();
		li.add(10);
		li.add(20);
		li.add(40);
//		ListIterator lt=li.listIterator();
////		ListIterator lt=li.listIterator(1);
//		while(lt.hasNext()) {
//			System.out.println(lt.next());
//		}
//		int size = li.size();
//		for(int i=0;i<size;i++) {
//			int element=li.get(i);
//			System.out.println(element);
//		}
		
		for(int list:li) {
			System.out.println(list);
		}

	}

}
