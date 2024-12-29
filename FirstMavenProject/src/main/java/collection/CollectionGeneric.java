package collection;

import java.awt.List;
import java.util.ArrayList;

public class CollectionGeneric {
	
	

	public static void main(String[] args) {
		
		ArrayList<Integer> ob=new ArrayList<Integer>();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		System.out.println(ob);
		System.out.println(ob.indexOf(20));
		System.out.println(ob.contains(50));
		System.out.println(ob.remove(3));
		System.out.println(ob);
		
		
	}

}
