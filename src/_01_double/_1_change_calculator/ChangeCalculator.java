package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String Input = JOptionPane.showInputDialog(null,"Hey how many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int nickels=Integer.parseInt(Input);
		// Ask the user how many dimes they have, and convert their answer
 Input = JOptionPane.showInputDialog(null,"Hey how many dimes do you have?");
		// Ask the user how many quarters they have, and convert their answer
int dimes=Integer.parseInt(Input);
		// Calculate how much money the user has.  Hint: Use a double variable 
nickels=nickels*5; 
dimes=dimes*10;
 Input = JOptionPane.showInputDialog(null,"Hey how many quarters do you have?");
 int quarters=Integer.parseInt(Input);
 quarters=quarters*25;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
int cents=nickels+dimes+quarters;
double money=cents/100;
JOptionPane.showMessageDialog(null,"Hey Just wanted to say you have $"+money);}
}

