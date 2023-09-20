/**
 * This class has two recursive methods that replaces either one or all characters in a string. It also has a main method which displays a menu so the user can do this.
 */
package assg5_motleyj21;

import java.util.Scanner;

public class StringReplaceRecursion {
	
	int j=0;
	int i=0;
	
	/**
	 * THis method recursively replaces one character in a string that the user  wants to change
	 * @param str
	 * @param oldChar
	 * @param newChar
	 * @return
	 */
	public static String replace(String str, char oldChar, char newChar) {
		if(str.length() == 0) {
			return str;
		}
		if(oldChar == str.charAt(0)) {
			return newChar + str.substring(1);
		}
		return str.charAt(0) +  replace(str.substring(1), oldChar, newChar);
	}
	
	/**
	 * This method recursively replaces all characters of the same thing in a string that the user wants to change
	 * @param str
	 * @param oldChar
	 * @param newChar
	 * @return
	 */
	public static String replaceAll(String str, char oldChar, char newChar){
		if(str.length() == 0) {
			return str;
		}
		if(oldChar == str.charAt(0)) {
			return newChar + replaceAll(str.substring(1), oldChar, newChar);
		}
		return str.charAt(0) + replaceAll(str.substring(1), oldChar, newChar);
	}
	
	/**
	 * This is the main method that displays a menu that loops until the user enters 3 the menu lets the user use the two recursive methods that i made
	 * @param args
	 */
	public static void main(String[] args) {
		
		int userInput = 0;
		String userInputString;
		char oldChar, newChar;
		
		while(userInput !=3){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Test replace method" + "\n" + "2.Test replaceAll method" + "\n" + "3.Exit");
		System.out.println("Which method would you like to test");
		userInput = sc.nextInt();
		sc.nextLine();
		
		switch(userInput) {
		case 1:
		System.out.println("Enter a String: ");
		userInputString = sc.nextLine();
		System.out.println("Enter a old Character");
		oldChar = sc.next().charAt(0);
		System.out.println("Enter a new character");
		newChar = sc.next().charAt(0);
		System.out.println("\n" + "String after replacing first character: " + replace(userInputString, oldChar, newChar));
		break;
		
		case 2:
		System.out.println("Enter a String: ");
		userInputString = sc.nextLine();
		System.out.println("Enter a old Character");
		oldChar = sc.next().charAt(0);
		System.out.println("Enter a new character");
		newChar = sc.next().charAt(0);
		System.out.println("\n" + "String after replacing all characters: " + replaceAll(userInputString, oldChar, newChar));
		break;
		
		case 3:
		System.exit(0);
		break;
		}
		}
		}
	}


