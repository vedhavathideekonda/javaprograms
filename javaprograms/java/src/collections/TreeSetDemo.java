package collections;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {
	public static void main(String[] args) {
		// accessed in natural oreder
		//null not allowed
		Set<String> set = new TreeSet<String>();
		set.add("a");
		set.add("c");
		set.add("b");
		set.add("c");
		System.out.println(set);
		boolean r1 =set.add("vedha");
		System.out.println(r1);
		boolean r2 =set.add("vedha");
		System.out.println(r2);
		System.out.println(set);
		set.contains("a");
	     System.out.println("present");
		set.remove("a");
		System.out.println(set);
		for(String name : set) {
			System.out.println(name);
		
	}
}
}
