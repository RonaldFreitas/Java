package entities;

public class Employee implements Comparable<Employee>{

	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	//if you want to get the best salary first you have to put "-"
	//before the final number or in this case "salary.comp..."
	//like "-salary.comp..."
	
	@Override
	public int compareTo(Employee other) {
		return -salary.compareTo(other.getSalary());
	}
}
