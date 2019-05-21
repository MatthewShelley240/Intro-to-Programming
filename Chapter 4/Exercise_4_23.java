/*
 * Matthew Shelley
 * 5/20/2019
 * Exercise 4-23, calculates an employee's income before and after tax.
 */

import java.util.Scanner;

public class Exercise_4_23 {

	public static void main(String[] args) {
		// Prompts user for information
		Scanner input = new Scanner(System.in);
		System.out.println("What is the employee's name?");
		String name = input.next();
		System.out.println("How many hours did the employee work this week?");
		double hours = input.nextDouble();
		System.out.println("How many hours were over time?");
		double overtimeHours = input.nextDouble();
		System.out.println("What is the employee's hourly wages?");
		double wages = input.nextDouble();
		System.out.println("What is the Federal Tax withholding rate?");
		double federalTaxRate = input.nextDouble();
		System.out.println("What is the State Tax withholding rate?");
		double stateTaxRate = input.nextDouble();
		
		// Does the needed math.
		double grossPay = ((hours - overtimeHours) * wages) + (overtimeHours * (wages * 1.5));
		double federalTax = grossPay * federalTaxRate;
		double stateTax = grossPay * stateTaxRate;
		double totalDeductions = federalTax + stateTax;
		double netPay = (grossPay - stateTax - federalTax);
		
		// Displays stuff
		System.out.println("The employee " + name);
		System.out.println("worked " + hours);
		System.out.println("of which " + overtimeHours + " was overtime.");
		System.out.println(name + "'s hourly pay is $" + wages);
		System.out.println(name + "'s gross wage is $" + grossPay);
		System.out.println("Federal taxes are $" + federalTax);
		System.out.println("State taxes are $" + stateTax);
		System.out.println("The total deductions are $" + (totalDeductions));
		System.out.println(name + "'s net pay is $" + netPay);

	}

}
