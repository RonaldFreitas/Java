package entities;

public class LegalPerson extends Person{
	private Integer numberOfEmployees;

	public LegalPerson(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public Double taxes() {
		if(numberOfEmployees <= 10) {
			return 0.16 * getAnualIncome();
		} else{
			return 0.14 * getAnualIncome();
		}
	}

	@Override
	public String toString() {
		return getName() +
				": $ " +
				String.format("%.2f", taxes());
	}
}
