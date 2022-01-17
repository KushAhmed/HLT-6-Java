import java.util.Scanner;

// Write a program to display all numbers divisible by 3 and 5

public class DivisibleBy3and5 {

	public static void main(String[] args) {
		// Solutions : 1. Ask user for max number range 0 up to ? (user range)
		//             2. Display only numbers divisible by 3 and 5 within user range
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Display all numbers divisible by 3 and 5");
		System.out.println("----------------------------------------");
		System.out.print("Please enter maximum Number for the range : ");
		int range = scanner.nextInt();
		System.out.println();
		for (int i = 1; i <= range; i++) {		
			if (i % 5 == 0 && i % 3 == 0)
				System.out.println(i);
		}
		scanner.close();

	}

}
