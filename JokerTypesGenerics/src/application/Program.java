package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	//List<Object> doesn't work because it's not possible
	//to transform Integer in Object, but work with <?>
	public static void printList(List<?> list) {
		//list.add(3); doesn't work because the system
		//don't know what type of list this list is
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}