package ailsamAssign;
import java.util.Scanner;

public class money_conversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the exchange rate from dollars to RMB");
		double exchangeRate = input.nextDouble();
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa");
		int userInput = input.nextInt();

		if (userInput == 0) {
			System.out.println("Enter the amount of dollars");
			double dollars = input.nextDouble();
			double rmb = dollars*exchangeRate;
			System.out.println("$" +dollars+ " is " +rmb+ " Yuan");
			
		}   
		else if (userInput == 1) {
			System.out.println("Enter the amount of RMB");
			double rmb = input.nextDouble();
			double dollars = rmb / exchangeRate;
			System.out.println(rmb+ " Yuan is $" +dollars); 
		}
		

	}

}
