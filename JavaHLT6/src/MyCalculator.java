import java.util.Scanner;

// Write a menu driven program for Calculator. It must have + , - , * , / , % operations.
// Program design and coding by Khurshid Ahmed

public class MyCalculator {

	public static void main(String[] args) {
		
		double numberOne, numberTwo, result = 0;
		String ans;
		boolean wrongChoice = false;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println();
			System.out.println("Welcome to Java Calculator");
			System.out.println("--------------------------");
			System.out.println();
			System.out.print("Enter first number : ");
			numberOne = sc.nextDouble();
			System.out.print("Entert arithmetic operation (+ - * / %) : ");
			String choice = sc.next();
			System.out.print("Enter second number : ");
			numberTwo = sc.nextDouble();
			System.out.println();
			
			switch(choice) {
				case "+":
					result = numberOne + numberTwo;					
					break;
					
				case "-":
					result = numberOne - numberTwo;
					break;
				
				case "*":
					result = numberOne * numberTwo;
					break;
					
				case "/":
					result = numberOne / numberTwo;					
					break;
					
				case "%":
					result = numberOne % numberTwo;
					break;
					
				default:
					System.out.println("*** Choice not available ***");
					wrongChoice = true;					
			}		
			if (!wrongChoice)
				System.out.println("Result of : "+numberOne+" "+choice+" "+numberTwo+" = " + result);
			System.out.println();
			System.out.print("Do you want to continue ? (y/n) : ");
			ans = sc.next();
			
		} while(ans.equalsIgnoreCase("y"));
		sc.close();
	}

}
