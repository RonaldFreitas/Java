package entities;

public class Product10 {
	private String name;
	private double grade;
	private double grade2;
	
	public Product10() {
	}
	
	public Product10(String name) {
		this.name = name;
	}

	public Product10(double grade) {
		this.grade = grade;
	}

	public Product10(double grade2, double g) {
		this.grade2 = grade2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public double getGrade2() {
		return grade2;
	}

	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}
	
	public double media(double grade, double grade2) {
		return (grade + grade2) /2;
	}
	
}
