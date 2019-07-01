package CollectionSort;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Um");
		al.add("Dois");
		al.add("Três");
		al.add("Quatro");
		al.add("Cinco");
		
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(1);
		all.add(5);
		all.add(3);
		all.add(4);
		all.add(2);
		
		Collections.sort(al);
		Collections.sort(all);
		
		System.out.println(al);
		System.out.println(all);
		
	}

}
