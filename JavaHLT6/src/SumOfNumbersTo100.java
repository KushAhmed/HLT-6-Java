// Write a program to calculate sum of numbers between 1 to 100

public class SumOfNumbersTo100 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {		
			sum = sum + i;
		}
		System.out.println("Sum of numbers between 1 to 100 is : "+sum);
	}

}
