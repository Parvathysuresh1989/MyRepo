package collection;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("hello");
		obj.add("Welcome");
		obj.add("hai");
		ArrayList<String> ob=new ArrayList<String>();
		ob.add("abc");
		ob.add("are");
		ob.add("def");
		//System.out.println(obj.addAll(ob));
		obj.addAll(ob);// to add all values to a single collection list
		System.out.println(obj);
		System.out.println(obj.contains("sss"));// to check if it contains the given word
		System.out.println(obj.get(0));//to check if given value is there
		System.out.println(ob.isEmpty());
		obj.remove(1);
		System.out.println(obj);
		System.out.println(obj.size());
		
		

	}

}
