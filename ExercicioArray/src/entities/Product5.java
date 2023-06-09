package entities;

public class Product5 { //esse é o exercicio 6
	 private int number;
	 private int number2;
	 
	 public Product5() {
		}
	
	 public Product5(int number) {
		this.number = number;
	}

	public Product5(double number2) {
		this.number2 = (int)number2;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	public int sum(int number, int number2) {
		return number + number2;
	}
	 
}
