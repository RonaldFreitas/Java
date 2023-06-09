package entities;

public class Product4 {
	private int number;

	public Product4(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString() {
		return String.format("%.2f", number);
	}
}
