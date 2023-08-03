package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		//Covariance 
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
		//you can't do this:
		//list.add(20);
		
		
		
		//Contravariace
		List<Object> myObjs = new ArrayList<>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
		//you can't do this:
		//Number x = myNums.get(0);
		
		
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<String> myStrings = Arrays.asList("Maria", "Bob", "Alex");
		List<Object> myObjs2 = new ArrayList<>();
		
		copy(myInts, myObjs2);
		printList(myObjs2);
		copy(myDoubles, myObjs2);
		printList(myObjs2);
		copy(myStrings, myObjs2);
		printList(myObjs2);
	}
	
	public static void copy(List<? extends Object> source, List<? super Object> destiny) {
		for (Object obj2 : source) {
			destiny.add(obj2);
		}
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
