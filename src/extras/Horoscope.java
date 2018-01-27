package extras;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String starsign = JOptionPane.showInputDialog("What is your star sign?");
		if (starsign.equals("Aries")) {
			JOptionPane.showMessageDialog(null,
					"A tv show you watch today will spark your interest in the paranormal, share your thoughts with others. You have permission to watch tv without guilt today, as this is where you'll find something that inspires you and sparks your creativity.");
		} else if (starsign.equals("Taurus")) {
			JOptionPane.showMessageDialog(null,
					"When someone gets to you today you'll over react, but use this as a chance to look at why this is.");
		} else if (starsign.equals("Gemini")) {
			JOptionPane.showMessageDialog(null,
					"As The Moon enters your house in trine with Venus your successes will make someone jealous.");
		} else if (starsign.equals("Cancer")) {
			JOptionPane.showMessageDialog(null,
					"Listen to your intuition today and if a project feels wrong, check it out before you decide.");
		} else if (starsign.equals("Leo")) {
			JOptionPane.showMessageDialog(null,
					"Give someone the space they need today and show how much you care by being understanding.");
		} else if (starsign.equals("Virgo")) {
			JOptionPane.showMessageDialog(null,
					"Stop sabotaging your success by being too self critical today, let others decide your worth.");
		} else if (starsign.equals("Libra")) {
			JOptionPane.showMessageDialog(null,
					"As buried problems in your relationships are exposed today, youll have to deal with them properly.");
		} else if (starsign.equals("Scorpio")) {

		}
	}
}
