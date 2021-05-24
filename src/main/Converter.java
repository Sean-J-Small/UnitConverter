package main;

import java.util.Scanner;

public class Converter {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int menuSelection = 0;
		
		//start loop and print menu, collect input
		do {
		
				menu();
				menuSelection = input.nextInt();
				
//				Switch statement to pick case based on input
				switch (menuSelection) {
				case 1:
					ozToML();
					break;
				case 2:
					cupToOz();
					break;
				case 3:
					lToML();
					break;
				case 4:
					gallonToL();
					break;
				case 5:
					quit();
					break;
				
				}
			}
	while (menuSelection != 5); 
		{
		
		input.close();
	}
		} 
	
	
		
		
	
	public static void menu() {
		System.out.println("Please select an option for conversion: \n"
				+ "1 for Ounces to Millileter \n" 
				+ "2 for Cup to Ounce \n"
				+ "3 for L to mL \n"
				+ "4 for Gallon to Liter \n"
				+ "5 to exit the converter");
	}
		

	public static float ozToML() {
		//request input
		System.out.println("Please enter amount to convert: ");
		//receive input for ounce to mL conversion
		float ounce = input.nextFloat();
		//computation, 1 oz = 29.5735296 ml
		float mL = (float)(ounce * 29.5735296);
		System.out.println(ounce + " Ounces is equal to " + mL + " milliliters." );
		return mL;
	}

	
	public static void cupToOz() {
		//request input
		System.out.println("Please enter amount to convert: ");
		float ounce;
		double cup;
//		receive input for cup to ounce conversion
		cup = input.nextFloat();
		//computation, 1 oz = 0.125 cups
		ounce = (float)(cup * 0.125);
		System.out.println(cup + " Cups is equal to " + ounce + " ounces." );
	}
//	
	public static void lToML() {
		//request input
		System.out.println("Please enter amount to convert: ");
		double liter;
		float mL;
//		receive input for L to mL conversion
		liter = input.nextFloat();
//		//computation, 1L = 1000 mL
		mL = (float)(liter * 1000);
		System.out.println(liter + " Liters is equal to " + mL + " milliliters." );
	}
//	
	public static void gallonToL() {
		//request input
		System.out.println("Please enter amount to convert: ");
		double liter;
		double gallon;
//		//receive input for gallon to liter conversion
		gallon = input.nextFloat();
//		//computation, 1 gallon = 3.785 Liters
		liter = (gallon * 3.785);
		System.out.println(gallon + " Gallons is equal to " + liter + " Liters." );
	}
	
	public static void quit() {
		System.out.println("Hope you had fun converting, Bye-Bye!");
		}

	}
	
	


