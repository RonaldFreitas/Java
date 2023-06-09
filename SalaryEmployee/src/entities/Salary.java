package entities;

public class Salary {
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void increaseSalary(double percentage) {
		this.GrossSalary += GrossSalary * (percentage / 100);
	}
	
	public String toString() {
		return Name
		+ ", $ "
		+ String.format("%.2f", NetSalary());
	}
}
