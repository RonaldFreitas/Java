package entities;

public class PhysicalPerson extends Person{
	private Double healthExpenditures;

	public PhysicalPerson(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double taxes() {
		if(getAnualIncome() < 20000.00) {
			return (0.15 * getAnualIncome()) - (healthExpenditures * 0.5);
		} else{
			return (0.25 * getAnualIncome()) - (healthExpenditures * 0.5);
		}
	}

	@Override
	public String toString() {
		return getName() +
				": $ " +
				String.format("%.2f", taxes());
	}
}
