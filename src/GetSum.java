/**
 * Peter Laskai
 * Purpose: This program uses recursions to find the sum of a number and all numbers preceding it
 * Due Date: 11/24/2014
 */
import java.util.Scanner;
public class GetSum 
{
	public static void main(String[] args)
	{
		int number;
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter the starting number: ");
		number = console.nextInt();
		
		System.out.println("Sum: "+Sum(number));
	}
	static int Sum(int number)
	{

		if (number > 0)
		{
			return number + Sum(number - 1);
		}
		else
		{
			return 0; 
		}
	}
}
/* Output:
Enter the starting number: 10
Sum: 55
*/
/*PsuedoCode:
 * 1.0 import a scanner class
 * 2.0 define number variable
 * 3.0 create scanner object
 * 4.0 get scanner input
 * 5.0 go to sum method
 * 6.0 use recursion to get sum of number always calling the number preceding out
 */
