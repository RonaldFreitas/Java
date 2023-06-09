package entities;

public class Product3 {
	private String name;
	private int age;
	private double height;

	public Product3(String name) {
		this.name = name;
	}

	public Product3(int age) {
		this.age = age;
	}

	public Product3(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	} 

}
