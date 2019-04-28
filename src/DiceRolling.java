import java.util.Random;
import java.util.Scanner;

public class DiceRolling {

	public static void main(String[] args) {
		int diceSides;
		char userContinue;

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!" + "\n");

		int i = 1;
		while (i > 0) {
			System.out.print("How many sides should the dice have? ");
			diceSides = scan.nextInt();
			System.out.println("\n" + "Roll: " + i);
			System.out.println(generateRandomDieRoll(diceSides));
			System.out.println(generateRandomDieRoll(diceSides));
			System.out.print("\n" + "Roll again? (y/n) ");
			userContinue = scan.next().charAt(0);
		
			if (keepPlaying(userContinue) == true) {
				++i;
			} else {
				System.out.println("Thanks for playing!");
				break;
			}
		} 
		scan.close();
	}
	
	public static int generateRandomDieRoll(int sides) {
		Random r = new Random();
		int roll = r.nextInt(sides) + 1; // +1 because r object can choose 0, and no die has 0 sides
		return roll;
	}

	public static boolean keepPlaying(char char1) {
		if ((char1 == 'y') || (char1 == 'Y')) {
			return true;
		} else {
			return false;
		}
	}
	
}
