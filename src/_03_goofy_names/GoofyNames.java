package _03_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
String goof =JOptionPane.showInputDialog("ENTER NAME HERE");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
                 System.out.println(goof.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
          for (int i = 0; i < goof.length(); i++) {
			String letter =goof.substring(i,i+1);
			
			System.out.println(letter);
			
		if (i%2==0) {
		goofyName+=letter.toUpperCase();	
		}	
		else {
			goofyName+=letter.toLowerCase();	
		}	
			
		}
			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
			
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.

			
				
			
			// 6. ADD this String  (containing 1 char) to the goofyName String

		JOptionPane.showMessageDialog(null,goofyName);
		// 7. Use pop-up to show user their Goofy name

	}
}

