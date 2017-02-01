/**
 * Peter Laskai
 * Purpose: This program uses recursions to find the number of characters in an array
 * Due Date: 11/24/2014
 * 
 */
import java.util.Scanner;
public class CharacterCounter
{
	public static void main(String[] args){
		System.out.println("Enter characters: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] chars = new char[s.length()];
		
		for(int i = 0; i < s.length(); i++)
		{
			chars[i] = s.charAt(i);
		}
		System.out.print("Which caracter are you looking for: ");
		char ch = scan.nextLine().charAt(0);

		System.out.println(count(chars, ch));
	}
	public static int count(char[] chars, char ch)
	{
		return count(chars, ch, chars.length - 1);
	}

	public static int count(char[] chars, char ch, int high)
	{
		if (high == -1)
		{
			return 0;
		}
		if (chars[high] == ch)
		{
			return 1 + count(chars, ch, high - 1);
		}
		return count(chars, ch, high - 1);
	}
}

/*
*PsuedCode:
*1.0 import scanner class
*2.0 ask for specific character
*3.0 go to count method
*4.0 use recursion to count how many characters of a certain letter are present
*5.0 print character count
*6.0 end
*/
/*
* Output: Enter few characters: 
a a a a a a
Enter desired character: 
a
6
*/