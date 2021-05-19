package regexpattern;

import java.util.regex.*;

import java.util.Scanner;

public class Regexpattern {
	String pincode;
	public static void pincode()
	{
		System.out.println("Welcome in Regex pattern validation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pincode");
		String pincode = sc.nextLine();
		sc.nextLine();
		String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		System.out.println("The zip code is: " + pincode);
	    System.out.println("Check the pin code is correct? " + pincode.matches(regex)); 
	}
	public static void email()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email");
		String email = sc.nextLine();
		sc.nextLine();
		String regex = "^[abc](.+)[A-Za-z+_.-]+@[bridgelabz](.+)[co](.+)[A-Za-z]$";
		System.out.println("The email is: " + email);
	    System.out.println("Check the email is correct? " + email.matches(regex));
		
	}
	public static void main(String[] args) 
	{
		pincode();
		email();
	}
}
