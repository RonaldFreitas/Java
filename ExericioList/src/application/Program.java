package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		
		Integer n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id:");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer salaryIncrease = sc.nextInt();
		System.out.println();
		
		Integer pos = position(list, salaryIncrease);
		if(pos != null) {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextInt();
			list.get(pos).increaseSalary(percent);
		} else {
			System.out.println("This id doesn't exist!");
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id){
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
