package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {
//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
	public static void main(String[] args) {

		boolean isWeekend=false;
		// Write code to ask the user what day it is.
     String Day=   JOptionPane.showInputDialog(null,"what day is it");
		// Set the boolean isWeekend based on the value they enter
     if (Day.equals("Saturday")) {
    	 isWeekend=true;
     }
     else if (Day.equals("Sunday")) {
    	 isWeekend=true;
     }
     else {isWeekend=false;}
		
		
		// If it is the weekend, tell the user they get to sleep in.
		if (isWeekend) {
			JOptionPane.showMessageDialog(null,"You Get to sleep in Zzzzz....");
		}
		else {
		JOptionPane.showMessageDialog(null,"Sorry to break it to u but its not the weekend and get to school");
		}
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam

	String Exam=	JOptionPane.showInputDialog(null,"What percentage did u score on your last exam");
		// If they scored more than 70, they passed the exam.
	int  ExamAsSInt= Integer.parseInt(Exam);
		// Set the boolean passedExam based on their score.
		if (ExamAsSInt>70) {
			passedExam=true;
		}
		else {
			passedExam=false;
		}
		// If the user passed the exam, congratulate them
		if (passedExam) {
			JOptionPane.showMessageDialog(null,"CONGRATZ u passed the exam");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "U did not pass better luck next time");
		}
		// otherwise, wish them better luck next time.
		
	
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	}	
}
