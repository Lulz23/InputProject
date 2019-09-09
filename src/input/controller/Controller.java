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
		name = textScanner.nextLine();
		System.out.println("Hello! " + name + " how are you??");
	}

}