import java.util.Scanner;
import java.util.Random;

public class Random_Guess {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random R=new Random();
		System.out.println("Guess a number between one and fifty");
		int number = R.nextInt(51);
		int input = sc.nextInt();
		while (input!=number) {
			if (input>number) {
				System.out.println("Too high, try again!");
			}
			if (input<number) {
				System.out.println("Too low try again!");
			}
			input = sc.nextInt();
			}
		
		System.out.println("You guessed correct! Great Job!");
	}
}
