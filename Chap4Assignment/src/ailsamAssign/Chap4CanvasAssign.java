package ailsamAssign;
import java.util.Scanner;
/*
 * Ailsa Mensinger
 * 10-15-18
 */

public class Chap4CanvasAssign {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.");
		System.out.println("Enter today's day as an integer");
		int today = input.nextInt();
		System.out.println("Enter the number of days elapsed since today.");
		int elapsedDays = input.nextInt();
		int futureDay;
		
		
		
		String nameForToday = null;
		if (today == 0) {
			nameForToday = "Sunday";
			}
		else if (today == 1) {
			nameForToday = "Monday";
		}
		else if (today == 2) {
			nameForToday = "Tuesday";
		}
		else if (today == 3) {
			nameForToday = "Wednesday";
		}
		else if (today == 4) {
			nameForToday = "Thursday";
		}
		else if (today == 5) {
			nameForToday = "Friday";
		}
		else if (today == 6) {
			nameForToday = "Saturday";
		}
			
		futureDay = (today + elapsedDays) % 7;
		String nameForFutureDay = null;
		if (futureDay == 0) {
			nameForFutureDay = "Sunday";
		}
		else if (futureDay == 1) {
			nameForFutureDay = "Monday";
		}
		else if (futureDay == 2) {
			nameForFutureDay = "Tuesday";
		}
		else if (futureDay == 3) {
			nameForFutureDay = "Wednesday";
		}
		else if (futureDay == 4) {
			nameForFutureDay = "Thursday";
		}
		else if (futureDay == 5) {
			nameForFutureDay = "Friday";
		}
		else if (futureDay == 6) {
			nameForFutureDay = "Saturday";
		}
		
		System.out.println("Today is " +nameForToday+ " and the future day is " +nameForFutureDay);
		
		
		
		System.out.println();
		
		System.out.println("2.");
		System.out.println("Enter 3 integers");
		int one = input.nextInt();
		int two = input.nextInt();
		int three = input.nextInt();
		
		if (one > two && two > three) {
			System.out.println(three + ", " + two + ", " + one);
		}
		else if (three > two && two > one) {
			System.out.println(one+ ", " +two+ ", " +three);
		}
		else if (three > one && two > three) {
			System.out.println(one+ ", " +three+ ", " +two);
		}
		else if (one > three && two > one) {
			System.out.println(three+ ", " +one+ ", " +two);
		}
		else if (three > two && one > three) {
			System.out.println(two+ ", " +three+ ", " +one);
		}
		else if (one > two && three > one) {
			System.out.println(two+ ", " +one+ ", " +three);
		}
		
		System.out.println();
		
		System.out.println("3.");
		System.out.println("Enter a three-digit integer");
		int user_number = input.nextInt();
		
		int user_numberDigit1 = user_number / 100;
		int user_numberDigit2 = user_number % 100;
		user_numberDigit2 = user_numberDigit2 / 10;
		int user_numberDigit3 = user_number % 10;
		
		if (user_numberDigit1 == user_numberDigit3) {
			System.out.println(user_number + " is a palindrome");
		}
		else {
			System.out.println(user_number + " is not a palindrome");
		}
		
		System.out.println();
		
		System.out.println("4.");
		
		
		System.out.println("Enter your guess as an integer, heads = 0 and tails = 1");
		int guess = input.nextInt();
		
		int random = (int)(Math.random()*2);
		
		if (guess == random) {
			System.out.println("Correct!");
			
		}
		else {
			System.out.println("Incorrect!"); 
		}
		
		System.out.println();
		
		System.out.println("5.");
		
		System.out.println("Enter scissors (0), rock (1), or paper (2)"); 
		int userInput = input.nextInt();
		
		int random2 = (int)(Math.random()*3);
		String playerPlay = "";
		String compPlay= "";
		switch (random2) {
		case 0:
		 compPlay = " Computer = Scissors ";
		break;
		case 1:
			 compPlay = " Computer = Rock ";
			 break;
		case 2:
			compPlay = " Computer = Paper ";
			break;
			
			
			
		}
		switch (userInput) {
		case 0:
		 playerPlay = " Player = Scissors ";
		break;
		case 1:
			 playerPlay = " Player = Rock ";
			 break;
		case 2:
			playerPlay = " Player = Paper ";
			break;
			
			
			
		}
		if (userInput == random2) {
			System.out.println(compPlay+ playerPlay+ "Draw!");
		}
		else if (userInput == 0  && random2 == 2) {
			System.out.println(compPlay+ playerPlay+"You won!"); 
		}
		else if (userInput == 1 && random2 ==0) {
			System.out.println(compPlay+ playerPlay+"You won!");
		}
		else if (userInput == 2 && random2 == 1) {
			System.out.println(compPlay+ playerPlay+"You won!");
		}
		else {
			System.out.println(compPlay+ playerPlay+"You lost!");
		}
		
		}
		
	}
	
		
		

		


