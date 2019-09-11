package input.controller;//Says where we are in project

import java.util.Scanner;
public class Controller
{
	private Scanner textScanner; //Declaration of the Scanner instance
//Can't use yet


	public Controller() // Constructor - It's job is to initialize variables
	{
		textScanner = new Scanner(System.in);
		
	}

	public void start()
	{
		System.out.println("Type in your name!");
		String name = "";
		String age = ""; 
		name = textScanner.nextLine();
		System.out.println("Hello! " + name + " how are you??");
		System.out.println("Please type in some words");
		name = textScanner.next();
		System.out.println("You typed in: " + name);
		System.out.println("Type in your age!");
		
		 age = textScanner.next();
		 System.out.println("You are " + age + " years old?");
	}
	
}