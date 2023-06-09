package entitites;

public class Grade {
	public String Name;
	public double Grade1;
	public double Grade2;
	public double Grade3;
	
	public Double FinalGrade() {
		return Grade1 + Grade2 + Grade3;
	}
	
	public double Calculo() {
		return 60 - FinalGrade();
	}
	
	public String Pass() {
		if (FinalGrade() >= 60) {
			return "PASS";
		} else {
			return "FAILED \r\nMISSING " + Calculo() + " POINTS";
		}
	}
	
	public String toString() {
		return "FINAL GRADE: "
		+ String.format("%.2f%n", FinalGrade())
		+ Pass()
		;
	}
}
