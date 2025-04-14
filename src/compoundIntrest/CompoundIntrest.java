package compoundIntrest;
import java.util.Scanner;

public class CompoundIntrest {
	public static void main(String[] args) {
		//creating a scanner object.
		Scanner scanner = new Scanner(System.in);
		//declaring and initializing the doubles.
		
		double principle = 0;
		double rate = 0;
		//declaring and initializing the length of the loan.
		int years = 0;
		int timesCompounded = 0;
		double finalAmount = 0;
		char currency = '$';
		boolean isComplete = false;
		boolean entryValid = false;
		//requesting for CORRECT user input.
		do {
			do {
				
				do {	
					System.out.print("Please enter the principle: ");
					principle = scanner.nextDouble();
					if(principle <= 0) {
						do {
							System.out.print("Please enter a valid principle: ");
							principle = scanner.nextDouble();
							entryValid = true;
						}while(!entryValid);
					}
					else if(principle >=0) {
						entryValid = true;
					}
				
					entryValid = true;
				}while(!entryValid);
				entryValid = false;
				do {
					System.out.print("\nPlease enter the % intrest: ");
					rate = scanner.nextDouble() / 100;
					if(rate <= 0) {
						System.out.print("\nPlease enter a valid entry: ");
						rate = scanner.nextDouble() / 100;
					}
					else if(rate >= 0.01) {
						entryValid = true;
					}
				}while(!entryValid);
				entryValid = false;
				do {
					System.out.print("\nPlease enter the amount of times the intrest will be compounded: ");
					timesCompounded = scanner.nextInt();
					if(timesCompounded < 0) {
						do {
							System.out.print("\nPlease enter a valid entry: ");
							timesCompounded = scanner.nextInt();
							
						}while(!entryValid);
					}
					else if(rate >= 0) {
						entryValid = true;
					}
				}while(!entryValid);
				do {
					System.out.print("\nPlease enter the number of years: ");
					years = scanner.nextInt();
					if(years <= -1) {
						System.out.println("Please enter a valid entry: ");
						years = scanner.nextInt();
					}
					else if(years >=0) {
						entryValid = true;
					}
				}while(!entryValid);
				System.out.print("Calculating... \n");
				finalAmount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
				isComplete = true;
			}while(!entryValid);
		}while(!isComplete);
		System.out.printf("The total amount paid will be: %c% .2f", currency, finalAmount);
		scanner.close();
	}
}
