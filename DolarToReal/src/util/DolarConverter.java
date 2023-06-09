package util;

public class DolarConverter {
	
	public static double Final;
	
	public static void FinalPrice(double price, double quantity ) {
		double FinalPrice = price * quantity;
		double Tax = FinalPrice * 0.06;
		Final = FinalPrice + Tax;
	}
	
	public String toString() {
		return String.format("%.2f", Final);
	}
	
}
