package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		//if don't have the methods hashcode and equals the Set will
		//compare the local in the memory of "prod" and "notebook"
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));
	}
}