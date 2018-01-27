package extras;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are you happy?");
		if (happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		} else {
			String want = JOptionPane.showInputDialog("Do you want to be happy?");
			if (want.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
	}
}
