package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPayer;
 


public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		List <TaxPayer> list = new ArrayList<>(); 
		
		System.out.print("Enter the number of tax payers:");
		int i = sc.nextInt();
		
		for (int j=1; j<=i; j++) {
			
			System.out.print("Individual or Company (I/C)?");
			char ch = sc.next().charAt(0);
				
			System.out.println("Enter Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Enter Anual Income: ");
			Double anual = sc.nextDouble();
			
			if (ch=='i') {
				
				System.out.print("Enter Health Expenditures: ");
				Double health = sc.nextDouble();
				
				list.add (new Individual(name, anual, health));
			}
			else {
				System.out.print("Enter Number of Employee: ");
				Integer employee = sc.nextInt();
				
				list.add (new Company(name, anual, employee));
			}
			
		}
		
		double sum = 0;
		System.out.print("\nTAXES PAID\n");
		
		for (TaxPayer tx : list) {
			
			System.out.println("Name: " + tx.getName() +", Taxe" +  String.format(" %.2f",tx.tax()));
			sum += tx.tax();
			
		}
		System.out.printf("\nTotal Taxes: %.2f",sum);
		
		
		sc.close();
		
	}

}
