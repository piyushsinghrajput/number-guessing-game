import java.util.Scanner;

public class game {
	// number guessing game
	public static void
	guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);

		// Generate the random numbers
		int number = 1 + (int)(100 * Math.random());

		// Given N trials
		int N = 5;

		int i, guess;

		System.out.println("A number is chosen" + " between 1 to 100."+ "Guess the number"+ " within 5 trials.");

		// Iterate over N Trials
		for (i = 0; i < N; i++) {

			System.out.println(
				"Guess the number:");

			// Take input for guessing
			guess = sc.nextInt();

			// If the number is guessed
			if (number == guess) {
				System.out.println("Congratulations!"+ " You guessed the number.");
				break;
			}
			else if (number > guess
					&& i != N - 1) {
				System.out.println("The number is "+ "greater than " + guess);
			}
			else if (number < guess
					&& i != N - 1) {
				System.out.println("The number is"+ " less than " + guess);
			}
		}

		if (i == N) {
			System.out.println("You have exhausted"+ " Total trials.");

			System.out.println(
				"The number was " + number);
		}
	}

	// Driver Code
	public static void
	main(String arg[])
	{

		// Function Call
		guessingNumberGame();
	}
}
