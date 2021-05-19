package regexpattern;

import java.util.regex.*;

import java.util.Scanner;

public class Regexpattern {
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome in Regex pattern validation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pincode");
		String pincode = sc.nextLine();
		sc.nextLine();
		String regex = "^[1-9]{1}[0-9]{2}[0-9]{3}$";
		System.out.println("The zip code is: " + pincode);
	    System.out.println("Check the pin code is correct? " + pincode.matches(regex));  
	}
}
