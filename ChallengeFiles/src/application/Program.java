package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		String[] lines = new String[] { "TV LED,1290.99,1", "Video Game Chair,350.50,3", "Iphone X,900.00,2", "Samsung Galaxy 9,850.00,2"};
		
		int sum = 0;
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
				sum ++;
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		String[] name = new String[sum];
		double[] price = new double[sum];
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			int sum2 = 0;
			
			while(line != null) {
				System.out.println(line);
				String[] aux = line.split(",");
				name[sum2] = aux[0];
				price[sum2] = Double.parseDouble(aux[1]) * Double.parseDouble(aux[2]);
				sum2++;
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		boolean success = new File("c:\\temp\\out").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		try(BufferedWriter bw2 = new BufferedWriter(new FileWriter( "c:\\temp\\out\\summary.csv"))) {
			String[] all = new String[sum];
			for (int i = 0; i < name.length; i++) {
				all[i] = name[i] + "," + price[i];
			}
			for (String alli : all) {
				bw2.write(alli);
				bw2.newLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
