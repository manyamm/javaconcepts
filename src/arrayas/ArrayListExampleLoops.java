package arrayas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExampleLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> animals = new ArrayList();
		
		animals.add("cow");
		animals.add("ox");
		animals.add("cat");
		animals.add("elephant");
		
		System.out.println("for loop :");
		for(int i =0; i< animals.size(); i++) {
			
			System.out.println(animals.get(i));
		}
		
		System.out.println("While Loop :");
		int i = 0;
		while(animals.size() > i) {
			
			System.out.println(animals.get(i));
			
			i++;
		}
		
		System.out.println("enhanced for loop: ");
		
		for(String display: animals) {
			System.out.println(display);
		}
		
		System.out.println("Iteraotr :");
		
		Iterator it = animals.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		//adding a element  at a particular index in ArrayList
/*		
		animals.add(2, "deer");
		System.out.println(animals);
		*/
		
	}

}
