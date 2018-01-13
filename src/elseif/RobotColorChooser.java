
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
Robot mike = new Robot();
for (int i = 0; i < 10; i++) {
	
		//3. ask the user what color they would like the robot to draw
		String usercolor = JOptionPane.showInputDialog("What color should the robot draw with?");
		String usersides = JOptionPane.showInputDialog("How many sides do you want your shape to have?");
		int numbersides = Integer.parseInt(usersides);
		//4. use an if/else statement to set the pen color that the user requested
if (usercolor.equals("red")) {
mike.setPenColor(Color.red);
}
else if (usercolor.equals("blue")) {
	mike.setPenColor(Color.blue);
}
else if(usercolor.equals("green")) {
	mike.setPenColor(Color.green);
}
        //5. if the user doesn’t enter anything, choose a random color
else {
	mike.setRandomPenColor();
}
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		mike.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
mike.setSpeed(8);
mike.penDown();
for (int j = 0; j < numbersides; j++) {

mike.move(100);
mike.turn(360/numbersides);
}
	}}
}
