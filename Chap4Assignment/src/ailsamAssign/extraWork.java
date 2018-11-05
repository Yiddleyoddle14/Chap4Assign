package ailsamAssign;
import java.util.Scanner;
/*
 * Ailsa Mensinger
 * 10-17-18
 */

public class extraWork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int userInput = input.nextInt();
		
		if (userInput % 5 == 0) {
			System.out.print("HiFive ");
		if (userInput % 5 == 0 && userInput % 2 == 0) {
			System.out.print("Georgia");
		}
		if (userInput % 5 == 0 && userInput % 3 == 0) {
			System.out.print("Georgia");
				}
		
		}
		else if (userInput % 2 == 0 || userInput % 3 == 0) {
			System.out.println("Georgia");
		}
		
		
		
	}

}
