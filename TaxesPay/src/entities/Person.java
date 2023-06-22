package entities;

public abstract class Person {
	private String name;
	private Double AnualIncome;
	
	public Person(String name, Double anualIncome) {
		super();
		this.name = name;
		AnualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return AnualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		AnualIncome = anualIncome;
	}
	
	public abstract Double taxes();
	
	public abstract String toString();
}
