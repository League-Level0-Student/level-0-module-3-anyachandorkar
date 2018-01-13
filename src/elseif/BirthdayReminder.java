
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 13th";
		String dadsBirthday = "March 4th";
		String myBirthday = "February 14th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String userbirth = JOptionPane.showInputDialog("Which birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(userbirth);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (userbirth.equals("mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (userbirth.equals("dad")){
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if (userbirth.equals("yours")) {
			System.out.println(myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry I don't remember that person's birthday");
		}
	} 
}
