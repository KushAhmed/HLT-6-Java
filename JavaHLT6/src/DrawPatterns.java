/* Write a program to create following pattern
 
 * * * *
 * * * 
 * * 
 *  
 
 */

public class DrawPatterns {

	public static void main(String[] args) {
		
		for (int i = 4 - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++)
				System.out.print("*" + " ");
			System.out.println();
			
		}
			
				
	}

}
