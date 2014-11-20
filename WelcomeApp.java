/*
Welcome App
wagner x14112621
*/
import java.util.*;
import javax.swing.JOptionPane;

public class WelcomeApp{
	public static void main(String [] args){

	//declare variables
	String name, message;

	//declare and create objects
	Scanner keyboard = new Scanner(System.in);
	Welcome myWelcome = new Welcome();

	//input
	System.out.println("please enter your name");
	name = keyboard.nextLine();
	myWelcome.setName(name);

	myWelcome.makeMessage();


	//output
	message = myWelcome.getMessage();
	System.out.print(message);
	}
}